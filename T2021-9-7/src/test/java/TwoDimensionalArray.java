import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        System.out.print("请问要几行或几列");
        int num=new Scanner(System.in).nextInt();
        int[][] arr=new int[num][num];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("请输入第"+(i+1)+"行"+(j+1)+"列"+"的数");
                int num2=new Scanner(System.in).nextInt();
                arr[i][j]=num2;
            }
        }

        System.out.println("-------------------------------------");
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
                if (i==j){
                    sum+=arr[i][j];
                }

            }
            System.out.println();
        }

        System.out.println("对角线之和为"+sum);
        boolean flag = false;
        System.out.println("请输入你想要的数字");
        int wantNum=new Scanner(System.in).nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==wantNum){
                    flag=true;
                    System.out.println("存在于第"+(i+1)+"行"+"第"+(j+1)+"列");
                }
            }
        }
        if (!flag){
            System.out.println("不存在");
        }




    }
}
