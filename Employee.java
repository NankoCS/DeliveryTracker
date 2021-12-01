public class Employee {
    private String name;
    private double weight;
    //euros per hour
    private double salary;
    private double load;

    public Employee(String name, double weight, double salary){
        this.name = name;
        this.weight = weight;
        this.salary = salary;
        this.load = weight/Parameters.loadDividor;
    }
}
