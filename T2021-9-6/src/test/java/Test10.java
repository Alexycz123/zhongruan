import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {

        System.out.println("请输入会员积分");
        int score=new Scanner(System.in).nextInt();

        if (score>=8000){
            System.out.println("该会员享受的折扣是"+0.6);
        }else if(score>=4000){
            System.out.println("该会员享受的折扣是"+0.7);
        }else if(score>=2000){
            System.out.println("该会员享受的折扣是"+0.8);
        }else if(score>0){
            System.out.println("该会员享受的折扣是"+0.9);
        }else {
            System.out.println("错误");
        }

    }
}
