
package abb_week3_tuesday;

public abstract class Animal {
    private String name;
    Animal(String name) {
        this.name = name;
    }
    public abstract void makeSound();
    public void eat() {
        System.out.println("Animal is easting");
    }
}