package com.ycz.test;/*
 @author ycz
 @date 2021-09-27-10:19  
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class TestReader {
    public static void main(String[] args) throws IOException {
        File file=new File("T2021-9-27\\aa\\a.txt");
        FileReader fileReader=new FileReader(file);

        char[] mychar=new char[20];

        int result=fileReader.read(mychar);



        System.out.println(result);

        System.out.println(mychar);


    }
}
