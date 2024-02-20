package Exercise_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book newBook) {
        books.add(newBook);
    }

    public void removeBook(Book book) {
        if(books.contains(book)) {
            System.out.println("Book does not exist");
            return;
        }
        books.remove(book);
    }

    public List<Book> searchByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }

    public List<Book> searchByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    public List<Book> searchByGenre(String genre) {
        return books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }

    public List<Book> sortByTitle() {
        return books.stream()
            .sorted(Comparator.comparing(Book::getTitle))
            .collect(Collectors.toList());
    }

    public List<Book> sortByAuthor() {
        return books.stream()
                .sorted(Comparator.comparing(Book::getAuthor))
                .collect(Collectors.toList());
    }

    public List<Book> sortByYear() {
        return books.stream()
            .sorted(Comparator.comparingInt(Book::getYear))
            .collect(Collectors.toList());
    }

    public double averagePublicationYear() {
        return books.stream()
                .mapToInt(Book::getYear)
                .average()
                .orElse(0);
    }

    public int numberOfBooks() {
        return books.size();
    }
}
