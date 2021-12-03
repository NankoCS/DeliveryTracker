import java.util.ArrayList;

public class Company {
    ArrayList<Vehicule> listOfVehicules;
    ArrayList<Employee> listOfEmployees;
    String name;
    String adress;
    Coordinates setOfCoordinates;

    public Company(String name, String adress, double latitude, double longitude){
        this.listOfEmployees = new ArrayList<Employee>();
        this.listOfVehicules = new ArrayList<Vehicule>();
        this.name = name;
        this.adress = adress;
        this.setOfCoordinates = new Coordinates(latitude, longitude);
    }

    public String getName(){
        return this.name;
    }

    public String getAdress(){
        return this.adress;
    }

    public ArrayList<Employee> getListOfEmployees(){
        return this.listOfEmployees;
    }

    public ArrayList<Vehicule> getListOfVehicules(){
        return this.listOfVehicules;
    }

}
