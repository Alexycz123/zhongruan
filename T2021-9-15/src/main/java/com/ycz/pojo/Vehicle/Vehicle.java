package com.ycz.pojo.Vehicle;/*
 @author ycz
 @date 2021-09-15-16:43  
*/

public class Vehicle {

    private double speed;

    private String size;

    public double getSpeed() {
        return speed;
    }

    public Vehicle() {
    }

    public Vehicle(double speed, String size) {
        this.speed = speed;
        this.size = size;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", size=" + size +
                '}';
    }

    public void addSpeed(double speed){
        System.out.println("加速了："+speed);
        this.speed=this.speed+speed;
    }

    public void lookSpeed(){
        System.out.println("当前速度为："+speed);
    }

    public void ReduceSpeed(double speed){
        System.out.println("减速了"+speed);
        this.speed=this.speed-speed;
    }

    public void move(){
        System.out.println("正在移动。。。");
    }

    public void size(){
        System.out.println("查看体积为："+this.size);
    }

}
