package com.ycz.pojo.curriculum;/*
 @author ycz
 @date 2021-09-16-16:58  
*/

import java.util.List;

public class Student {

    private int studentId;

    private String studentName;

    private List<Curriculum> curriculumList;

    public List<Curriculum> getCurriculumList() {
        return curriculumList;
    }

    public void setCurriculumList(List<Curriculum> curriculumList) {
        this.curriculumList = curriculumList;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public Student() {
    }

    public Student(int studentId, String studentName, List<Curriculum> curriculumList) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.curriculumList = curriculumList;
    }

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName=" + studentName + +
                '}';
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }



    public void selectionCourse(Curriculum curriculum){
        //如果课程开发则可以选
        if (curriculum.getOpenCurriculum()){
            System.out.println(getStudentName()+"选择此"+curriculum+"成功");
            this.curriculumList.add(curriculum);
        }else {
            System.out.println(getStudentName()+"同学"+curriculum.getCurriculumName()+"课程没有开发，您不能选");
        }

    }

    public void selectedCourse(){

        StringBuilder builder=new StringBuilder();


        builder.append("[").append(getStudentName()).append("选了：");

        if (curriculumList.size()!=0){
            for (int i = 0; i < this.curriculumList.size(); i++) {
                if (curriculumList.size()-1==i){
                    builder.append(curriculumList.get(i).getCurriculumName()).append(";");
                }else {
                    builder.append(curriculumList.get(i).getCurriculumName()).append(",");
                }
            }
        }else {
            builder.append("未选");
        }
        builder.append("]");

        System.out.println(builder);

    }

}
