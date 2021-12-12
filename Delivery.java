public class Delivery {
    private Coordinates origin;
    private Coordinates destination;
    private double weight;
    //distance in km
    //for now while backend not connected to front
    private double distance;
    private Employee deliveryPerson;
    private Vehicule deliveryVehicule;

    public Delivery(Coordinates origin, Coordinates destination, double weight, double distance,
            Employee deliveryperson, Vehicule deliveryVehicule) {
        this.origin = origin;
        this.destination = destination;
        this.weight = weight;
        this.distance = distance;
        this.deliveryPerson = deliveryperson;
        this.deliveryVehicule = deliveryVehicule;
    }
    public Delivery(double weight, double distance, Employee deliveryperson, Vehicule deliveryVehicule) {
        this.weight = weight;
        this.distance = distance;
        this.deliveryPerson = deliveryperson;
        this.deliveryVehicule = deliveryVehicule;
    }


    //change duration later on when backend working


    //maybe setter of distance to change with frontend later on

    public String getInstanceOfVehicule(){
        return this.getDeliveryVehicule().getClass().toString();
    }

    public double getDistance() {
        return this.distance;
    }

    public Coordinates getOrigin() {
        return this.origin;
    }

    public Coordinates getDestination() {
        return this.destination;
    }

    public double getWeight() {
        return this.weight;
    }

    public Vehicule getDeliveryVehicule() {
        return this.deliveryVehicule;
    }

    public Employee getDeliveryPerson() {
        return this.deliveryPerson;
    }

    public double getDuration() {
        return ((this.getDistance() / this.getDeliveryVehicule().getAvgSpeed()) * 60) * 2;
    }
    
    // co2 emission in grams
    public double getCo2Emission() {
        return this.getDistance() * this.getDeliveryVehicule().getCo2Emission();
    }

    public double getPriceOfDelivery() {
        return this.getDistance() * this.getDeliveryVehicule().getUtilizationCost()
                + (this.getDuration() / 60) * this.getDeliveryPerson().getSalary();
    }

    //method to check if the delivery is doable in terms of weight of the delivery and in terms of duration of the delivery
    public boolean validWeightAndDuration() {
        // only need to check if the load of the vehicule is superior
        if ((this.getDeliveryVehicule().getLoad() >= this.weight) && (this.getDuration() <= 60.0)) {
            return true;
        } else {
            return false;
        }
    }

    // check if same deliveries later
    public boolean worseThan(Delivery other) {
        if (((this.getCo2Emission() > other.getCo2Emission())
                && (this.getPriceOfDelivery() > other.getPriceOfDelivery()))
                || ((this.getCo2Emission() > other.getCo2Emission())
                        && (this.getPriceOfDelivery() == other.getPriceOfDelivery()))
                || ((this.getCo2Emission() == other.getCo2Emission())
                        && (this.getPriceOfDelivery() > other.getPriceOfDelivery()))) {
            return true;
        } else {
            return false;
        }
    }

    //@override of toString method to return a user friendly string of the delivery
    public String getInfos() {
        return "Delivery starting from: " + this.getOrigin().toString() + "\nGoing to: "
                + this.getDestination().toString();
    }

    public String toString(){
        return this.getDeliveryPerson() + " - " + this.getDeliveryVehicule();
    }

    public String display(){
        return "Delivery done by " + this.getDeliveryPerson().getName() + " on a " + this.getDeliveryVehicule().getName() + ", " + 
        this.getDuration() + " of delivery.";
    }

    // add in bonus possibility for customer to pay extra to either make the
    // delivery man go further or make the delivery be on top of the priority

}
