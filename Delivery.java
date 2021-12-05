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

    //maybe setter of distance to change with frontend later on

    public void getInstanceOfVehicule(){
        System.out.println(this.getDeliveryVehicule().getClass());
    }

    public boolean matchingEmployeeAndVehicule(){
        if (this.getDeliveryVehicule().getClass().toString() == this.getDeliveryPerson().getVehiculeClass()){
            return true;
        }
        else {
            return false;
        }
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

    public boolean doable() {
        // only need to check if the load of the vehicule is superior
        if ((this.getDeliveryVehicule().getLoad() >= this.weight) && (this.getDuration() <= 60.0)) {
            return true;
        } else {
            return false;
        }
    }

    // co2 emission in grams
    public double getCo2Emission() {
        return this.getDistance() * this.getDeliveryVehicule().getCo2Emission();
    }

    public double getPriceOfDelivery() {
        return this.getDistance() * this.getDeliveryVehicule().getUtilizationCost()
                + (this.getDuration() / 60) * this.getDeliveryPerson().getSalary();
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

    public String toString() {
        return "Delivery starting from: " + this.getOrigin().toString() + "\nGoing to: "
                + this.getDestination().toString();
    }

    // add in bonus possibility for customer to pay extra to either make the
    // delivery man go further or make the delivery be on top of the priority

}
