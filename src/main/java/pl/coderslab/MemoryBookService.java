package pl.coderslab;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//@Component
@Service
public class MemoryBookService {
    private static List<Book> books = new ArrayList<>(Arrays.asList(
            new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel", "Helion", "programming"),
            new Book(2L, "1234567891234", "Pan Tadeusz", "Adam Mickiewicz", "Libro", "classic"),
            new Book(3L, "9876543219876", "Mein Kampf", "Adolf Hitler", "Axel Springer", "military"),
            new Book(4L, "1928374656473", "Pan Wołodyjowski", "Henryk Sienkiewicz", "PWN", "history"),
            new Book(5L, "9911882277336", "Elementarz", "Marian Falski", "Czytelnik", "education")
    ));
    private static Long lastId = 6L;

    public List<Book> listAllBooks() {
        return books;
    }

    public Book getBook(long id) {
        for (Book b : books) {
            if (b.getId() == id) {
                int index = books.indexOf(b);
                return books.get(index);
            }
        }
        return null;
    }

    public void addBook(Book book) {
        book.setId(lastId);
        lastId += 1;
        System.out.println(book);
        books.add(book);
    }

    public void deleteBook(long id) {
        books = books.stream()
                .filter(el -> el.getId() != id)
                .collect(Collectors.toList());
    }

    public void updateBook(Book book) {
        Long id = book.getId();
        for (Book b : books) {
            if (b.getId() == id) {
                int index = books.indexOf(b);
                books.set(index, book);
                break;
            }
        }
    }

}
