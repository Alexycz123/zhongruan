package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-23-11:05  
*/

import java.util.Objects;

public class Student implements Comparable {

    private String name;
    private int age;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
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

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(sex, student.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    private String sex;


//    @Override
//    public int compareTo(Object o) {
//        Student student = (Student) o;
//        if (student == null)
//            return 1;
//        return this.getName().compareTo(student.getName());
//    }

//    public int compareTo(Object o) {
//        Student student = (Student) o;
//        if(this.age>student.getAge()){
//            return 1; //正整数是大于
//        }else if(this.age<student.getAge()){
//            return -1;//负整数是小于
//        }else{
//            return 0; //0为等于
//        }
//    }

    public int compareTo(Object o) {
        Student student = (Student) o;
//        if(this.age>student.getAge()){
//            return 1; //正整数是大于
//        }else if(this.age<student.getAge()){
//            return -1;//负整数是小于
//        }else{
//            return 0; //0为等于
//        }
        return this.age-student.getAge();
    }



}
