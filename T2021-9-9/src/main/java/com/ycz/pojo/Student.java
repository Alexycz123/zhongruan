package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-09-11:16  
*/
/*
 * 案例:
 * 1.定义一个学生类对象
 * 属性 : stuName stuAge stuSex
 * 2.创建一个学生类对象
 * Student stu=new Student();
 * 3.创建一个类  JsonOperation
 * 定义方法   objectToJsonString(Student stu)
 * 返回值格式:
 * 属性名 暂时 写死
 * {stuName="",stuAge=""...}
 * */
public class Student {

    private String stuName;

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", stuSex='" + stuSex + '\'' +
                '}';
    }

    private Integer stuAge;

    public Student(){

    }

    public Student(String stuName, Integer stuAge, String stuSex) {
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuSex = stuSex;
    }

    private String stuSex;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }
}
