package com.ycz.pojo.car;/*
 @author ycz
 @date 2021-09-15-16:27  
*/

public class Car extends Auto{

    private String airConditioner;
    private String CD;

    public String getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(String airConditioner) {
        this.airConditioner = airConditioner;
    }

    public Car(int numberOfTires, String color, String weight, String speed, String airConditioner, String CD) {
        super(numberOfTires, color, weight, speed);
        this.airConditioner = airConditioner;
        this.CD = CD;
    }

    public Car(String airConditioner, String CD) {
        this.airConditioner = airConditioner;
        this.CD = CD;
    }

    public String getCD() {
        return CD;
    }

    public void setCD(String CD) {
        this.CD = CD;
    }

    @Override
    public String toString() {
        return "Car{" +
                "NumberOfTires=" + NumberOfTires +
                ", color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                ", speed='" + speed + '\'' +
                ", airConditioner='" + airConditioner + '\'' +
                ", CD='" + CD + '\'' +
                '}';
    }

    public void addSpeed(){
        System.out.println("汽车加速中。。。");
    }

    public void reduceSpeed(){
        System.out.println("汽车减速中。。。");
    }

    public  void stop(){
        System.out.println("汽车停车");
    }


}
