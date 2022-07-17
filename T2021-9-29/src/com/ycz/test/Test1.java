package com.ycz.test;/*
 @author ycz
 @date 2021-09-29-11:23  
*/

import com.ycz.pojo.ReadThread;
import com.ycz.pojo.WriterThread;

public class Test1 {
    public static void main(String[] args) {
        Thread writerThread=new WriterThread();

        Thread readThread=new ReadThread();

        writerThread.start();

        readThread.start();



    }
}
