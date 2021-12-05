public class AppliDelivery {
    public static void main(String[] args){

        ExpertCyclist John = new ExpertCyclist("John", 60.0, 25.5);
        System.out.println(John.getClass());


        Bicycle redBicycle = new Bicycle("red bicycle", 550);
        System.out.println(redBicycle.toString());
        System.out.println(John.getLoad());
        redBicycle.setLoad(John);
        redBicycle.setAvgSpeed(John);
        System.out.println(redBicycle.toString());


        Coordinates setOfCoordinates = new Coordinates(33.919434, -118.353996);
        System.out.println(setOfCoordinates.getLatitude());
        System.out.println(setOfCoordinates.getLongitude());
        Company SpaceX = new Company("SpaceX", "Rocket Road Hawthorne, California", setOfCoordinates);

        Scooter redScooter = new Scooter("Yamama", 3500.0, 50.0, 300.0, 7.5);
        System.out.println(redScooter.toString());
        SpaceX.addVehicule(redBicycle);
        SpaceX.addVehicule(redScooter);
        SpaceX.addEmployee(John);
        System.out.println(SpaceX.toString());

        //code to test out the extensibility of our code
        Employee Jake = new Driver("Jake", 85.0, 35.5);
        Truck Blacktruck = new Truck("Blackmamba", 100.0, 150000.0, 150.0, 800.0, 9.5, Jake);
        System.out.println(Blacktruck.toString());
        SpaceX.addVehicule(Blacktruck);

        //used to test inheritance
        // for (int i = 0; i < SpaceX.listOfVehicules.size(); i++){
        //     System.out.println(SpaceX.listOfVehicules.get(i).display());
        // }
        
        Coordinates origin1 = new Coordinates(55.5, 55.5);
        Coordinates destination1 = new Coordinates(150.0, 150.0);
        Delivery pizza = new Delivery(origin1, destination1, 3.0, 10.0, Jake, redBicycle);


        Coordinates origin2 = new Coordinates(65.5, 75.5);
        Coordinates destination2 = new Coordinates(100.0, 100.0);
        Delivery pizza2 = new Delivery(origin2, destination2, 3.0, 10.0, Jake, redScooter);
        System.out.println(pizza.toString());
        System.out.println(pizza2.toString());
        pizza.getInstanceOfVehicule();
        pizza2.getInstanceOfVehicule();
        System.out.println(John.getClass());
        System.out.println(Jake.getClass());
        System.out.println(redBicycle.getClass().toString());
        System.out.println(pizza.matchingEmployeeAndVehicule());
    }
}