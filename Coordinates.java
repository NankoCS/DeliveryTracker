import java.util.HashMap;

public class Coordinates {
    //using a hashmap instead of using an ArrayList to represent coordinates as it is more readable
    //to have coordinates.get("latitude") than coordinates.get(0) to return one of the two coordinates
    private HashMap<String, Double> coordinates;

    public Coordinates(){
        this.coordinates = new HashMap<String, Double>();
    }
    public Coordinates(double latitude, double longitude){
        this.coordinates = new HashMap<String, Double>();
        coordinates.put("latitude", latitude);
        coordinates.put("longitude", longitude);
    }

    public HashMap<String, Double> getCoordinates(){
        return this.coordinates;
    }

    //will be used to get the coordinates of not only the company, but also where the delivery will have to be done and where does the delivery person is during the delivery
    public double getLatitude(){
        return this.coordinates.get("latitude");
    }

    public double getLongitude(){
        return this.coordinates.get("longitude");
    }

    //@override of the toString method to facilitate the display of coordinates
    public String toString(){
        return "(Lat: " + this.getLatitude() + ", Long: " + this.getLongitude() + ")";
    }
}
