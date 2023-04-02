package Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookCatalogue {
    private List<Book> books;

    public BookCatalogue() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public List<Book> searchByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    public List<Book> searchByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equals(title))
                .collect(Collectors.toList());
    }

    public double getTotalPrice() {
        return books.stream()
                .mapToDouble(Book::getPrice)
                .sum();
    }
}
