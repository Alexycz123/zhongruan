package com.ycz.test;/*
 @author ycz
 @date 2021-09-26-13:50  
*/

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Test3 {

    public static void main(String[] args) {

        File file=new File("E:\\dirTest");

        Map<String,Integer> map=new HashMap<>();


        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File file1 : files) {
                String fileName=file1.getName();

                String substring = fileName.substring(fileName.lastIndexOf(".") + 1);
                System.out.println(substring);

                if (map.containsKey(substring)){
                    int count=map.get(substring);
                    map.put(substring,++count);
                }else {
                    map.put(substring,1);
                }
            }
        }else {
            System.out.println("不是文件夹");
        }

        System.out.println(map);

    }
}
