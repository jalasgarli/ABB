package Exercise_7;

public class PartTimeEmployee extends Employee {
    private int hours;
    private double hours_salary;

    public PartTimeEmployee(String name, int experience, int hours, double hours_salary) {
        super(name, experience);
        this.hours = hours;
        this.hours_salary = hours_salary;
    }
    
    public double getSalary() {
        return (hours * hours_salary);
    }
}
