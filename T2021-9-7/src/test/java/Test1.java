import org.junit.Test;

import java.util.Arrays;

public class Test1 {

    @Test
    public void t1(){
        int a=50;
        int b=49;
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }


    @Test
    public  void t2(){
        int[] arr={1,2,3,59,40,54};

        int startNum=0;
        int endNum=arr.length-1;
        for (;startNum<endNum;startNum++,endNum--){
            int temp=arr[startNum];
            arr[startNum]=arr[endNum];
            arr[endNum]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 冒泡排序
     */
    @Test
    public void t3(){

        int[] arr={20,30,10,5,50,90,100,-10,-20};

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    /**
     * 选择排序 从小到大
     */
    @Test
    public void t4(){
        int[] arr={20,30,10,5,50,90,100,-10,-20};

        for (int i = 0; i < arr.length; i++) {
            int minIndex=arr[i]; //先定义一个最小值再最前面

            for (int j=0;j<i;j++){
                if (minIndex<arr[j]){
                    int temp=arr[j];
                    arr[j]=minIndex;
                    minIndex=temp;
                }
            }
            arr[i]=minIndex;

        }
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void t5(){
        int[] arr={20,30,10,5,50,90,100,-10,-20};
    }

}
