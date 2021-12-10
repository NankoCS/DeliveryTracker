public abstract class Employee implements AddableEmployee{
    private String name;
    private double weight;
    //in euros per hour
    private double salary;
    private double load;
    //boolean to know if the employee is currently in delivery or not
    private boolean inDelivery;

    //constructor
    public Employee(String name, double weight, double salary){
        this.name = name;
        this.weight = weight;
        this.salary = salary;
        this.load = weight/Parameters.loadDividor;
        this.inDelivery = false;
    }

    //getter methods
    public String getName(){
        return this.name;
    }

    public double getWeight(){
        return this.weight;
    }

    public double getSalary(){
        return this.salary;
    }

    public double getLoad(){
        return this.load;
    }

    public boolean getInDelivery(){
        return this.inDelivery;
    }

    public abstract String getVehiculeClass();

}
