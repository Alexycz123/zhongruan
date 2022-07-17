package com.ycz.utils;/*
 @author ycz
 @date 2021-09-09-11:18  
*/

import com.ycz.pojo.Student;
//
//* 1.定义一个学生类对象
//        * 属性 : stuName stuAge stuSex
//        * 2.创建一个学生类对象
//        * Student stu=new Student();
//        * 3.创建一个类  JsonOperation
//        * 定义方法   objectToJsonString(Student stu)
//        * 返回值格式:
//        * 属性名 暂时 写死
//        * {stuName="",stuAge=""...}
//        * */
public class JsonOperation {


    public Object objectToJsonString(Student[] stu){



        StringBuilder builder=new StringBuilder();

        builder.append("{");

        for(int i=0;i<stu.length;i++){
            builder.append("{\"stuName\":\""+stu[i].getStuName()+"\",\"stuSex\":\""+stu[i].getStuSex()+"\","
                  +  "stuAge\":\""+stu[i].getStuAge()+"\"},"
            );
        }
        builder.deleteCharAt(builder.length()-1);
        builder.append("}");

        return builder;

    }

}
