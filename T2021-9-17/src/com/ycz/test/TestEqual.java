package com.ycz.test;/*
 @author ycz
 @date 2021-09-17-15:15  
*/

import com.ycz.pojo.Emp;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestEqual {
    public static void main(String[] args) throws ParseException {

        DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        DateFormat df2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date1=df.parse("1999-11-03 15:15:15");

        Date date2=df2.parse("1999-11-03 15:15:15");

        Emp emp1=new Emp("y",1200,date1);
        Emp emp2=new Emp("y",1200,date2);

        System.out.println(emp1.equals(emp2));

    }
}
