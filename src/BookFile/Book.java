package BookFile;



public class Book {
    private int id;
    private String title;
    private String author;
    private double price;
    private int available;

    public Book() {
    }

    public Book(int available) {
        this.available = available;
    }

    public Book(String title, String author, double price, int available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public Book(int id, String title, String author, double price, int available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
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

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;

        }
    }

