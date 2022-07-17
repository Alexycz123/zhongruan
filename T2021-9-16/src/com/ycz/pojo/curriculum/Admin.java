package com.ycz.pojo.curriculum;/*
 @author ycz
 @date 2021-09-16-17:00  
*/

import java.util.List;

public class Admin {

    private List<Curriculum> curriculumList;

    public List<Curriculum> getCurriculumList() {
        return curriculumList;
    }

    public void setCurriculumList(List<Curriculum> curriculumList) {
        this.curriculumList = curriculumList;
    }

    public Admin(List<Curriculum> curriculumList) {
        this.curriculumList = curriculumList;
    }

    public Admin(){

    }

    @Override
    public String toString() {
        return "Admin{" +
                "curriculumList=" + curriculumList +
                '}';
    }


    public void setOpenCurriculum(Curriculum curriculum){

        curriculum.setOpenCurriculum(true);

    }
}
