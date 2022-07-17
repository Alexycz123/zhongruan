package com.ycz.test;/*
 @author ycz
 @date 2021-09-29-15:02  
*/

import com.ycz.pojo.TicketThread;

public class Test3 {
    public static void main(String[] args) {
        TicketThread ticketThread1=new TicketThread();
        TicketThread ticketThread2=new TicketThread();
        TicketThread ticketThread3=new TicketThread();
        TicketThread ticketThread4=new TicketThread();
        TicketThread ticketThread5=new TicketThread();

        ticketThread1.setName("窗口A");
        ticketThread2.setName("窗口B");
        ticketThread3.setName("窗口C");
        ticketThread4.setName("窗口D");
        ticketThread5.setName("窗口E");


        long startTime=System.currentTimeMillis();

        ticketThread1.start();
        ticketThread2.start();
        ticketThread3.start();
        ticketThread4.start();
        ticketThread5.start();

        long endTime=System.currentTimeMillis();

        System.out.println((endTime-startTime));


    }
}
