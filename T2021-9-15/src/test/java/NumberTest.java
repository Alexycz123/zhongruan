import com.ycz.pojo.number.Number;

public class NumberTest {
    public static void main(String[] args) {
        Number number=new Number(10,2);

        System.out.println("加法"+number.addition());
        System.out.println("乘法"+number.multiplication());
        System.out.println("除法"+number.division());
        System.out.println("减法"+number.subtration());


    }




}
