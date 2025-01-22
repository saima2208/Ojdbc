public class Book {
    private int id;
    private String name;
    private String author;
    private double price;
    private boolean available;

    public Book() {
    }

    public Book(int id, String name, String author, double price, boolean available) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public Book(String name, String author, double price, boolean available) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [ id = " + id + ", Name "+ name + ",Author " + author + ",Price " + price + ",Available " + available + "]" ;

    }

}
