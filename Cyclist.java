public abstract class Cyclist extends Employee {
    private double avgSpeed;


    public Cyclist(String name, double weight, double salary){
        super(name, weight, salary);
    }

    //method necessarily implemented by a class that extends the Employee class as it implements an interface
    public String getVehiculeClass(){
        return "class Bicycle";
    }

    public abstract double getAvgSpeed();
}
