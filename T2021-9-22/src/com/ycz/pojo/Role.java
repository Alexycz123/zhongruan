package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-22-15:39  
*/

public abstract class Role {

    public String name;

    public Role() {
    }

    public int age;

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Role(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String sex;

    public abstract  void play();



}
