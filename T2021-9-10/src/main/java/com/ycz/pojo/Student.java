package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-10-13:33  
*/

import java.util.Objects;

public class Student {
    private String sid;
    private String name;
    private Integer age;
    private String birthday;

    public Student(String sid, String name, Integer age, String birthday, String classNumber) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.classNumber = classNumber;
    }

    public String getClassNumber() {
        return classNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(sid, student.sid) && Objects.equals(name, student.name) && Objects.equals(age, student.age) && Objects.equals(birthday, student.birthday) && Objects.equals(classNumber, student.classNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, name, age, birthday, classNumber);
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    private String classNumber;

    public String getSid() {
        return sid;
    }

    public Student(){

    }



    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                ", classNumber='" + classNumber + '\'' +
                '}';
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


}
