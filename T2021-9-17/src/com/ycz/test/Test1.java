package com.ycz.test;/*
 @author ycz
 @date 2021-09-17-10:09  
*/

import com.ycz.pojo.Student;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {

        List<Student> students=new ArrayList<>();
        Student student1=new Student("李三三",23,"男");
        Student student2=new Student("李三三",23,"男");
        Student student3=new Student("asd",23,"男");
        Student student4=new Student("ssss",23,"男");
        Student student5=new Student("李三三",23,"男");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        students= getDistinctStudent2(students);

        System.out.println(students);

    }

    private static List<Student> getDistinctStudent(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            for (int j=i+1;j<students.size();j++){
                if ((students.get(i).getName().equals(students.get(j).getName())
                        && (students.get(i).getAge()==students.get(j).getAge())
                && (students.get(i).getSex().equals(students.get(j).getSex())))){
                    students.remove(i);
                }
            }
        }

        return students;
    }

    private static List<Student> getDistinctStudent2(List<Student> students){
        List<Student> studentList=new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {
            Student student=students.get(i);
            if (!studentList.contains(student)){
                studentList.add(student);
            }
        }

        return studentList;


    }


}
