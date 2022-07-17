package com.ycz.test;/*
 @author ycz
 @date 2021-09-29-14:04  
*/

import com.ycz.pojo.Thread1;
import com.ycz.pojo.Thread2;

public class Test2 {
    public static void main(String[] args) {
        Thread thread2=new Thread2();
        Thread thread1=new Thread1();


        thread1.start();

        thread2.start();

    }
}
