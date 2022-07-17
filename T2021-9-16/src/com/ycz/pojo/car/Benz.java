package com.ycz.pojo.car;/*
 @author ycz
 @date 2021-09-16-16:45  
*/

public class Benz extends car{

    public Benz(String name, String color) {
        super(name, color);
    }

    public Benz() {
    }

    @Override
    public void move() {
        System.out.println(name+"move");
    }
}
