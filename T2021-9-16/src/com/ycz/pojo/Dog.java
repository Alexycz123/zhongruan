package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-16-16:24  
*/

public class Dog extends Pet{
    public Dog(String name, int age) {
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("吃骨头");
    }
}
