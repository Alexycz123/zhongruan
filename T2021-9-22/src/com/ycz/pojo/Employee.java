package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-22-15:41  
*/

public class Employee extends Role{

    private double salary;

    private static int id=1;

    public double getSalary() {
        return salary;
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int age, String sex, double salary) {
        super(name, age, sex);
        this.salary = salary;
    }




    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Employee.id = id;
    }


    @Override
    public void play() {
        System.out.println("Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +     ", id='" + id + '\'' +
                '}');
    }
    public final void sing(){
        System.out.println("sing 方法");
    }
}
