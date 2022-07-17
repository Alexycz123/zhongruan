package com.ycz.pojo.car;/*
 @author ycz
 @date 2021-09-16-16:43  
*/

public class Bmw extends car{

    public Bmw(String name, String color) {
        super(name, color);
    }

    public Bmw() {
    }

    @Override
    public void move() {
        System.out.println(name+"move");
    }
}
