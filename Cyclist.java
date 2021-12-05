public abstract class Cyclist extends Employee {
    private double avgSpeed;
    //interface for this
    //attribute to check if a delivery is doable when the vehicule is usable by the employee
    private Bicycle bicycle;

    public Cyclist(String name, double weight, double salary){
        super(name, weight, salary);
    }

    public String getVehiculeClass(){
        return "class Bicycle";
    }

    public abstract double getAvgSpeed();
}
