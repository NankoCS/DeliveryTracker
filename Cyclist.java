public class Cyclist extends Employee {
    private double avgSpeed;

    public Cyclist(String name, double weight, double salary){
        super(name, weight, salary);
    }

    public double getAvgSpeed(){
        return this.avgSpeed;
    }
}
