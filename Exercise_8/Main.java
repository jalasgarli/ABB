package Exercise_8;

public class Main {
    public static void main(String[] args) {
        Library librarySystem = new Library();

        Book book1 = new Book("1984", "George Orwell", "Dystopian Fiction", 1949);
        Book book2 = new Book("Pride and Prejudice", "Jane Austen", "Romance", 1813);
        Book book3 = new Book("The Da Vinci Code", "Dan Brown", "Mystery", 2003);
        Book book4 = new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", 1937);

        librarySystem.addBook(book1);
        librarySystem.addBook(book2);
        librarySystem.addBook(book3);
        librarySystem.addBook(book4);

        System.out.println("Sort by title: ");
        System.out.println(librarySystem.sortByTitle());

        System.out.println("\nSort byt author: ");
        System.out.println(librarySystem.sortByAuthor());

    
        System.out.println("Sort by Year: ");
        System.out.println(librarySystem.sortByYear());

        System.out.println("Search by title");
        System.out.println(librarySystem.searchByTitle("the hobbit"));

        System.out.println("Search by author");
        System.out.println(librarySystem.searchByAuthor("George Orwell"));

        System.out.println("Search by genre");
        System.out.println(librarySystem.searchByGenre("Fantasy"));

        System.out.println("\nNumber of books: ");
        System.out.println(librarySystem.numberOfBooks());


        System.out.println("\nRemoving Second Book");
        librarySystem.removeBook(book2);

        System.out.println("\nNumber of books: ");
        System.out.println(librarySystem.numberOfBooks());

        System.out.println("Average publication year:");
        System.out.println(librarySystem.averagePublicationYear());


    }
}
