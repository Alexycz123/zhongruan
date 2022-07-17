package com.ycz.test;/*
 @author ycz
 @date 2021-09-26-10:07  
*/

import java.io.File;

/**
 *  * 需求:
 *  * 1. 再当前模块下  构建路径  模块名\\aa\\bb\\cc\\a.txt
 *  * 2. 判断文件是否存在   如果不存在
 *  *     2.1 先创建文件夹
 *  *     2.2 然后再文件夹中创建文件
 *  * 3. 把文件删除 把 cc文件夹删除
 */
public class Test1 {

    public static void main(String[] args) throws Exception{
        String path="T2021-9-26\\aa\\bb\\cc";

        File file1=new File(path);
        File file2=new File(path,"a.txt");


        if (!file2.exists()){
            boolean result= file1.mkdirs();

            boolean result2 = file2.createNewFile();
            System.out.println(result);
            System.out.println(result2);
        }

        boolean delete1 = file2.delete();
        System.out.println("删除a.txt"+delete1);
        boolean delete2 = file1.delete();
        System.out.println("删除cc文件"+delete2);
    }

}
