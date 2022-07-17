import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        System.out.println("请输入直角三角形的行数");
        int num=new Scanner(System.in).nextInt();
        for (int i=1;i<=num;i++){
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
