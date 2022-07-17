package com.ycz.pojo.car;/*
 @author ycz
 @date 2021-09-16-16:41  
*/

public abstract class car {

    public String name;

    public String color;

    public car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public abstract void move();
}
