package vehicles;

public class Garage {

    private String name;
    private Vehicle[] vehicles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }


    // This constructor is overloaded
    public Garage(){}

    public Garage(String name) {
        this.name = name;
    }



    public void retrieveVehicles(){
        for (Vehicle vehicle: vehicles) {
            vehicle.makeNoise();
        }
    }
}
