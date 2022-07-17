package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-14-10:25  
*/

public class Human  {

    public String name;
    public int age;
    public String hobby;

    public Human() {
    }

    public String getName() {
        return name;
    }

    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
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

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
