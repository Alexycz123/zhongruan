package com.ycz.test;/*
 @author ycz
 @date 2021-09-26-17:02  
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test7 {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for (int i=0;i<5;i++){
            int num= (int) (Math.random()*9);
            Integer num2=num;
            String strNum=num2.toString();
            builder.append(strNum);
        }
        SimpleDateFormat sf=new SimpleDateFormat("yyyyMMddHHmmss");
        String format = sf.format(new Date());
        builder.append(format);
        System.out.println(builder);



    }

}
