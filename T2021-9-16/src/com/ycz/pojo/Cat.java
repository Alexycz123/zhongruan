package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-16-16:24  
*/

public class Cat extends Pet{


    public Cat(String name, int age) {
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("吃鱼");
    }
}
