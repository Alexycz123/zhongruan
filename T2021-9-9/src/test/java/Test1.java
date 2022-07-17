import com.ycz.pojo.Student;
import com.ycz.utils.JsonOperation;

public class Test1 {

    public static void main(String[] args) {

        Student student=new Student("李华",18,"男");
        Student student2=new Student("李华",18,"女");
        Student[] students={student,student2};
        Object object = new JsonOperation().objectToJsonString(students);
        System.out.println(students.getClass().getClassLoader().getParent());

        System.out.println(object);

    }
}
