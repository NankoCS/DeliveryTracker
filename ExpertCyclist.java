import java.util.ArrayList;
import java.util.HashMap;

public class ExpertCyclist extends Cyclist {
    private double avgSpeed = Parameters.expertBicycleSpeed;
    public ExpertCyclist(String name, double weight, double salary){
        super(name, weight, salary);
    }

    public double getAvgSpeed(){
        return this.avgSpeed;
    }

    public void addToCompany(HashMap<String, ArrayList<Employee>> mapOfEmployees){
        //checking if there's already an arraylist of scooters
        if (mapOfEmployees.containsKey("ExpertCyclist") == false){
            ArrayList<Employee> tmp = new ArrayList<Employee>();
            mapOfEmployees.put("ExpertCyclist", tmp);
        }
        //at this point, we can safely add a Driver to the list
        mapOfEmployees.get("ExpertCyclist").add(this);
    }
}
