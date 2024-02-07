package abb_week3_tuesday;

public class Bird extends Animal {
    private String color;
    public Bird(String name, String color) {
        super(name);
        this.color = color;
    } 
    public void makeSound() {
        System.out.println("Aaaaaaaa");
    }

    public void eat() {
        super.eat();
        System.out.println("Bird is eating");
    }
}
