package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-14-14:20  
*/

public class Student extends Person{


    public Student(String name, int age) {
        super(name, age);
    }

    public void study(){
        System.out.println(getName()+"上课");
    }

    public void eat(){
        System.out.println("学生"+getName()+"吃饭");
    }
    public void sleep(){
        System.out.println("学生"+getName()+"睡觉");
    }
}
