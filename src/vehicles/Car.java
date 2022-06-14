package vehicles;

public class Car extends Vehicle{

    public void breakDownNoise () {
        super.makeNoise();
        System.out.println(this.getName() + " zip boom crash");
    }
}
