import java.util.ArrayList;
import java.util.HashMap;

public class BeginnerCyclist extends Cyclist {
    private double avgSpeed = Parameters.beginnerBicycleSpeed;
    public BeginnerCyclist(String name, double weight, double salary){
        super(name, weight, salary);
    }

    public double getAvgSpeed(){
        return this.avgSpeed;
    }

    public void addToCompany(HashMap<String, ArrayList<Employee>> mapOfEmployees){
        //checking if there's already an arraylist of scooters
        if (mapOfEmployees.containsKey("BeginnerCyclist") == false){
            ArrayList<Employee> tmp = new ArrayList<Employee>();
            mapOfEmployees.put("BeginnerCyclist", tmp);
        }
        //at this point, we can safely add a Driver to the list
        mapOfEmployees.get("BeginnerCyclist").add(this);
    }
}
