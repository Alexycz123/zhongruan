package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-29-14:02  
*/

public class Thread1 extends Thread{
    @Override
    public void run() {
        //
        try {
            Thread.sleep(1000);
            System.out.println("thread1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
