package com.ycz.test;/*
 @author ycz
 @date 2021-09-29-15:27  
*/

import java.io.File;

public class Test4 {

    public static void main(String[] args) {
        File file=new File("T2021-9-29\\a");

        File[] files = file.listFiles();

        for (File file1 : files) {
            if (file1.isFile()){
                boolean delete = file1.delete();
                System.out.println("删除"+file1.getName()+delete);
            }
        }
    }


}
