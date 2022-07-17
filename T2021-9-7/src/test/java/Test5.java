import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        while (true){
            System.out.print("请输入用户名：");
            String username=new Scanner(System.in).nextLine();
            System.out.print("请输入密码：");
            String password=new Scanner(System.in).nextLine();
            System.out.print("请再次输入密码：");
            String password2=new Scanner(System.in).nextLine();
            if (username.length()<3){
                System.out.println("用户名不能小于3");
                continue;
            }
            if (password.length()<6){
                System.out.println("密码不能小于6");
                continue;
            }
            if (!password.equals(password2)){
                System.out.println("两次密码不一致，请重新输入");
                continue;
            }else {
                System.out.println("注册成功");
                break;
            }


        }



    }
}
