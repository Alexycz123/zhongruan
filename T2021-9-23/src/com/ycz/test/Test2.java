package com.ycz.test;/*
 @author ycz
 @date 2021-09-23-11:05  
*/

import com.ycz.pojo.Student;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        Set<Student> treeSetStudent=new TreeSet<>();

        treeSetStudent.add(new Student("ycz",23,"男"));
        treeSetStudent.add(new Student("zqj",22,"女"));
        treeSetStudent.add(new Student("cxkaaa",30,"男"));
        treeSetStudent.add(new Student("cxkaaa",30,"男"));

        //System.out.println(treeSetStudent.size());
        for (Student student : treeSetStudent) {
            System.out.println(student);
        }
        Set<Student> students=new HashSet<>();

//        Set set = new TreeSet();
//        set.add(new String("AA"));
//        set.add(new String("AA"));
//        set.add(new String("BB"));
//        set.add("GG");
//        set.add("MM");
//        for(Object str :set){
//            System.out.println(str);


//    }
}
}
