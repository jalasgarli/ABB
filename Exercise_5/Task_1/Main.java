package Exercise_5.Task_1;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Ali", 0, 2000.50);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Nijat", 1, 25.5, 20);
        System.out.println("Salary of Full Time Employee: " + fullTimeEmployee.calculateSalary());
        System.out.println("Salary of Full Time Employee: " + partTimeEmployee.calculateSalary());
    }
}

