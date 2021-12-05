public class Driver extends Employee{
    private Scooter scooter;

    public Driver(String name, double weight, double salary){
        super(name, weight, salary);
    }

    public String getVehiculeClass(){
        return "class Scooter";
    }
}
