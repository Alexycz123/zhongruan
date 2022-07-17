import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        System.out.println("请输入消费的金额");
        double money=new Scanner(System.in).nextDouble();

        System.out.println("是否参加换购活动：");
        System.out.println("1、满50，加两元换购可以一瓶");
        System.out.println("2、满100元，加10元换购5公斤面粉");
        System.out.println("3、满200元，加10元换购1个苏泊尔炒菜锅");
        System.out.println("4、满200元，加20元欧莱雅爽肤水1瓶");
        System.out.println("0、不换购");
        System.out.print("请选择");
        while (true){
            int num=new Scanner(System.in).nextInt();
            switch (num){

                case 1:if (money>=50){
                    money+=2;
                    System.out.println("成功换购1瓶可乐");
                }else {
                    System.out.println("您未满50元，请重新输入");
                    continue;
                }break;
                case 2:if (money>=100){
                    money+=10;
                    System.out.println("成功换购5公斤面粉");
                }else {
                    System.out.println("您未满100元，请重新输入");
                    continue;
                }break;
                case 3:if (money>=200){
                    money+=10;
                    System.out.println("成功换购苏泊尔炒菜锅");
                }else {
                    System.out.println("您未满100元，请重新输入");
                    continue;
                }break;
                case 4:if (money>=200){
                    money+=20;
                    System.out.println("成功换购欧莱雅爽肤水");
                }else {
                    System.out.println("您未满50元，请重新输入");
                    continue;
                }break;
                default:
                    System.out.println("你的输入有误，请重新输入");
                    continue;
            }
            break;
        }
        System.out.println("本次消费"+money);

    }



}
