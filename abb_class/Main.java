package abb_class;

public class Main {
    public static void main(String[] args) {
        Mammal animal = new Dog();
        animal.describe();
        animal.makeSound();

        Mammal animal2 = new Cat();
        animal2.describe();
        animal2.makeSound();

    }
}
