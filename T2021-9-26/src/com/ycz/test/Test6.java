package com.ycz.test;/*
 @author ycz
 @date 2021-09-26-15:38  
*/
// 1. 动态规划  小偷珠宝达到最大价值
//  求一个数组中非相邻元素和的最大值问题
public class Test6 {

    public static void main(String[] args) {

        int[] robs={1,2,5,3,4,8,2};

        int sum=rob(robs);

        System.out.println(sum);


    }

    public static int rob(int[] cash){
        if (cash.length == 0){
            return 0;
        }

        if (cash.length==1){
            return cash[0];
        }

        int[] sum=new int[cash.length];
        sum[0]=cash[0];
        sum[1] = Math.max(cash[1],cash[0]);

        for (int i=2;i<cash.length;i++){
            sum[i] = Math.max(sum[i-2]+cash[i],sum[i-1]);
        }

        return sum[sum.length-1];


    }

}
