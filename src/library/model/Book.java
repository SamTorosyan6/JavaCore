package library.model;

public class Book {

    private String title;
    private Author author;
    private double price;
    private int id;
    private int quantity;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + author + '\'' +
                ", price=" + price +
                ", id=" + id +
                ", quantity=" + quantity +
                '}';
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book(String title, Author author, double price, int id, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.id = id;
        this.quantity = quantity;
    }

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
