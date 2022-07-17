import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        System.out.println("请输入你的名次");
        int score=new Scanner(System.in).nextInt();

        switch (score){
            case 1:
                System.out.println("参加麻省理工组织的1个月夏令营");
                break;
            case 2:
                System.out.println("将奖励惠普笔记本电脑一部");
                break;
            case 3:
                System.out.println("将奖励移动硬盘一个");
                break;
            default:
                System.out.println("不给奖励");
        }




    }
}
