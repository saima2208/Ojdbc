package BookFile;

import java.io.Reader;

public class Book {
    private    int id;
    private String title;

    private String author;
    private double price;
    private char available;

    public Book() {
    }

    public Book(String title, String author, double price, char available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public Book(int id, String title, String author, double price, char available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public Book(int id, String title, String author, double price, Reader available) {
    }

    public Book(int id) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Reader getAvailable() {
      return available;
    }

    public void setAvailable(char available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Book [ id = " + id + ", Name "+ title + ",Author " + author + ",Price " + price + ",Available " + available + "]" ;

    }
}
