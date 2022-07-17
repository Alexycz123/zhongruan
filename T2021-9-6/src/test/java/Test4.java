import org.junit.Test;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
        System.out.println("请输入一个数");
        int i=new Scanner(System.in).nextInt();
        int qian=i/1000;
        int bai=i/100%10;
        int shi=i/10%10;
        int ge=i%10;
        System.out.println("千位上的数为："+qian);
        System.out.println("百位上的数为："+bai);
        System.out.println("十位上的数为："+shi);
        System.out.println("个位上的数为："+ge);
        System.out.println("之和为"+(qian+bai+shi+ge));
    }

    @Test
    public void bianli(){
        String[] arr={"NIKE背包","adidas运动衫","李宁运动鞋","Kappa外套","361腰包"};

        for (String s : arr) {
            System.out.println(s);
        }

    }

}
