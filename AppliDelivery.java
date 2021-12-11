import java.lang.reflect.Array;
import java.util.ArrayList;
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
        SpaceX.addEmployee(Jake);
        Truck Blacktruck = new Truck("Blackmamba", 100.0, 150000.0, 150.0, 800.0, 9.5, Jake);
        System.out.println(Blacktruck.getAvgSpeed());
        //SpaceX.addVehicule(Blacktruck);

        //used to test inheritance
        // for (int i = 0; i < SpaceX.listOfVehicules.size(); i++){
        //     System.out.println(SpaceX.listOfVehicules.get(i).display());
        // }
        
        Coordinates origin1 = new Coordinates(55.5, 55.5);
        Coordinates destination1 = new Coordinates(150.0, 150.0);
        Delivery pizza = new Delivery(origin1, destination1, 3.0, 10.0, John, redBicycle);


        Coordinates origin2 = new Coordinates(65.5, 75.5);
        Coordinates destination2 = new Coordinates(100.0, 100.0);
        Delivery pizza2 = new Delivery(origin2, destination2, 3.0, 10.0, Jake, redScooter);
        System.out.println(pizza.toString());
        System.out.println(pizza2.toString());
        System.out.println(pizza.getInstanceOfVehicule());
        System.out.println(pizza2.getInstanceOfVehicule());
        System.out.println(John.getClass());
        System.out.println(Jake.getClass());
        System.out.println(redBicycle.getClass().toString());

        System.out.println(pizza.getInstanceOfVehicule());

        System.out.println(SpaceX.getMapOfEmployees());
        System.out.println(SpaceX.getMapOfVehicules());
        

        ExpertCyclist Johnn = new ExpertCyclist("Johnn", 60.0, 25.5);
        ExpertCyclist Johnnn = new ExpertCyclist("Johnnn", 60.0, 25.5);
        ExpertCyclist Johnnnn = new ExpertCyclist("Johnnnn", 60.0, 25.5);
        Employee Jakee = new Driver("Jakee", 85.0, 35.5);
        Employee Jakeee = new Driver("Jakeee", 85.0, 35.5);
        //SpaceX.addEmployee(Jakee);
        //SpaceX.addEmployee(Jakeee);
        //SpaceX.addEmployee(Johnn);
        //SpaceX.addEmployee(Johnnn);
        //SpaceX.addEmployee(Johnnnn);

        Bicycle blueBicycle = new Bicycle("blue bicycle", 550);
        Scooter blueScooter = new Scooter("Blue scooter", 3500.0, 50.0, 300.0, 7.5);
        blueBicycle.setLoad(John);
        blueBicycle.setAvgSpeed(John);
        SpaceX.addVehicule(blueBicycle);
        SpaceX.addVehicule(blueScooter);

        System.out.println(SpaceX.getMapOfVehicules().values());
        System.out.println(SpaceX.getMapOfEmployees().values());

        ArrayList<Delivery> tmp = SpaceX.getAllDeliveries(2.2, 3.2, destination1);
        ArrayList<Delivery> tmp2 = SpaceX.getAllPossibleDeliveries(tmp);
        for (Delivery delivery : tmp){
            System.out.println(delivery);
        }

        Delivery test1 = new Delivery(SpaceX.getCoordinates(), destination1, 2.2, 3.2, John, redBicycle);
        Delivery test2 = new Delivery(SpaceX.getCoordinates(), destination1, 2.2, 3.2, John, blueBicycle);

        System.out.println(test1.validWeightAndDuration());
        System.out.println(test2.validWeightAndDuration());
    }
}