public class BeginnerCyclist extends Cyclist {
    private double avgSpeed = Parameters.beginnerBicycleSpeed;
    public BeginnerCyclist(String name, double weight, double salary){
        super(name, weight, salary);
    }

    public double getAvgSpeed(){
        return this.avgSpeed;
    }
}
