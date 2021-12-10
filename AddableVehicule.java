import java.util.HashMap;
import java.util.ArrayList;


public interface AddableVehicule {
    //method that needs to be implemented by each Vehicule class and Employee class
    void addToCompany(HashMap<String, ArrayList<Vehicule>> mapOfVehicules);
}
