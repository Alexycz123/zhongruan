package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-29-11:18  
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterThread extends Thread {

    @Override
    public void run() {
        BufferedWriter bufferedWriter=null;
        try {
            bufferedWriter =new BufferedWriter(new FileWriter("T2021-9-29\\a.txt"));

            for (int i=1;i<=10;i++){
                bufferedWriter.write("hello world ");
                bufferedWriter.newLine();
                System.out.println("写了 " +i);
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
