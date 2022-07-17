package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-29-14:56  
*/

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketThread extends Thread {

    private static Integer ticket = 10000;
    private static Object obj = new Object();

    Lock lock=new ReentrantLock();

    @Override
    public void run() {
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countE = 0;
        while (true) {
           synchronized (obj) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "抢票成功 " + ticket--);
                    String ticketName = Thread.currentThread().getName();
                    if (ticketName.equals("窗口A")) {
                        countA++;
                    } else if (ticketName.equals("窗口B")) {
                        countB++;
                    } else if (ticketName.equals("窗口C")) {
                        countC++;
                    }else if (ticketName.equals("窗口D")) {
                        countC++;
                    }else if (ticketName.equals("窗口E")) {
                        countC++;
                    }
                }else {
                    System.out.println("票卖完了");
                    System.out.println("窗口A卖了" + countA);
                    System.out.println("窗口B卖了" + countB);
                    System.out.println("窗口C卖了" + countC);
                    System.out.println("窗口D卖了" + countD);
                    System.out.println("窗口E卖了" + countE);

                    break;
                }


            }


        }
    }
}