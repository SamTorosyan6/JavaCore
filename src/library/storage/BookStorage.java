package library.storage;

import library.model.Author;
import library.model.Book;

public class BookStorage {

    private int size;
    private Book[] books = new Book[10];

    public void add(Book book) {

        boolean bookFound = false;

        if (size == books.length) {

            extend();
        }

        for (int i = 0; i < size; i++) {

            if (books[i].getId() == book.getId()) {
                bookFound = true;
                System.err.println("There is already a book registered with id: " + books[i].getId());
                System.err.println(books[i].toString());
            }
        }
        if (!bookFound) {
            books[size++] = book;

        }
    }

    private void extend() {

        Book[] tmp = new Book[size + 10];
        System.arraycopy(books, 0, tmp, 0, size);
        books = tmp;

    }

    public void print() {

        for (int i = 0; i < size; i++) {

            System.out.println(books[i].toString());

        }

    }

    public void search(String keyword) {

        for (int i = 0; i < size; i++) {

            if (books[i].getTitle().toLowerCase().contains(keyword.toLowerCase())) {

                System.out.println(books[i]);

            }

        }

    }

    public void searchBookByAuthor(Author author) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(author)) {
                System.out.println(books[i]);
            }
        }
    }

    public Book getBookByMaxPrice() {

        double price = 0;
        int maxIndex = -1;

        for (int i = 0; i < size; i++) {

            if (books[i].getPrice() > price) {
                maxIndex = i;
                price = books[i].getPrice();

            }

        }

        return books[maxIndex];

    }

    public void deleteBookById(int id) {

        boolean bookFound = false;

        for (int i = 0; i < size; i++) {
            if (books[i].getId() == id) {
                for (int j = i; j < size - 1; j++) {
                    books[j] = books[j + 1];
                }
                size--;
                bookFound = true;
                System.out.println("The book by id " + id + " deleted.");
                break;
            }
        }

        if (!bookFound) {
            System.err.println("No book found with id " + id);
        }

    }

    public void searchBookByPriceRange(int min, int max) {

        boolean bookFound = false;

        for (int i = 0; i < size; i++) {

            if (books[i].getPrice() >= min && books[i].getPrice() <= max) {
                bookFound = true;
                System.out.println(books[i].toString());
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
