package com.ycz;/*
 @author ycz
 @date 2021-09-28-8:44  
*/
import com.ycz.pojo.FileName;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.junit.Test;

import java.io.*;
import java.util.*;

public class Test2 {

    @Test
    public void test1() throws IOException {
            File file=new File("aa");
            file.mkdirs();
            File file1=new File(file,"a.txt");
            file1.createNewFile();
        }

    @Test
    public void test2() throws Exception{
        File file=new File("aa\\zms.mp4");
        File file1=new File("aa\\zms-copy.mp4");
        System.out.println(file.exists());
        FileInputStream in=new FileInputStream(file);

        FileOutputStream out=new FileOutputStream(file1);
//        InputStreamReader inf=new InputStreamReader(in,"GBK"); //指定编码
//        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(out,"gbk");
        BufferedInputStream bfin=new BufferedInputStream(in);
        BufferedOutputStream bfout=new BufferedOutputStream(out);

        method3(bfin,bfout);

    }

    private void method3(BufferedInputStream bfin, BufferedOutputStream bfout) throws Exception{
        byte[] bytes=new byte[1024];
        int len;
        while ((len=bfin.read(bytes))!=-1){
            bfout.write(bytes,0,len);
        }
        bfin.close();
        bfout.close();

    }

    /**
     * 比较快
     * @param in
     * @param out
     * @throws Exception
     */

    private void method2(FileInputStream in, FileOutputStream out)  throws Exception{
        byte[] bytes=new byte[1024];
        int len;
        while ((len=in.read(bytes))!=-1){
            out.write(bytes,0,len);
        }
        in.close();
        out.close();

    }

    /**
     * 耗时最久
     * @param in
     * @param out
     * @throws Exception
     */
    private void method1(FileInputStream in, FileOutputStream out)throws Exception {
        int len;
        while ((len=in.read())!=-1){
            out.write(len);
        }
        in.close();
        out.close();
    }

    @Test
    public void Test3() throws Exception{
        //递归删除
      //  FileUtils.deleteDirectory();
        //

        File file=new File("F:\\TEMP");

        List<FileName> fileNameList=new ArrayList<>();
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
                String temp=file1.getName().substring(file1.getName().lastIndexOf(".")+1);
                FileName fileName=new FileName(file1.getName(),temp);
                fileNameList.add(fileName);
            }

        }
        System.out.println(fileNameList);

        for (int i = 0; i < fileNameList.size(); i++) {

                boolean flag=false;
                File[] files2=file.listFiles();

                for (File file1 : files2) { // 这个是 如果 其中有相同的就不用再创建新的文件夹
                    if (file1.getName().equals(fileNameList.get(i).getEndName())){
                        flag=true;  //如果存在
                        System.out.println("存在");
                        break;
                    }
                }

                File file1=new File("F:\\TEMP\\"+fileNameList.get(i).getEndName());
                if (!flag){
                    boolean result = file1.mkdirs();
                    System.out.println("创建"+file1+result);
                }
                // 如果文件名 与 endName 相同 ，就放进去 ,同时在list 集合中remove
                if (file1.getName().equals(fileNameList.get(i).getEndName())){
                    File useFile=new File(file,fileNameList.get(i).getName());
                    System.out.println("曾经的文件"+useFile);
                    FileUtils.moveFileToDirectory(useFile,file1,false);
                    //FileName remove = fileNameList.remove(i);
                  //  System.out.println("删除了"+remove);
                }

                // 创建了文件夹了 ， 现在只需要判断 file 1 的文件夹是不是



        }



    }


}
