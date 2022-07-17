import java.util.Scanner;

public class Test8 {

    public static void main(String[] args) {

        System.out.println("请输入有多少万");
        int money=new Scanner(System.in).nextInt();
        if (money>500){
            System.out.println("我要买宾利");
        }else if (money>100){
            System.out.println("我要买奔驰");
        }else if (money>50){
            System.out.println("我要买奥迪");
        }else if(money>10){
            System.out.println("我要买雪佛兰");
        }else if (money<=10){
            System.out.println("我买桑塔纳");
        }else {
            System.out.println("您的输入有误");
        }


    }



}
