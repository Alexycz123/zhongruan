package com.ycz.test;/*
 @author ycz
 @date 2021-09-22-10:19  
*/

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        List<String> stringList=new ArrayList<>();

        stringList.add("赵四");
        stringList.add("杨七");
        stringList.add("赵四");
        stringList.add("老刘");
        stringList.add("王五");
        StringBuffer stringbuffer = new StringBuffer();

        stringList.forEach(item->{
            stringbuffer.append(item).append("哈哈\n");
        });

        System.out.println(stringbuffer);
    }


}
