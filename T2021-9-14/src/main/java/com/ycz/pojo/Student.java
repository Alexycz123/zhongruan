package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-14-14:20  
*/

public class Student extends Human{

    private double translate;

    public double getTranslate() {
        return translate;
    }

    public void setTranslate(double translate) {
        this.translate = translate;
    }

    public Student(double translate) {
        this.translate = translate;
    }

    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                ", translate=" + translate +
                '}';
    }

    public Student(String name, int age, String hobby, double translate) {
        super(name, age, hobby);
        this.translate = translate;
    }

    public void study(){
        System.out.println(getName()+"上课");
    }
}
