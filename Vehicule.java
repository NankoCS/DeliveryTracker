public abstract class Vehicule implements AddableVehicule {

    // attributes
    private String name;
    private double price; // euros
    private double avgSpeed; // km per h
    private double co2Emission; // in grams per kilometers
    private double load; // how much a vehicule can carry
    private double utilizationCost; // on one kilometer in terms of euros per kilometer

    // methods
    public Vehicule(String name, double price, double co2Emission, double load, double utilizationCost) {
        this.name = name;
        this.price = price;
        this.co2Emission = co2Emission;
        this.load = load;
        this.utilizationCost = utilizationCost;
    }

    // overriding the constructor with another one that will allow us to input the
    // avgSpeed directly as a parameter, which will be used for a scooter in our
    // case but it could also be used
    // for cars and anything motorized if we one day need to add one into our
    // program.
    public Vehicule(String name, double avgSpeed, double price, double co2Emission, double load,
            double utilizationCost) {
        this.name = name;
        this.price = price;
        this.avgSpeed = avgSpeed;
        this.co2Emission = co2Emission;
        this.load = load;
        this.utilizationCost = utilizationCost;
    }

    // setter method to change the avgSpeed of the vehicule with a method as it is
    // not something that will be inputted as parameter for a bicycle.
    protected void setAvgSpeed(double avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    // setter method that will be used to later on change how much can a vehicule
    // carry. We can suppose in the future certain vehicules adding storage like a
    // bicycle adding a basket for example
    public void setLoad(Employee employee) {
        this.load = Math.max(this.load, employee.getLoad());
    }

    // getter methods
    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public double getAvgSpeed() {
        return this.avgSpeed;
    }

    public double getCo2Emission() {
        return this.co2Emission;
    }

    public double getLoad() {
        return this.load;
    }

    public double getUtilizationCost() {
        return this.utilizationCost;
    }

    // methods added to facilitate the display
    // change this to a toString returning a string that we'll display in the main
    public String toString(){
        return " -- " + this.getName() + " -- \n"
        +(" -- Bought for $" + this.getPrice() + " -- \n")
        +(" -- Travels at " + this.getAvgSpeed() + "km/h -- \n")
        +(" -- " + this.getCo2Emission() + " g/km of CO2 emitted -- \n")
        +(" -- Can carry up to " + this.getLoad() + " kg -- \n")
        +(" -- Costs " + this.getUtilizationCost() + " euros/km -- \n");
    }

    //method to test inheritance
    // public String display(){
    //     return "this is a vehicule";
    // }
}
