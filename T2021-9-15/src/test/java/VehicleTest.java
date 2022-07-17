import com.ycz.pojo.Vehicle.Vehicle;

public class VehicleTest {

    public static void main(String[] args) {

        Vehicle vehicle=new Vehicle(100,"3立方米");
        vehicle.move();
        vehicle.addSpeed(5);

        vehicle.ReduceSpeed(10);

        vehicle.lookSpeed();

        vehicle.size();

    }

}
