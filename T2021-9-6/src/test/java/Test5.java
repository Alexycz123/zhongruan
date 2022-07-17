import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        double[] arr=new double[5];
        for (int i=0;i<arr.length;i++){
            System.out.println("请输入第"+(i+1)+"个的购物金额");
            double num=new Scanner(System.in).nextDouble();
            arr[i]=num;
        }

        System.out.println("序号"+"\t\t"+"金额(元)");
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1)+"\t\t"+arr[i]);
            sum+=arr[i];
            if (i==arr.length-1){
                System.out.println("总金额"+"\t\t"+sum);
            }
        }
    }
}
