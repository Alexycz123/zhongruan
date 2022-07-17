import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("请输入第一个整数");
        int num1=new Scanner(System.in).nextInt();
        System.out.println("请输入第二个整数");
        int num2=new Scanner(System.in).nextInt();
        System.out.println(((num1%num2==0) || (num1+num2>1000))?(num1):(num2));

    }
}
