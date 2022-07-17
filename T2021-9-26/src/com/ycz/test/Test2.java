package com.ycz.test;/*
 @author ycz
 @date 2021-09-26-11:23  
*/

import java.io.File;
import java.util.HashMap;
import java.util.Map;

// 统计  一个目录中  不同文件的个数 存储到map集合 map key  文件后缀名 value 个数
// {java:3,csv:}
public class Test2 {

    public static void main(String[] args) {
        String path="E:\\";
        File file=new File(path,"dirTest");
        String[] list = file.list();
        Map<String,Integer> maps=new HashMap<>();

        int txtNumber=0;

        int csvNum=0;

        int imlNum=0;

        int javaNum=0;

        int batNum=0;
        for (String s : list) {

            if (s.endsWith(".txt")){
                txtNumber++;
            }else if (s.endsWith(".csv")){
                csvNum++;
            }
            else if (s.endsWith(".iml")){
                imlNum++;
            }
            else if (s.endsWith(".java")){
                javaNum++;
            }else if (s.endsWith(".bat")){
                batNum++;
            }
        }
        maps.put("java",javaNum);
        maps.put("txt",txtNumber);
        maps.put("iml",imlNum);
        maps.put("csv",csvNum);
        maps.put("bat",batNum);
        System.out.println(maps);



    }

}
