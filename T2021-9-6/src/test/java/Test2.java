import com.ycz.pojo.User;
import org.junit.Test;

import java.io.Serializable;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "评委的分数");
            int score = scanner.nextInt();

            /**
             * 这个是与前面几个评委都不一样的分数
             */
            for (int j : arr) {
                if (score == j) {
                    System.out.println("你的输入与前一位评委的输入相同，请重新输入");
                    i--;
                    break;
                }
            }
            if (score >= 0 && score <= 100) {
                arr[i] = score;
            } else {
                System.out.println("重新输入");
                i--;
            }
        }

        double[] ints = MaxAndMin(arr);
        System.out.println("最大值" + ints[0]);
        System.out.println("最小值" + ints[1]);
        System.out.println("平均值" + ints[2]);
    }

    public static double[] MaxAndMin(int[] array) {

        double[] ints = new double[3];
        int maxNumber = array[0];
        int minNumber = array[0];
        double sum = 0;


        for (int i = 0; i < array.length; i++) {
            if (maxNumber < array[i]) {
                maxNumber = array[i];
            }
            if (minNumber > array[i]) {
                minNumber = array[i];
            }
            sum += array[i];
        }
        sum = sum - maxNumber - minNumber;
        sum = ( sum / (array.length - 2));
        ints[0] = maxNumber;
        ints[1] = minNumber;
        ints[2] = sum;
        return ints;
    }

    @Test
    public void resume(){

        User ycz=new User();
        ycz.setName("杨超镇").
                setAge(22).
                setEmail("524288597@qq.com").
                setSex("男").
                setPhone("13249885785").
                setLearningExperience("springboot springcloud layui mybatis-plus").
                setProjectExperience("layui and springcloud and thymeleaf").
                setMajorCourses("java javaweb javaEE").setQq("524288597").setWx("13249885785");
        System.out.println(ycz);
    }

    @Test
     public  void test2(){

        System.out.println("姓名：杨超镇，身份证号：440981199911033218，年龄：22，大学：广东科技学院，专业：软件工程");

    }


}
