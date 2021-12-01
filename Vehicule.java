public class Vehicule {

    //attributes
    private String name;
    private double price; //euros
    private double avgSpeed; //km per h
    private double co2Emission; //in grams per kilometers
    private double load; //how much a vehicule can carry
    private double utilizationCost; //on one kilometer in terms of euros per kilometer

    
    //methods

    //constructor
    public Vehicule(String name, double price, double avgSpeed, double co2Emission, double load, double utilizationCost){
        this.name = name;
        this.price = price;
        this.avgSpeed = avgSpeed;
        this.co2Emission = co2Emission;
        this.load = load;
        this.utilizationCost = utilizationCost;
    }

    //getter methods
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public double getAvgSpeed(){
        return this.avgSpeed;
    }
    public double getCo2Emission(){
        return this.co2Emission;
    }
    public double getLoad(){
        return this.load;
    }
    public double getUtilizationCost(){
        return this.utilizationCost;
    }

    //methods added to facilitate the display
    public void DisplayVehicule(){
        System.out.println(" -- " + this.getName() + " -- ");
        System.out.println(" -- Bought for $" + this.getPrice() + " -- ");
        System.out.println(" -- Travels at " + this.getAvgSpeed() + "km/h -- ");
        System.out.println(" -- " + this.getCo2Emission() + " g/km of CO2 emitted -- ");
        System.out.println(" -- Can carry up to " + this.getLoad() + " kg -- ");
        System.out.println(" -- Costs " + this.getUtilizationCost() + " euros/km -- ");
    }
}
