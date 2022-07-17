package com.ycz.test;/*
 @author ycz
 @date 2021-09-26-14:16  
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int month=new Scanner(System.in).nextInt();
        int monthSum=getTuZi(month);
        System.out.println(monthSum);
    }
    private static int getTuZi(int month) {
        List<Integer> list=new ArrayList<>();
        list.add(1);//1
        list.add(1);//2

        for (int i = 2; i < month; i++) {
            list.add(list.get(i-1)+list.get(i-2));
        }
        if (list.size()<=2){
            return 1;
        }
        return list.get(list.size()-1);


    }
}
