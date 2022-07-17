import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        String str =AppContant.STRING_ROLES;

        String[] strings = str.split("\\|");
        System.out.println(strings.length);

        Role[] roles=new Role[strings.length];
        System.out.println(Arrays.toString(strings));

        for (int i = 0; i < strings.length; i++) {
            String[] str2 = strings[i].split(",");
            int age=Integer.parseInt(str2[1]);
          //  System.out.println(age);
            Role role=new Role(str2[0],age);

                roles[i]=role;

           // System.out.println();
        }


        System.out.println("姓名" + "\t\t" + "年龄");
        for (Role role : roles) {
            role.show();
        }

//        loginMethod(roles);
        for (int i = 0; i < roles.length; i++) {
            boolean flag=roles[i].login();
            if (flag){
                break;
            }
        }

//        7.获得所有角色的姓氏  并控制台打印输出

        for (int i = 0; i < roles.length; i++) {

            System.out.println("第"+(i+1)+"角色的姓为："+roles[i].getName().charAt(0));
        }

    }

    /**
     *
     *         6.完成数组初始化的基础上 定义一个方法  实现角色登录  账户 name 密码: 123456
     *          登录成功   显示欢迎信息
     *          登录失败   给出提示信息  一共给三次登录机会
     */
    public static void  loginMethod(Role[] roles){
        boolean flag=false;
        for (int i=0;i<3;i++){
            System.out.print("请输入用户名：");
            String username=new Scanner(System.in).nextLine();
            System.out.print("请输入密  码：");
            String password=new Scanner(System.in).nextLine();

            for (int j = 0; j < roles.length; j++) {
                if (username.equals(roles[j].getName())&&password.equals("123456")){
                    System.out.println("欢迎登录");
                    flag=true;
                    break;
                }
            }
            if (!flag){
                System.out.println("用户名或密码错误，请重新输入，你还有"+(2-i)+"次机会");
            }else {
                break;
            }

        }
    }
}
