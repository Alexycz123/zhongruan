package com.ycz.utils;/*
 @author ycz
 @date 2021-09-10-13:39  
*/

import com.ycz.pojo.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentOperation {
    List<Student> studentList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    /**
     * 查看学生
     * @return
     */
    public List<Student> getStringList() {
        return studentList;
    }

    public void getStringList2() {

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).toString());
        }
    }

    public void addStudent() {

        while (true) {
            System.out.println("请输入学生的id");
            String id = sc.next();
            boolean flag = true;
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getSid().equals(id)) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                System.out.println("id 重复了，请重新输入");
                continue;
            }

            Student student = scannerStudent(id);

            studentList.add(student);

            System.out.println("添加成功");

            break;
        }
    }





    public void deleteStudent() {

        getStringList().forEach(System.out::println);


        System.out.println("请输入你要删除的id");
        String id = sc.next();

        boolean flag = false;

        for (int i = 0; i < studentList.size(); i++) {
            if (id.equals(studentList.get(i).getSid())) {
                studentList.remove(i);
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("删除成功");
        } else {
            System.out.println("找不到此id");
        }


    }

    public void editStudent() {
        getStringList().forEach(System.out::println);

        System.out.println("请输入你要编辑的id");

        String id = sc.next();

        boolean flag = false;

        int index = -1;

        for (int i = 0; i < studentList.size(); i++) {
            if (id.equals(studentList.get(i).getSid())) {
                flag = true; //找到了
                index = i; //输入索引值
                break;
            }
        }

        if (flag) {
            Student student = scannerStudent(id);
            studentList.set(index, student);
        } else {
            System.out.println("找不到此id");
        }
    }


    public Student scannerStudent(String id) {

        System.out.println("请输入学生的姓名");

        String name = sc.next();

        System.out.println("请输入学生的年龄");

        int age = sc.nextInt();

        System.out.println("请输入学生的生日");

        String birthday =  sc.next();

        System.out.println("请输入学生的班级");

        String classNumber = sc.next();

        return new Student(id, name, age, birthday,classNumber);
    }


    public void addStudentByTxt(String line) {

        String[] split = line.split("\t");

        Integer age=Integer.parseInt(split[2]);

        Student student=new Student(split[0],split[1],age,split[3],split[4]);

        studentList.add(student);
    }



    public void selectStudentsByClassNumber() {
        System.out.println("请输入你想查询的班级号");

        String classNumber=new Scanner(System.in).next();

        boolean flag=false;
            for (Student student : studentList) {
                if (student.getClassNumber().equals(classNumber)){//如果找到了
                    flag=true;
                    System.out.println(student);
                }
        }
            if (!flag){
                System.out.println("没有你需要的学生班级");
            }

    }
}
