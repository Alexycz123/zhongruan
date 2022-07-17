import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        System.out.println("请输入顾客的年龄");
        int age=new Scanner(System.in).nextInt();

        if (age>=61){
            System.out.println("票价为40");
        }else if (age>19){
            System.out.println("票价为80.0");
        }else if(age>0){
            System.out.println("票价为20.0");
        }else {
            System.out.println("错误");
        }


    }
}
