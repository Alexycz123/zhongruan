package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-14-10:26  
*/

public class Teacher extends Human{

//    private double SubstituteFee;
//
//    public double getSubstituteFee() {
//        return SubstituteFee;
//    }
//
//    public void setSubstituteFee(double substituteFee) {
//        SubstituteFee = substituteFee;
//    }
//
    public double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Teacher(double salary) {
        this.salary = salary;
    }
    public  Teacher(){

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Teacher(String name, int age, String hobby, double salary) {
        super(name, age, hobby);
        this.salary = salary;
    }

    public void teaching(){
        System.out.println(getName()+"教书");
    }
}
