public class Scooter extends Vehicule {
    private double cylinder;
    private double gasConsumption;

    public Scooter(String name, double price, double load, double cylinder, double gasConsumption) {
        super(name, Parameters.baseSpeed + cylinder / Parameters.cylinderDividor, price,
                cylinder / Parameters.co2EmissionDividor, load,
                price / Parameters.utilizationCostDiver + gasConsumption/100 * Parameters.priceOfGasPerLiter);
        this.cylinder = cylinder;
        this.gasConsumption = gasConsumption;
    }

    public double getCylinder() {
        return this.cylinder;
    }

    public double getGasConsumption() {
        return this.gasConsumption;
    }

    //method to test inheritance
    // public String display(){
    //     return "this is a Scooter";
    // }
}
