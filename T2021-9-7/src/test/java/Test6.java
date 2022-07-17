import java.util.Scanner;

public class Test6 {

    public static void main(String[] args) {

        mylood:while (true){
            System.out.print("请输入用户名");
            String username=new Scanner(System.in).nextLine();
            System.out.print("请输入密码");
            String password=new Scanner(System.in).nextLine();
            while (username.equals("admin") && password.equals("123456")){
                System.out.print("请输入新密码");
                String newPassword=new Scanner(System.in).next();
                System.out.print("请再次输入新密码");
                String newPassword2=new Scanner(System.in).next();
                if (newPassword.equals(newPassword2)){
                    System.out.println("修改成功，你的新密码是"+newPassword2);
                    break mylood;
                }else {
                    System.out.println("两次密码不一致，请重新输入");
                    continue;
                }
            }
            if (!username.equals("admin") || !password.equals("123456")){
                System.out.println("用户名或密码输入有误,请重新输入");
                continue;
            }


        }


    }


}
