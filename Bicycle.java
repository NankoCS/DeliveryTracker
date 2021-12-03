public class Bicycle extends Vehicule {
    
    private double avgSpeed;

    //ask if cyclist is assigned to a bicycle or not
    public Bicycle(String name, double price){
        super(name, price, 0.0, 0.0, price/Parameters.bicycleCostDividor);
        //setting the avgSpeed to 10km/h by default as it will never be lower
        this.avgSpeed = 10.0;
    }

    public double getAvgSpeed(){
        return this.avgSpeed;
    };

    //setter method used to change the speed of the Bicycle according to a cyclist, since it won't always be the same person using the same bicycle
    protected void setAvgSpeed(Cyclist cyclist){
        this.avgSpeed = cyclist.getAvgSpeed();
    }
}
