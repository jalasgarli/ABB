package Exercise_5.Task_1;

public class FullTimeEmployee implements Employee {
    private String name;
    private long id;
    private double monthlySalary;
    public FullTimeEmployee(String name, long id, double monthlySalary) {
        this.name = name;
        this.id = id;
        this.monthlySalary = monthlySalary;
    }
    public double calculateSalary() {
        return monthlySalary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Id: " + id + " Salary: " + calculateSalary());
    }
}
