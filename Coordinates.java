import java.util.HashMap;

public class Coordinates {
    private HashMap<String, Double> coordinates;
    private double latitude;
    private double longitude;

    public Coordinates(){
        this.coordinates = new HashMap<String, Double>();
    }
    public Coordinates(double latitude, double longitude){
        this.coordinates = new HashMap<String, Double>();
        coordinates.put("latitude", latitude);
        coordinates.put("longitude", longitude);
    }

    public double getLatitude(){
        return this.coordinates.get("latitude");
    }

    public double getLongitude(){
        return this.coordinates.get("longitude");
    }
}
