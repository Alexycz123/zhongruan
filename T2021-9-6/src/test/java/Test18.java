import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {

        System.out.println("欢迎使用");


        while (true){
            System.out.println("输入天气");
            String weather=new Scanner(System.in).next();
            if (weather.equals("H")||weather.equals("h")){
                System.out.println("炎热");
            }else if(weather.equals("D")||weather.equals("d")){
                System.out.println("干燥");
            }else if (weather.equals("M")||weather.equals("m")){
                System.out.println("潮湿");
            }else if (weather.equals("R")||weather.equals("r")){
                System.out.println("下雨");
            }else {
                System.out.println("你的输入有误，请重新输入");
                continue;
            }
            System.out.println("是否继续（y/n)");
            String choice=new Scanner(System.in).next();
            if (choice.equals("Y") || choice.equals("y")){
                continue;
            }else if (choice.equals("n") || choice.equals("N")){
                System.out.println("退出系统");
                break;
            }



        }


    }


}
