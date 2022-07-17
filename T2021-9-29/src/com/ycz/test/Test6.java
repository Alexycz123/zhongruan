package com.ycz.test;/*
 @author ycz
 @date 2021-09-29-15:45  
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test6 {
    public static void main(String[] args) throws Exception {

        File file=new File("F:\\TEMP\\123.txt");

        BufferedReader reader=new BufferedReader(new FileReader(file));
        String line;

        while ((line=reader.readLine())!=null){
            System.out.println(line);
        }
        reader.close();



    }
}
