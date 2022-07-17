package com.ycz.test;/*
 @author ycz
 @date 2021-09-22-10:26  
*/

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>();

        stringList.add("赵四");
        stringList.add("杨七");
        stringList.add("赵四");
        stringList.add("老刘");
        stringList.add("王五");

        for (String s : stringList) {
            System.out.println(s+"哈哈");
        }


    }
}
