package com.ycz.test;/*
 @author ycz
 @date 2021-09-17-14:57  
*/

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestCompare {
    public static void main(String[] args) throws ParseException {

        DateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("----------------------------------------------");
        System.out.println("请输入你的出身日期");
        String dataMe=new Scanner(System.in).nextLine();
        Date parseMe = sf.parse(dataMe);

        System.out.println("请输入你的同桌出身日期");
        String dataHe=new Scanner(System.in).nextLine();
        Date parseHe = sf.parse(dataHe);
        long compareTime=0L;
        if (parseHe.getTime()>parseMe.getTime()){
            compareTime =parseHe.getTime()-parseMe.getTime();
        }else {
            compareTime =parseMe.getTime()-parseHe.getTime();
        }

        int day= (int) (compareTime/(1000*60*60*24));
        System.out.println("你们相差的天数为"+day);

        System.out.println((new Date().getTime()-sf.parse("1999-11-03 08:15:15").getTime())/(1000*60*60*24));

    }

}
