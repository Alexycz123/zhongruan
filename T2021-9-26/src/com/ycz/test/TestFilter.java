package com.ycz.test;/*
 @author ycz
 @date 2021-09-26-13:46  
*/

import java.io.File;
import java.io.FilenameFilter;

public class TestFilter {

    public static void main(String[] args) {

        File file=new File("E:\\dirTest");

        if (file.isDirectory()){

            String[] list = file.list(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.endsWith(".csv");
                }
            });

            for (String s : list) {
                System.out.println(s);
            }

        }else {
            System.out.println("不属于文件夹");
        }


    }

}
