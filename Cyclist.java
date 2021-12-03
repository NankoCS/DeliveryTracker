public abstract class Cyclist extends Employee {
    private double avgSpeed;

    public Cyclist(String name, double weight, double salary){
        super(name, weight, salary);
    }

    public abstract double getAvgSpeed();
}
