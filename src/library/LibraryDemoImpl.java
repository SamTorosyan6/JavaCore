package library;

import java.util.Scanner;

public class LibraryDemoImpl implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static boolean isRun = true;
    private static BookStorage bookStorage = new BookStorage();

    static void main() {

        while (isRun) {

            printCommands();
            String command = scanner.nextLine();

            switch (command) {

                case EXIT:
                    isRun = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
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

    private static void addBook() {

        System.out.println("Please input book's title");
        String bookTitle = scanner.nextLine();
        System.out.println("Please input book's author name");
        String authorName = scanner.nextLine();
        System.out.println("Please input book's price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input book's id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input book's count");
        int quantity = Integer.parseInt(scanner.nextLine());
        Book book = new Book(bookTitle, authorName, price, id, quantity);
        bookStorage.add(book);

    }

    private static void printCommands() {

        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_BOOK + " for ADD BOOK");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " for PRINT ALL BOOKS");
        System.out.println("Please input " + SEARCH_BOOK_BY_TITLE + " for SEARCH BOOK BY TITLE");
        System.out.println("Please input " + PRINT_EXPENSIVE_BOOK + " for PRINT EXPENSIVE BOOK");
        System.out.println("Please input " + DELETE_BOOK_BY_ID + " for DELETE THE BOOK BY ID");
        System.out.println("Please input " + SEARCH_BOOK_BY_PRICE_RANGE + " for PRINT BOOKS BY PRICE RANGE");


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
