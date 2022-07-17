import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        double sum=0;
        System.out.println("*****************************");
        System.out.println("请选择购买的商品编号");
        System.out.println("1.T恤 2、网球鞋 3、网球拍");
        System.out.println("*****************************");
        double T=245;
        double Shore=570;
        double Tennis=200;
        while (true){
            System.out.print("请选择商品编号");
            int num=new Scanner(System.in).nextInt();
            if (num<0 || num>3){
                System.out.println("你的输入有误，请重新输入");
                continue;
            }
            System.out.print("请选择购买的数量");
            int quantity=new Scanner(System.in).nextInt();
            if (quantity<0){
                System.out.println("你的输入有误，请重新输入");
                continue;
            }
            if (num==1){
                sum+=T*quantity;
                System.out.println("T 恤 ￥"+T+"数量为\t"+quantity+"合计为"+sum);
            }else if (num==2){
                sum+=Shore*quantity;
                System.out.println("网球鞋 ￥"+Shore+"数量为\t"+quantity+"合计为"+sum);
            }else if (num==3){
                sum+=Tennis*quantity;
                System.out.println("网球拍 ￥"+Tennis+"数量为\t"+quantity+"合计为"+sum);
            }
            System.out.println("是否继续（y/n)");
            String choice=new Scanner(System.in).next();
            if (choice.equals("Y") || choice.equals("y")){
                continue;
            }else if (choice.equals("n") || choice.equals("N")){
                System.out.println("总金额为"+sum);
                System.out.println("折扣为"+0.8);
                System.out.println("应付"+sum*0.8);
                System.out.println("你付多少钱");
                double money=new Scanner(System.in).nextDouble();
                System.out.println("找零"+(money-(sum*0.8)));
                break;
            }

        }




    }






}
