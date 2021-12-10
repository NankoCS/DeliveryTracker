import java.util.ArrayList;
import java.util.HashMap;

public class Company {
    private ArrayList<Vehicule> listOfVehicules;
    private ArrayList<Employee> listOfEmployees;
    private HashMap<String, ArrayList<Employee>> MapOfEmployees;
    private HashMap<String, ArrayList<Vehicule>> MapOfVehicules;
    private String name;
    private String adress;
    private Coordinates setOfCoordinates;

    public Company(String name, String adress, Coordinates setOfCoordinates){
        this.listOfEmployees = new ArrayList<Employee>();
        this.listOfVehicules = new ArrayList<Vehicule>();
        this.MapOfEmployees = new HashMap<String, ArrayList<Employee>>();
        this.MapOfVehicules = new HashMap<String, ArrayList<Vehicule>>();
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

    public ArrayList<Employee> getListOfEmployees(){
        return this.listOfEmployees;
    }

    public ArrayList<Vehicule> getListOfVehicules(){
        return this.listOfVehicules;
    }

    public HashMap<String, ArrayList<Vehicule>> getHashMap(){
        return MapOfVehicules;
    }

    public void addVehicule(Vehicule vehicule){
        vehicule.addToCompany(this.MapOfVehicules);
    }

    public void addEmployee(Employee employee){
        this.listOfEmployees.add(employee);
    }

    public ArrayList<Delivery> getAllDoableDeliveries(double weight, double duration){
        Delivery tmp;
        ArrayList<Delivery> listOfDeliveries = new ArrayList<Delivery>();
        for (int i = 0; i < this.listOfEmployees.size(); i++){
            for (int j = 0; j < this.listOfVehicules.size(); j++){
                tmp = new Delivery(weight, duration, this.listOfEmployees.get(i), this.listOfVehicules.get(j));
                if (tmp.validEmployeeAndVehicule()){
                    listOfDeliveries.add(tmp);
                }
            }
        }
        return listOfDeliveries;
    }




    public String toString(){
        return 
        "\n--- " + this.getName() + " ---" + " \n" 
        + "Location: " + this.getAdress() + " - " + this.getCoordinates().toString() + "\n"
        + "Number of Employees: " + this.listOfEmployees.size() + "\n"
        + "Number of vehicules: " + this.listOfVehicules.size();
    }

}
