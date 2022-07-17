import java.text.NumberFormat;
import java.util.Scanner;

public class Test12 {

    public static void main(String[] args) {
        double count=0;
        for (int i=0;i<10;i++){
            System.out.print("请输入第"+(i+1)+"个顾客的年龄");
            int age=new Scanner(System.in).nextInt();
            if (age<0 || age>180){
                System.out.println("您的输入有误，请重新输入");
                i--;
            }else {
                if (age>=30){
                    count++;
                }
            }
        }
        //获取格式化对象
        NumberFormat nt = NumberFormat.getPercentInstance();
        //设置百分数精确度2即保留两位小数
        nt.setMinimumFractionDigits(2);
        System.out.println("年龄超过30岁的比例"+nt.format(count/10));

        System.out.println("年龄小于30岁的比例"+nt.format((10-count)/10));
    }


}
