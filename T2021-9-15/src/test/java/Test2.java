import com.ycz.pojo.Student;
import com.ycz.pojo.Teacher;

public class Test2 {


    public static void main(String[] args) {

        Teacher teacher=new Teacher("ycz",52);
        teacher.eat();
        teacher.sleep();
        teacher.teaching();

        Student student=new Student("zqj",51);
        student.eat();
        student.sleep();
        student.study();
    }


}
