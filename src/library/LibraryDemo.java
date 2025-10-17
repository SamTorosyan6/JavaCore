package library;

import java.util.Scanner;

public class LibraryDemo {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;
        BookStorage bookStorage = new BookStorage();

        while (isRun) {

            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for ADD BOOK");
            System.out.println("Please input 2 for PRINT ALL BOOKS");
            System.out.println("Please input 3 for SEARCH BOK BY TITLE");
            String command = scanner.nextLine();

            switch (command) {

                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input book's title");
                    String bookTitle = scanner.nextLine();
                    System.out.println("Please input book's author name");
                    String authorName = scanner.nextLine();
                    System.out.println("Please input book's price");
                    double price = Double.parseDouble(scanner.nextLine());
                    Book book = new Book(bookTitle, authorName, price);
                    bookStorage.add(book);
                    System.out.println("Book added successfully");
                    break;
                case "2":
                    bookStorage.print();
                    break;
                case "3":
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.search(keyword);
                    break;
            }
        }

    }

}
