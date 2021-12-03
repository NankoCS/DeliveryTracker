public class AppliDelivery {
    public static void main(String[] args){
        ExpertCyclist raphael = new ExpertCyclist("Raphael", 60.0, 25.5);
        System.out.println(raphael.getClass());
        Bicycle redBicycle = new Bicycle("red bicycle", 550, raphael);
        redBicycle.DisplayVehicule();
        System.out.println(raphael.getLoad());

        Coordinates setOfCoordinates = new Coordinates(35.5, 55.5);
        System.out.println(setOfCoordinates.getLatitude());
        System.out.println(setOfCoordinates.getLongitude());
    }
}
