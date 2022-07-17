package com.ycz.pojo.curriculum;/*
 @author ycz
 @date 2021-09-16-16:59  
*/

public class Curriculum {

    private int CurriculumId;

    private String curriculumName;

    public boolean openCurriculum;

    public Curriculum() {
    }

    public int getCurriculumId() {
        return CurriculumId;
    }

    @Override
    public String toString() {
        return "Curriculum{" +
                "CurriculumId=" + CurriculumId +
                ", curriculumName='" + curriculumName + '\'' +
                ", openCurriculum=" + openCurriculum +
                '}';
    }

    public Curriculum(int curriculumId, String curriculumName) {
        CurriculumId = curriculumId;
        this.curriculumName = curriculumName;
    }

    public void setCurriculumId(int curriculumId) {
        CurriculumId = curriculumId;
    }

    public String getCurriculumName() {
        return curriculumName;
    }

    public void setCurriculumName(String curriculumName) {
        this.curriculumName = curriculumName;
    }

    public boolean getOpenCurriculum() {
        return openCurriculum;
    }

    public void setOpenCurriculum(boolean openCurriculum) {
        this.openCurriculum = openCurriculum;
    }
}
