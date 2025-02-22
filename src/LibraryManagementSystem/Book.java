package LibraryManagementSystem;

public class Book {
    private String title;
    private String author;
    private int publishYear;
    private int page;
    private double price;

    private boolean borrowed;

    public Book() {
    }

    public Book(String title, String author, int publishYear, int page, double price, boolean borrowed) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.page = page;
        this.price = price;
        this.borrowed = borrowed;
    }

    public Book(String title, String author, int publishYear, int page, double price) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.page = page;
        this.price = price;
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

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }





    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public String toString() {
      return
        String.format("%-25s %-25s %8d%8d%8.2f\t%b%n",title,author,publishYear,page,price,borrowed);

    }


}
