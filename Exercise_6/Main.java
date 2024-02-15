package Exercise_6;

public class Main {
    public static void main(String[] args) {
        GenericStorage<Person> genericStorage = new GenericStorage<>();
        Person student1 = new Student("Ali", 18);
        Person student2 = new Student("Fuad", 23);
        genericStorage.addItem(student1);
        genericStorage.addItem(student2);
        Person teacher1 = new Teacher("Murad", 39);
        Person teacher2 = new Teacher("Fidan", 43);
        genericStorage.addItem(teacher1);
        genericStorage.addItem(teacher2);
        genericStorage.displayAllItems();

        System.out.println("Remove item 2");
        genericStorage.removeItem(2);
        genericStorage.displayAllItems();

        System.out.println("Search item no: 1");
        System.out.println(genericStorage.searchItem(4));

    }
}
