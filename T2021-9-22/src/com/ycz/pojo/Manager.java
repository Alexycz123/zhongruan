package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-22-15:45  
*/

public class Manager extends Employee{

    private final String vehicle;


    public Manager(double salary, String vehicle) {
        super(salary);
        this.vehicle = vehicle;
    }

    public Manager(String name, int age, String sex, double salary, String vehicle) {
        super(name, age, sex, salary);
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "vehicle='" + vehicle + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
