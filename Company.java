import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class Company {

    private HashMap<String, ArrayList<Employee>> mapOfEmployees;
    private HashMap<String, ArrayList<Vehicule>> mapOfVehicules;
    private ArrayList<Delivery> ListOfDeliveries;
    private String name;
    private String adress;
    private Coordinates setOfCoordinates;

    public Company(String name, String adress, Coordinates setOfCoordinates) {
        this.mapOfEmployees = new HashMap<String, ArrayList<Employee>>();
        this.mapOfVehicules = new HashMap<String, ArrayList<Vehicule>>();
        this.name = name;
        this.adress = adress;
        this.setOfCoordinates = setOfCoordinates;
        this.ListOfDeliveries = new ArrayList<Delivery>();
    }

    public String getName() {
        return this.name;
    }

    public String getAdress() {
        return this.adress;
    }

    public Coordinates getCoordinates() {
        return this.setOfCoordinates;
    }

    public HashMap<String, ArrayList<Vehicule>> getMapOfVehicules() {
        return mapOfVehicules;
    }

    public HashMap<String, ArrayList<Employee>> getMapOfEmployees() {
        return mapOfEmployees;
    }

    public void addVehicule(Vehicule vehicule) {
        vehicule.addToCompany(this.mapOfVehicules);
    }

    public void addEmployee(Employee employee) {
        employee.addToCompany(this.mapOfEmployees);
    }

    // method to get ALL of the doable deliveries (vehicule matching with what an
    // employee can drive)
    public ArrayList<Delivery> getDifferentDeliveriesForOneItem(double weight, double distance, Coordinates destination) {
        ArrayList<Delivery> tmpALOfDeliveries = new ArrayList<Delivery>();
        Delivery tmpDelivery;
        // iterating through each key of the map of vehicules to get the key
        for (String key : this.getMapOfVehicules().keySet()) {
            if (this.getMapOfEmployees().get(key) != null) {
                if (this.getMapOfVehicules().get(key) != null) {
                    for (int i = 0; i < this.getMapOfVehicules().get(key).size(); i++) {
                        for (int j = 0; j < this.getMapOfEmployees().get(key).size(); j++) {
                            tmpDelivery = new Delivery(this.getCoordinates(), destination, weight, distance,
                                    this.getMapOfEmployees().get(key).get(j), this.getMapOfVehicules().get(key).get(i));
                            tmpALOfDeliveries.add(tmpDelivery);
                        }
                    }
                }
                // System.out.println(SpaceX.getMapOfEmployees().get(key));
            }
        }
        return tmpALOfDeliveries;
    }

    // method to get ALL of the VALID deliveries (weight and duration valid) from an
    // given array list of deliveries
    // I could've added the necessary condition in the previous method but I decided
    // to make another function for that since I could want in the future to be able
    // to get ALL of the deliveries
    // as maybe we could add a way for the customer to pay extra fees to make the
    // delivery person go further
    public ArrayList<Delivery> getAllValidDeliveries(ArrayList<Delivery> listOfDeliveries) {
        ArrayList<Delivery> tmpALOfPossibleDeliveries = new ArrayList<Delivery>();
        for (Delivery delivery : listOfDeliveries) {
            // setting the load of the vehicule used in the delivery with a setter function
            // defined in the Vehicule.java file.
            // It'll set the load to the max load between the vehicule and the employee
            // driving it
            delivery.getDeliveryVehicule().setLoad(delivery.getDeliveryPerson());
            // checking if the delivery we are currently looking at is valid or not
            if (delivery.validWeightAndDuration()) {
                tmpALOfPossibleDeliveries.add(delivery);
            }
        }
        return tmpALOfPossibleDeliveries;
    }

    // method to get directly get all of the valid deliveries
    public ArrayList<Delivery> getDirectlyAllValidDeliveries(double weight, double distance, Coordinates destination) {
        ArrayList<Delivery> tmpALOfDeliveries = new ArrayList<Delivery>();
        Delivery tmpDelivery;
        // iterating through each key of the map of vehicules to get the key
        for (String key : this.getMapOfVehicules().keySet()) {
            if (this.getMapOfEmployees().get(key) != null && this.getMapOfVehicules().get(key) != null) {
                for (int i = 0; i < this.getMapOfVehicules().get(key).size(); i++) {
                    for (int j = 0; j < this.getMapOfEmployees().get(key).size(); j++) {
                        tmpDelivery = new Delivery(this.getCoordinates(), destination, weight, distance,
                                this.getMapOfEmployees().get(key).get(j), this.getMapOfVehicules().get(key).get(i));
                        // setting the load of the vehicule used in the delivery with a setter function
                        // defined in the Vehicule.java file.
                        // It'll set the load to the max load between the vehicule and the employee
                        // driving it
                        tmpDelivery.getDeliveryVehicule().setLoad(tmpDelivery.getDeliveryPerson());
                        // checking if the delivery we are currently looking at is valid or not
                        if (tmpDelivery.validWeightAndDuration()) {
                            tmpALOfDeliveries.add(tmpDelivery);
                        }
                    }
                }
            }
        }
        return tmpALOfDeliveries;
    }

    public ArrayList<Delivery> getListOfNotWorseDeliveries(ArrayList<Delivery> listOfDeliveries){
        ArrayList<Delivery> tmpArrayList = new ArrayList<Delivery>();
        boolean worseThan;
        int i;
        for (Delivery delivery : listOfDeliveries){
            worseThan = false;
            i = 0;
            while (worseThan == false && i < listOfDeliveries.size()){
                if (delivery.worseThan(listOfDeliveries.get(i))){
                    worseThan = true; 
                }
                i++;
            }
            //if worseThan is false, that means he never was a worse delivery than any other, which means we can add it to our AL
            if (!worseThan){
                tmpArrayList.add(delivery);
            }
            System.out.println(worseThan);
        }

        return tmpArrayList;
    }

    public ArrayList<Delivery> getDeliveriesInOrder(ArrayList<Delivery> listOfDeliveries){
        ArrayList<Delivery> tmpAL = listOfDeliveries;
        for (int i = 0; i < tmpAL.size() - 1; i++){
            for (int j = 0; j < tmpAL.size() - i - 1; j++){
                if (tmpAL.get(j).getCo2Emission() > tmpAL.get(j+1).getCo2Emission()){
                    Delivery tmp = tmpAL.get(j);
                    tmpAL.set(j, tmpAL.get(j+1));
                    tmpAL.set(j+1, tmp);
                }
                System.out.println(tmpAL);
            }
            
        }
        return tmpAL;
    }

    public void getOrderedBestDeliveries(){

    }

    // public String toString(){
    // return
    // "\n--- " + this.getName() + " ---" + " \n"
    // + "Location: " + this.getAdress() + " - " + this.getCoordinates().toString()
    // + "\n"
    // + "Number of Employees: " + this.listOfEmployees.size() + "\n"
    // + "Number of vehicules: " + this.listOfVehicules.size();
    // }

}
