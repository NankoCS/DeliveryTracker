public class Bicycle extends Vehicule {
    
    private Cyclist cyclist;

    public Bicycle(String name, double price, double avgSpeed){
        super(name, price, avgSpeed, 0.0, 0.0, price/Parameters.bicycleCostDividor);
        //this is a new test this time testing on my macbook
    }


}
