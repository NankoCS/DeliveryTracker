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


    public String toString(){
        return this.getName();
    }
}
