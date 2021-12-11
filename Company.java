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

    //method to get ALL of the doable deliveries (vehicule matching with what an employee can drive)
    public ArrayList<Delivery> getAllDeliveries(double weight, double distance, Coordinates destination){
        ArrayList<Delivery> tmpALOfDeliveries = new ArrayList<Delivery>();
        Delivery tmpDelivery;
        //iterating through each key of the map of vehicules to get the key
        for (String key : this.getMapOfVehicules().keySet()){
            if (this.getMapOfEmployees().get(key) != null){
                if (this.getMapOfVehicules().get(key) != null){
                    for (int i = 0; i < this.getMapOfVehicules().get(key).size(); i++){
                        for (int j = 0; j < this.getMapOfEmployees().get(key).size(); j++){
                            tmpDelivery = new Delivery(this.getCoordinates(), destination, weight, distance, this.getMapOfEmployees().get(key).get(j), this.getMapOfVehicules().get(key).get(i));
                            tmpALOfDeliveries.add(tmpDelivery);
                        }
                    }
                }
            //System.out.println(SpaceX.getMapOfEmployees().get(key));
            }
        }
        return tmpALOfDeliveries;
    }

    //method to get ALL of the POSSIBLE deliveries (weight and duration valid)
    //I could've added the necessary condition in the previous method but I decided to make another function for that since I could want in the future to be able to get ALL of the deliveries
    //as maybe we could add a way for the customer to pay extra fees to make the delivery person go further
    public ArrayList<Delivery> getAllPossibleDeliveries(ArrayList<Delivery> listOfDeliveries){
        ArrayList<Delivery> tmpALOfPossibleDeliveries= new ArrayList<Delivery>();
        for (Delivery delivery : listOfDeliveries){
            if (delivery.validWeightAndDuration()){
                tmpALOfPossibleDeliveries.add(delivery);
            }
        }
        return tmpALOfPossibleDeliveries;
    }




    // public String toString(){
    //     return 
    //     "\n--- " + this.getName() + " ---" + " \n" 
    //     + "Location: " + this.getAdress() + " - " + this.getCoordinates().toString() + "\n"
    //     + "Number of Employees: " + this.listOfEmployees.size() + "\n"
    //     + "Number of vehicules: " + this.listOfVehicules.size();
    // }

}
