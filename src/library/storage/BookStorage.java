package library.storage;

import library.model.Author;
import library.model.Book;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BookStorage implements Serializable {

    private List<Book> books = new ArrayList<>();

    public void add(Book book) {

        boolean bookFound = false;

        for (Book b : books) {

            if (b.getId() == book.getId())
                bookFound = true;
            System.err.println("There is already a book registered with id: " + book.getId());
            System.err.println(book.toString());

        }
        if (!bookFound) {
            books.add(book);
        }
    }

    public void print() {

        for (Object book : books) {
            System.out.println(book.toString());
        }

    }

    public void search(String keyword) {

        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(book);
            }
        }
    }

    public void searchBookByAuthor(Author author) {

        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book);
            }
        }
    }

    public Book getBookByMaxPrice() {

        double price = 0;
        Book result = null;

        for (Book book : books) {
            if (book.getPrice() > price) {
                result = book;
            }
        }
        return result;
    }

    public void deleteBookById(int id) {

        boolean bookFound = false;

        for (Book book : books) {
            if (book.getId() == id) {
                books.remove(book);
                bookFound = true;
                System.out.println("The book by id " + id + " deleted.");
                break;
            }
        }
    }

    public void searchBookByPriceRange(int min, int max) {

        boolean bookFound = false;

        for (Book book : books) {

            if (book.getPrice() >= min && book.getPrice() <= max) {
                bookFound = true;
                System.out.println(book.toString());
            } else if (max < min) {
                System.err.println("Error: Minimum price is greater than the Maximum! ");
                break;
            }

        }
        if (!bookFound) {
            System.err.println("No books were found within the price range you entered!");
        }
    }
}




