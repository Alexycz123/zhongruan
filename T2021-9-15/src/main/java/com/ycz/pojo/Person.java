package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-15-16:11  
*/

public class Person {

    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {

    }

    public void sleep(){

    }

    public void display(){
        System.out.println("姓名\t\t年龄");
        System.out.println(name+"\t\t"+age);

    }


}
