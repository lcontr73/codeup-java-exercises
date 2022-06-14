package vehicles;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Corvette");
        car.makeNoise();
        car.breakDownNoise();

        Helicopter helicopter = new Helicopter();
        helicopter.setName("Apache");
        helicopter.makeNoise();


    }
}
