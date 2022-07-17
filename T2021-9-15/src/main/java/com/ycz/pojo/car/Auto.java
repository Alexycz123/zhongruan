package com.ycz.pojo.car;/*
 @author ycz
 @date 2021-09-15-16:23  
*/

public class Auto {

    public int NumberOfTires;

    public String color;

    public String weight;

    public String speed;

    public int getNumberOfTires() {
        return NumberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        NumberOfTires = numberOfTires;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public Auto(int numberOfTires, String color, String weight, String speed) {
        NumberOfTires = numberOfTires;
        this.color = color;
        this.weight = weight;
        this.speed = speed;
    }

    public Auto() {
    }

    @Override
    public String toString() {
        return "Auto{" +
                "NumberOfTires=" + NumberOfTires +
                ", color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }


    public void addSpeed(){
        System.out.println("加速中。。。");
    }

    public void reduceSpeed(){
        System.out.println("减速中。。。");
    }

    public  void stop(){
        System.out.println("停车");
    }
}
