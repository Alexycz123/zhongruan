package Test;/*
 @author ycz
 @date 2021-09-16-17:11  
*/

import com.ycz.pojo.curriculum.Admin;
import com.ycz.pojo.curriculum.Curriculum;
import com.ycz.pojo.curriculum.Student;

import java.util.ArrayList;
import java.util.List;

public class CurriculumTest {

    public static void main(String[] args) {

        Curriculum curriculum1=new Curriculum(1,"语文");
        Curriculum curriculum2=new Curriculum(2,"数学");
        Curriculum curriculum3=new Curriculum(3,"英语");
        Curriculum curriculum4=new Curriculum(4,"物理");

        Admin admin=new Admin();
        //管理员开放这两个课程
        admin.setOpenCurriculum(curriculum1);
        admin.setOpenCurriculum(curriculum2);


        List<Curriculum> curriculumList1=new ArrayList<>();
        List<Curriculum> curriculumList2=new ArrayList<>();
        Student student1=new Student(1,"ycz", curriculumList1);
        Student student2=new Student(2,"zqj",curriculumList2);

        student1.selectionCourse(curriculum1);
        student1.selectionCourse(curriculum2);


        student2.selectionCourse(curriculum4);

        student1.selectedCourse();
        student2.selectedCourse();
    }



}
