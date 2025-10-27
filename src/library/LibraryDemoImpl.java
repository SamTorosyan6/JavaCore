package library;

import library.model.Author;
import library.model.Book;
import library.storage.AuthorStorage;
import library.storage.BookStorage;

import java.util.Scanner;

public class LibraryDemoImpl implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static boolean isRun = true;
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();

    static void main() {

        while (isRun) {

            Commands.printCommands();
            String command = scanner.nextLine();

            switch (command) {

                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_AUTHORS:
                    authorStorage.print();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOK_BY_AUTHOR:
                    searchBookByAuthor();
                    break;
                case SEARCH_BOOK_BY_TITLE:
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.search(keyword);
                    break;
                case PRINT_EXPENSIVE_BOOK:
                    Book expensiveBook = bookStorage.getBookByMaxPrice();
                    System.out.println(expensiveBook);
                    break;
                case DELETE_BOOK_BY_ID:
                    System.out.println("Please input book's ID for delete");
                    String booksId = scanner.nextLine();
                    bookStorage.deleteBookById(Integer.parseInt(booksId));
                    break;
                case SEARCH_BOOK_BY_PRICE_RANGE:
                    searchBookByPriceRange();
                    break;
                default:
                    System.err.println("Please input correct command!");
            }
        }

    }

    private static void searchBookByAuthor() {

        System.out.println("Please choose author by phone number");

        authorStorage.print();
        String phoneNumber = scanner.nextLine();
        Author author = authorStorage.getAuthorByPhoneNumber(phoneNumber);
        if (author != null) {
            bookStorage.searchBookByAuthor(author);

        } else {
            System.err.println("Wrong author's phone number, please try again!!!");
        }

    }

    private static void addAuthor() {

        System.out.println("Please input author's name");
        String name = scanner.nextLine();
        System.out.println("Please input author's surname");
        String surname = scanner.nextLine();
        System.out.println("Please input author's age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input book's id");
        String phoneNumber = scanner.nextLine();
        Author book = new Author(name, surname, age, phoneNumber);
        authorStorage.add(book);
        System.out.println("Author added successfully!!!");

    }

    private static void addBook() {

        System.out.println("Please choose author by phone number");

        authorStorage.print();
        String phoneNumber = scanner.nextLine();
        Author author = authorStorage.getAuthorByPhoneNumber(phoneNumber);
        if (author != null) {
            System.out.println("Please input book's title");
            String bookTitle = scanner.nextLine();
            System.out.println("Please input book's price");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Please input book's id");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Please input book's count");
            int quantity = Integer.parseInt(scanner.nextLine());
            Book book = new Book(bookTitle, author, price, id, quantity);
            bookStorage.add(book);
        } else {
            System.err.println("Wrong author's phone number, please try again!!!");
        }
    }


    private static void searchBookByPriceRange() {

        System.out.println("Please input the price range of the books you would like to see");
        System.out.println("Input the minimum price");
        String minPrice = scanner.nextLine();
        System.out.println("Input the maximum price");
        String maxPrice = scanner.nextLine();
        bookStorage.searchBookByPriceRange(Integer.parseInt(minPrice), Integer.parseInt(maxPrice));
    }


}
