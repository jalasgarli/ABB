package Exercise_5.Task_1;

public class PartTimeEmployee implements Employee {
    private String name;
    private long id;
    private double hourlyRate;
    private double hoursWorked;

    public PartTimeEmployee(String name, long id, double hourlyRate, double hoursWorked) {
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    } 

    public double calculateSalary() {
        return (hourlyRate * hoursWorked);
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Id: " + id + " Salary: " + calculateSalary());
    }
}
