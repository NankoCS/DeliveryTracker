import java.util.ArrayList;
import java.util.HashMap;

public class AthleticCyclist extends Cyclist{
    private double avgSpeed = Parameters.athleticBicycleSpeed;

    public AthleticCyclist(String name, double weight, double salary){
        super(name, weight, salary);
    }

    public double getAvgSpeed(){
        return this.avgSpeed;
    }

    public void addToCompany(HashMap<String, ArrayList<Employee>> mapOfEmployees){
        //checking if there's already an arraylist of scooters
        if (mapOfEmployees.containsKey("AthleticCyclist") == false){
            ArrayList<Employee> tmp = new ArrayList<Employee>();
            mapOfEmployees.put("AthleticCyclist", tmp);
        }
        //at this point, we can safely add a AthleticCyclist to the list
        mapOfEmployees.get("AthleticCyclist").add(this);
    }

    //idea was to make deliveries only with pairable employees and vehicules, for that i get into directly the map with the key and i iterate over the list
}
