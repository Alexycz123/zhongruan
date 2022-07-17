import java.util.Scanner;

public class Role {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void show(){

        System.out.println(name+"\t"+age);
    }

    public Role(){

    }
    public Role(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean login(){
        boolean flag=false;
        for (int i=0;i<3;i++){
            System.out.print("请输入用户名：");
            String username=new Scanner(System.in).nextLine();
            System.out.print("请输入密  码：");
            String password=new Scanner(System.in).nextLine();
            if (username.equals(name)&&password.equals("123456")) {
                    System.out.println("欢迎登录");
                    flag = true;
                    break;
                }

            System.out.println("用户名或密码错误，请重新输入，你还有"+(2-i)+"次机会");
            break;

        }
        return flag;


    }
}
