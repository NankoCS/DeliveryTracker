public class AppliDelivery {
    public static void main(String[] args){

        ExpertCyclist raphael = new ExpertCyclist("Raphael", 60.0, 25.5);
        System.out.println(raphael.getClass());


        Bicycle redBicycle = new Bicycle("red bicycle", 550);
        redBicycle.DisplayVehicule();
        System.out.println(raphael.getLoad());
        redBicycle.setLoad(raphael);
        redBicycle.setAvgSpeed(raphael);
        redBicycle.DisplayVehicule();


        Coordinates setOfCoordinates = new Coordinates(35.5, 55.5);
        System.out.println(setOfCoordinates.getLatitude());
        System.out.println(setOfCoordinates.getLongitude());
        Company company1 = new Company("Company 1", "3 wall street", setOfCoordinates);

        Scooter redScooter = new Scooter("Yamama", 3500.0, 50.0, 300.0, 7.5);
        redScooter.DisplayVehicule();
    }
}
