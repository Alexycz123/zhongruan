package com.ycz.Test;/*
 @author ycz
 @date 2021-09-18-11:19  
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Test1 {

    /*
     * 1. 向数组中添加一个元素
     * 2.删除数组中的一个元素
     * int[] ={2,3,4,5,1};
     * */

    public static void main(String[] args) {

        /**
         * Object src,
         * int  srcPos,
         * Object dest,
         * int destPos,
         * int length
         */
        int[] arr={2, 3, 4, 5, 1};

        int[] arr2=new int[arr.length+1];
        System.arraycopy(arr,0,arr2,0,5);

        System.out.println(Arrays.toString(arr2));

        System.out.println(00001);

        Collection<Integer> collection=new ArrayList<>();

    }

}
