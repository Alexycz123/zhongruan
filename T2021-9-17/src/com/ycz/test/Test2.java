package com.ycz.test;/*
 @author ycz
 @date 2021-09-17-14:39  
*/

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws ParseException {

        String dataStr=new Scanner(System.in).nextLine();
        DateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sf.parse(dataStr));

    }
}
