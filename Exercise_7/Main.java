package Exercise_7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static Map<String, Double> MaxAndMin(List<Employee> employees) {
        List<Employee> experience_more_than_two = new ArrayList<>();
        for(Employee employee: employees) {
            if(employee.getExperience() > 2) {
                experience_more_than_two.add(employee);
            }
        }

        double max = Double.MIN_NORMAL;
        double min = Double.MAX_VALUE;

        for(Employee employee: experience_more_than_two) {
            double salary = 0.0;
            if(employee instanceof PartTimeEmployee) {
                salary = ((PartTimeEmployee)employee).getSalary();
            } else if(employee instanceof FullTimeEmployee) {
                salary = ((FullTimeEmployee)employee).getSalary();
            }
            if(salary < min) {
                min = salary;
            } 
            if(salary > max) {
                max = salary;
            }
        }

        Map<String, Double> result = new HashMap<>();
        result.put("Max", max);
        result.put("Min", min);
        
        return result;
    }
    public static void main(String[] args) {
        Employee employee1 = new FullTimeEmployee("Javid", 3, 2000.50);
        Employee employee2 = new PartTimeEmployee("Ali", 3, 20, 40.5);
        Employee employee3 = new FullTimeEmployee("Nijat", 5, 4000.0);
        Employee employee4 = new FullTimeEmployee("Fuad", 4, 6000);
        Employee employee5 = new PartTimeEmployee("Cooper", 4, 30, 60.2);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1); employees.add(employee2);
        employees.add(employee3); 
        employees.add(employee4); employees.add(employee5);
        
        Map<String, Double> result = MaxAndMin(employees);
        System.out.println("Max: " + result.get("Max"));
        System.out.println("Min: " + result.get("Min"));
    }
}
