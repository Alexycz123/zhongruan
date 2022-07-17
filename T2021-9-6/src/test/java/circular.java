import java.util.Scanner;

public class circular {

    public static void main(String[] args) {
        System.out.println("请输入一个数字，计算其面积");
        double r=new Scanner(System.in).nextDouble();

        System.out.println(Math.PI*r*r);

    }
}
