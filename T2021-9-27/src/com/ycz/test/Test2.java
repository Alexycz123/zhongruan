package com.ycz.test;/*
 @author ycz
 @date 2021-09-27-11:17  
*/

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * * 案例:
 * *1.获得目录名  重新创建目录  iodircopy
 * *2.复制目录中所有的文本文件到新的目录
 * *3. 新文件的命名  是  源文件名+日期+copy a20210927copy.txt
 */
public class Test2 {
    public static void main(String[] args) {
        File file=new File("T2021-9-27\\aa\\");
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
                copyFile(file,file1);
            }

        }
    }
    private static void copyFile(File file,File file1) {
        try {
            System.out.println(file1);
            FileReader fileReader=new FileReader(file1);
            BufferedReader bufferedReader=new BufferedReader(fileReader);

            FileWriter fileWriter=new FileWriter("T2021-9-27\\iodircopy\\"+file1.getName().substring(0,file1.getName().lastIndexOf("."))+
                    new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())
                    +".txt");
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

            char[] ch=new char[1024];
            int len;
//            while ((len=bufferedReader.read(ch))!=-1){
//
//               bufferedWriter.write(ch,0,len);
//            }

            String line=null;
            while ((line=bufferedReader.readLine())!=null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            bufferedReader.close();
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
