import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        System.out.println("请输入学生成绩");
        int score=new Scanner(System.in).nextInt();

        switch (score/10){
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
            case 7:
            case 6:
                System.out.println("B");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("C");
                break;
            default:
                System.out.println("错误");

        }




    }
}
