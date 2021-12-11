import java.util.ArrayList;
import java.util.HashMap;

public class Company {

    private HashMap<String, ArrayList<Employee>> mapOfEmployees;
    private HashMap<String, ArrayList<Vehicule>> mapOfVehicules;
    private String name;
    private String adress;
    private Coordinates setOfCoordinates;

    public Company(String name, String adress, Coordinates setOfCoordinates){
        this.mapOfEmployees = new HashMap<String, ArrayList<Employee>>();
        this.mapOfVehicules = new HashMap<String, ArrayList<Vehicule>>();
        this.name = name;
        this.adress = adress;
        this.setOfCoordinates = setOfCoordinates;
    }

    public String getName(){
        return this.name;
    }

    public String getAdress(){
        return this.adress;
    }

    public Coordinates getCoordinates(){
        return this.setOfCoordinates;
    }


    public HashMap<String, ArrayList<Vehicule>> getMapOfVehicules(){
        return mapOfVehicules;
    }
    public HashMap<String, ArrayList<Employee>> getMapOfEmployees(){
        return mapOfEmployees;
    }

    public void addVehicule(Vehicule vehicule){
        vehicule.addToCompany(this.mapOfVehicules);
    }

    public void addEmployee(Employee employee){
        employee.addToCompany(this.mapOfEmployees);
    }

    public ArrayList<Delivery> makePossibleDeliveries(HashMap<String, ArrayList<Vehicule>> mapOfVehicule, HashMap<String, ArrayList<Employee>> mapOfEmployee){
        ArrayList<Delivery> tmp = new ArrayList<Delivery>();
        //for (int i = 0; i < mapOfVehicule.get("key"))
        return tmp;
    }




    // public String toString(){
    //     return 
    //     "\n--- " + this.getName() + " ---" + " \n" 
    //     + "Location: " + this.getAdress() + " - " + this.getCoordinates().toString() + "\n"
    //     + "Number of Employees: " + this.listOfEmployees.size() + "\n"
    //     + "Number of vehicules: " + this.listOfVehicules.size();
    // }

}
