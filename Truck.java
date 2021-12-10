//class to test the extensibility of our code
import java.util.HashMap;
import java.util.ArrayList;

public class Truck extends Vehicule{
    private Employee trucker;
    public Truck(String name, double avgSpeed, double price, double co2Emission, double load, double utilizationCost, Employee trucker){
        super(name, avgSpeed, price, co2Emission, load, utilizationCost);
        this.trucker = trucker;
    }

    public Employee getTrucker(){
        return this.trucker;
    }

    public void addToCompany(HashMap<String, ArrayList<Vehicule>> mapOfVehicules){
        //checking if there's already an arraylist of scooters
        if (mapOfVehicules.containsKey("Truck") == false){
            ArrayList<Vehicule> tmp = new ArrayList<Vehicule>();
            mapOfVehicules.put("Truck", tmp);
        }
        //at this point, we can safely add a scooter to the list
        mapOfVehicules.get("Truck").add(this);
    }

    public String toString(){
        return " -- " + this.getName() + " -- \n"
        + " -- Truck owned by " + this.getTrucker().getName() + " -- \n"
        +(" -- Bought for $" + this.getPrice() + " -- \n")
        +(" -- Travels at " + this.getAvgSpeed() + "km/h -- \n")
        +(" -- " + this.getCo2Emission() + " g/km of CO2 emitted -- \n")
        +(" -- Can carry up to " + this.getLoad() + " kg -- \n")
        +(" -- Costs " + this.getUtilizationCost() + " euros/km -- \n");
    }
}
