package com.ycz.test;/*
 @author ycz
 @date 2021-09-29-15:31  
*/

import java.io.File;
import java.io.IOException;

public class Test5 {

    public static void main(String[] args) throws IOException {
        File file1=new File("D:\\102班级");
        File file2=new File(file1,"javaSE作业");

        if (!file1.exists()){
            boolean mkdirs = file1.mkdirs();
            System.out.println("创建"+file1.getName()+mkdirs);
        }
        if (!file2.exists()){
            boolean newFile = file2.createNewFile();
            System.out.println("创建"+file2.getName()+newFile);
        }

    }

}
