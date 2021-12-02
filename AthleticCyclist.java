public class AthleticCyclist extends Cyclist{
    private double avgSpeed = Parameters.athleticBicycleSpeed;

    public AthleticCyclist(String name, double weight, double salary){
        super(name, weight, salary);
    }

    public double getAvgSpeed(){
        return this.avgSpeed;
    }
}
