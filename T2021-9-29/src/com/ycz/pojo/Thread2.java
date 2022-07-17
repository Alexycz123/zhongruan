package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-29-14:03  
*/

public class Thread2 extends Thread{
    @Override
    public void run() {
        //
        try {
            //Thread.sleep(1000);
            System.out.println("thread2");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
