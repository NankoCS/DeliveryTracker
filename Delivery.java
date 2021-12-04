public class Delivery {
    private Coordinates origin;
    private Coordinates destination;
    private double weight;
    private double distance;

    public Delivery(Coordinates origin, Coordinates destination, double weight, double distance) {
        this.origin = origin;
        this.destination = destination;
        this.weight = weight;
        this.distance = distance;
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

    public double getDuration(Vehicule vehicule) {
        return ((this.getDistance() / vehicule.getAvgSpeed()) * 60) * 2;
    }

    public boolean doable(Employee employee, Vehicule vehicule) {
        // only need to check if the load of the vehicule is superior
        if ((vehicule.getLoad() >= this.weight) && (this.getDuration(vehicule) <= 60.0)) {
            return true;
        } else {
            return false;
        }
    }

    // co2 emission in grams
    public double getCo2Emission(Vehicule vehicule) {
        return this.getDistance() * vehicule.getCo2Emission();
    }

    public double getPriceOfDelivery(Vehicule vehicule, Employee employee) {
        return this.getDistance() * vehicule.getUtilizationCost()
                + (this.getDuration(vehicule) / 60) * employee.getSalary();
    }

    // check if same deliveries
    public Delivery getBestDelivery(Vehicule firstVehicule, Delivery otherDelivery, Vehicule secondVehicule,
            Employee firstEmployee, Employee secondEmployee) {
        if ((this.getCo2Emission(firstVehicule) > otherDelivery.getCo2Emission(secondVehicule)
                && (this.getPriceOfDelivery(firstVehicule, firstEmployee) > otherDelivery
                        .getPriceOfDelivery(secondVehicule, secondEmployee))
                || (this.getCo2Emission(firstVehicule) > otherDelivery.getCo2Emission(secondVehicule)
                        && (this.getPriceOfDelivery(firstVehicule, firstEmployee) == otherDelivery
                                .getPriceOfDelivery(secondVehicule, secondEmployee))
                        || (this.getCo2Emission(firstVehicule) == otherDelivery.getCo2Emission(secondVehicule)
                                && (this.getPriceOfDelivery(firstVehicule, firstEmployee) > otherDelivery
                                        .getPriceOfDelivery(secondVehicule, secondEmployee)))))) {
            return otherDelivery;
        } else {
            return this;
        }
    }

    public String toString(){
        return "Delivery starting from: " + this.getOrigin().toString() + "\nGoing to: " + this.getDestination().toString();
    }

    // add in bonus possibility for customer to pay extra to either make the
    // delivery man go further or make the delivery be on top of the priority

}
