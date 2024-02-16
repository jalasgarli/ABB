package Exercise_7;

public class Employee {
    private String name;
    private int experience;
    public Employee(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
    public String getName() {
        return name;
    }
}
