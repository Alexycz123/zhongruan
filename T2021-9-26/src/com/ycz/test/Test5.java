package com.ycz.test;/*
 @author ycz
 @date 2021-09-26-15:07  
*/

import java.io.File;

// 1. 动态规划  小偷珠宝达到最大价值
// 2. 删除一个文件夹(不管有没有内容都可以删除  递归删除)
//求一个数组中非相邻元素和的最大值问题
public class Test5 {

    public static void main(String[] args) {

        String path="E:\\dirTest\\aaaa";
        File file=new File(path);
//        File[] files = file.listFiles(); // 里面有文件 则先不删除
//        if (files.length!=0){
//            for (File file1 : files) {
//                System.out.println(file1.getAbsolutePath());
//                System.out.println(file1.getParentFile());
//            }
//        }else {
//            System.out.println(""); //里面没有文件 可以删除
//           boolean result= file.delete();
//            System.out.println(result);
//        }
        delDir(file);
    }

   public static void delDir(File file) {
          if (file.isDirectory()) {
               File zFiles[] = file.listFiles();
         for (File file2 : zFiles) {
                delDir(file2);
            }
           file.delete();
           } else {
             file.delete();
             }
         }


}
