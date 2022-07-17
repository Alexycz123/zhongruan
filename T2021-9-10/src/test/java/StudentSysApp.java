import com.ycz.pojo.Student;
import com.ycz.utils.StudentOperation;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class StudentSysApp {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        StudentOperation studentOperation=new StudentOperation();

        BufferedReader reader=new BufferedReader(new FileReader("T2021-9-10\\aa\\student.txt"));
        String line;
        while ((line=reader.readLine())!=null){
            studentOperation.addStudentByTxt(line);
            //System.out.println(line);
        }

        while (true){
            System.out.println("============学生管理系统===========");
            System.out.println("0、输入班级号查询学生");
            System.out.println("1、添加学生");
            System.out.println("2、删除学生");
            System.out.println("3、编辑学生");
            System.out.println("4、查看学生");
            System.out.println("5、退出系统");
            System.out.println("请输入你要操作的序号");
            System.out.println("================================");

            boolean flag=true;

            String i=sc.next();

            switch (i){
                case "0":
                    studentOperation.selectStudentsByClassNumber();
                    break;
                case "1":
                    studentOperation.addStudent();
                    break;
                case "2":studentOperation.deleteStudent();
                    break;
                case "3":
                    studentOperation.editStudent();
                    break;
                case "4":
                    studentOperation.getStringList2();
                    break;
                case "5": flag=false;
                    break;
                default:

            }
            if (!flag){
                List<Student> studentList= studentOperation.getStringList();
                OutputStreamWriter oow=new OutputStreamWriter(new FileOutputStream("T2021-9-10\\aa\\student.txt"));

                for (Student student : studentList) {
                    oow.write(student.getSid()+"\t"+student.getName()+"\t"+student.getAge()+"\t"+student.getBirthday()+"\t"
                    +student.getClassNumber()+"\r\n"
                    );

                }
                oow.close();

                System.out.println("退出成功");
                break;
            }



        }


    }
}
