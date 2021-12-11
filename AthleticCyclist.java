import java.util.ArrayList;
import java.util.HashMap;

public class AthleticCyclist extends Cyclist{
    private double avgSpeed = Parameters.athleticBicycleSpeed;

    public AthleticCyclist(String name, double weight, double salary){
        super(name, weight, salary);
    }

    public double getAvgSpeed(){
        return this.avgSpeed;
    }


    //idea was to make deliveries only with pairable employees and vehicules, for that i get into directly the map with the key and i iterate over the list
}
