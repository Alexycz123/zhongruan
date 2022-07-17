package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-14-10:26  
*/

public class Teacher extends Person{

    public Teacher() {
        super();
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teaching(){
        System.out.println(getName()+"教书");
    }

    public void eat(){
        System.out.println("老师"+this.name+"吃饭");
    }
    public void sleep(){
        System.out.println("老师"+this.name+"睡觉");
    }
}
