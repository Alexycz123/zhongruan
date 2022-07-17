package com.ycz.pojo.car;/*
 @author ycz
 @date 2021-09-16-16:45  
*/

public class Bsj extends car{

    public Bsj(String name, String color) {
        super(name, color);
    }

    public Bsj() {
    }

    @Override
    public void move() {
        System.out.println(name+"move");
    }
}
