public class Bicycle extends Vehicule {
    
    private Cyclist cyclist;
    private double avgSpeed;

    public Bicycle(String name, double price, Cyclist cyclist){
        super(name, price, 0.0, 0.0, price/Parameters.bicycleCostDividor);
        this.cyclist = cyclist;
        this.avgSpeed = cyclist.getAvgSpeed();
        this.setLoad(cyclist.getLoad());
    }

    public double getAvgSpeed(){
        return this.cyclist.getAvgSpeed();
    };

    //setter method used to change the speed of the Bicycle according to a cyclist, since it won't always be the same person using the same bicycle
    // protected void setAvgSpeed(Cyclist cyclist){
    //     this.avgSpeed = cyclist.getAvgSpeed();
    // }


}
