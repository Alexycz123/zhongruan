import com.ycz.pojo.Coder;
import com.ycz.pojo.Student;
import com.ycz.pojo.TAS;
import com.ycz.pojo.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<TAS> tasList=new ArrayList<>();

        for (int i=0;i<3;i++){
            TAS tas=new TAS();
            Teacher teacher=new Teacher();
            System.out.println("请输入老师的姓名");
            String teacherName=sc.next();
            teacher.setName(teacherName);
            System.out.println("请输入此位老师有多少位学生：");
            int num=sc.nextInt();
            List<Student> studentList=new ArrayList<>();

            tas.setTeacher(teacher);

            studentList=getStudentList(num);
            tas.setStudentList(studentList);
            tasList.add(tas);
        }
        System.out.println("[");
        for (int i = 0; i < tasList.size(); i++) {
            show(tasList.get(i));
        }
        System.out.println("]");

    }

    private static List<Student> getStudentList(int num) {
        Scanner sc=new Scanner(System.in);
        List<Student> studentList=new ArrayList<>();
        for (int i=0;i<num;i++){
            System.out.println("请输入第"+(i+1)+"学生的姓名");
            String studentName=sc.next();
            Student student=new Student();
            student.setName(studentName);
            studentList.add(student);
        }
        return studentList;

    }

    public static void  show(TAS tas){
        StringBuilder builder=new StringBuilder();
        builder.append("老师：");
        builder.append(tas.teacher.getName()).append("\n");
        builder.append("学生：");
        for (int i = 0; i < tas.getStudentList().size(); i++) {
            builder.append(tas.getStudentList().get(i).getName());

            if (i==tas.getStudentList().size()-1){
                builder.append(";");
            }else {
                builder.append(",");
            }
        }

        System.out.println(builder);
    }


}
