import java.util.HashMap;
import java.util.ArrayList;

public class Scooter extends Vehicule {
    private double cylinder;
    private double gasConsumption;

    public Scooter(String name, double price, double load, double cylinder, double gasConsumption) {
        super(name, Parameters.baseSpeed + cylinder / Parameters.cylinderDividor, price,
                cylinder / Parameters.co2EmissionDividor, load,
                price / Parameters.utilizationCostDiver + gasConsumption/100 * Parameters.priceOfGasPerLiter);
        this.cylinder = cylinder;
        this.gasConsumption = gasConsumption;
    }

    public double getCylinder() {
        return this.cylinder;
    }

    public double getGasConsumption() {
        return this.gasConsumption;
    }

    //method to test inheritance
    // public String display(){
    //     return "this is a Scooter";
    // }

    public void addToCompany(HashMap<String, ArrayList<Vehicule>> mapOfVehicules){
        //checking if there's already an arraylist of scooters
        if (mapOfVehicules.containsKey("Driver") == false){
            ArrayList<Vehicule> tmp = new ArrayList<Vehicule>();
            mapOfVehicules.put("Driver", tmp);
        }
        //at this point, we can safely add a scooter to the list
        mapOfVehicules.get("Driver").add(this);
    }
}
