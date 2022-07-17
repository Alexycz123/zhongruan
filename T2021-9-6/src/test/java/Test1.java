import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
    @Test
    public void test1(){

        int[] arr=new int[8];
        for (int i=0;i<arr.length;i++){
            arr[i]=new Random().nextInt(65-23)+23;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("请输入一个数字");
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        for(int i=0;i<arr.length;i++){
            if (arr[i]==num){
                System.out.println("位置在"+i);
            }else {
                System.out.println("不存在");
            }
        }

    }

    public static void main(String[] args) {
        int[] arr=new int[8];
        for (int i=0;i<arr.length;i++){
            arr[i]=new Random().nextInt(65-23)+23;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("请输入一个数字");
        Scanner scanner=new Scanner(System.in);
        boolean flag = false;
        int address = -1;
        int num= scanner.nextInt();
        for(int i=0;i<arr.length;i++){
            if (arr[i]==num){
                flag=true;
                address=i;
                //System.out.println("位置在"+i);
                break;
            }
        }
        if (!flag){
            System.out.println("不存在");
        }else {
            System.out.println(address);
        }

    }

    @Test
    public void test2(){
        char[] chars=new char[62];
        int i=0;
        for (char startChar='A';startChar<='Z';startChar++){
            chars[i]=startChar;
            i++;
        }
        for (char startChar='a';startChar<='z';startChar++){
            chars[i]=startChar;
            i++;
        }
        for (char startChar='0';startChar<='9';startChar++){
            chars[i]=startChar;
            i++;
        }
        System.out.println(chars);

        int[] array=random3(0,62,8);

        for (int i1 : array) {
            System.out.print(chars[i1]);
        }
    }

    /**
     * 指定生成随机数
     * @param startNum 开始的
     * @param endNum 结束的
     * @param num 生成多少个
     * @return 放回一个数组
     */
    public  static int[] random3(int startNum,int endNum,int num){
        int[] ints = new int[num];
        boolean flag;
        int i=0;
        while (i<num){
            flag=true;
            int n= new Random().nextInt(endNum-startNum)+startNum;
            for (int j = 0; j < num; j++) {
                if(n == ints[j]){
                    flag = false;
                    break;
                }
            }
            if (flag){ //当flag的true的时候 将其放进数组中
                ints[i]=n;
                i++; //i为数组的索引，只有添加数组进去后才可以增加
            }
        }
        return ints;
    }






}
