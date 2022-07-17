package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-29-11:18  
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadThread extends Thread{
    @Override
    public void run() {
        BufferedReader reader=null;
        try {
            System.out.println("读了 0 ");
            reader=new BufferedReader(new FileReader("T2021-9-29\\a.txt"));
            String line;
            while ((line=reader.readLine())!=null){
                System.out.println(line);
                System.out.println("读了");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
