public class Employee {
    private String name;
    private double weight;
    //in euros per hour
    private double salary;
    private double load;

    //constructor
    public Employee(String name, double weight, double salary){
        this.name = name;
        this.weight = weight;
        this.salary = salary;
        this.load = weight/Parameters.loadDividor;
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


}
