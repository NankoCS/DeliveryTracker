import java.util.ArrayList;
import java.util.HashMap;

public abstract class Cyclist extends Employee {
    private double avgSpeed;


    public Cyclist(String name, double weight, double salary){
        super(name, weight, salary);
    }

    public void addToCompany(HashMap<String, ArrayList<Employee>> mapOfEmployees){
        //checking if there's already an arraylist of scooters
        if (mapOfEmployees.containsKey("Cyclist") == false){
            ArrayList<Employee> tmp = new ArrayList<Employee>();
            mapOfEmployees.put("Cyclist", tmp);
        }
        //at this point, we can safely add a Driver to the list
        mapOfEmployees.get("Cyclist").add(this);
    }

    public abstract double getAvgSpeed();
}
