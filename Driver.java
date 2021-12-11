import java.util.ArrayList;
import java.util.HashMap;

public class Driver extends Employee{

    public Driver(String name, double weight, double salary){
        super(name, weight, salary);
    }
    

    public void addToCompany(HashMap<String, ArrayList<Employee>> mapOfEmployees){
        //checking if there's already an arraylist of scooters
        if (mapOfEmployees.containsKey("Driver") == false){
            ArrayList<Employee> tmp = new ArrayList<Employee>();
            mapOfEmployees.put("Driver", tmp);
        }
        //at this point, we can safely add a Driver to the list
        mapOfEmployees.get("Driver").add(this);
    }
}
