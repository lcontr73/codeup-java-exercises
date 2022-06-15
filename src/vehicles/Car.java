package vehicles;

public class Car extends Vehicle{

    public Car() {
    }

public Car(String name) {
        super(name);
}

    public void breakDownNoise () {
        super.makeNoise();
        System.out.println(this.getName() + " zip boom crash");
    }
}
