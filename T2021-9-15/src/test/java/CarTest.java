import com.ycz.pojo.car.Car;

public class CarTest {
    public static void main(String[] args) {

        Car car = new Car(4,"红色","2吨","120km/s","制冷","CD");

        car.addSpeed();
        car.reduceSpeed();
        car.stop();
        System.out.println(car.toString());
    }



}
