package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-14-14:27  
*/

import java.util.List;

public class TAS {

    public Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public TAS() {
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public TAS(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "TAS{" +
                "teacher=" + teacher +
                ", studentList=" + studentList +
                '}';
    }

    public List<Student> studentList;



}
