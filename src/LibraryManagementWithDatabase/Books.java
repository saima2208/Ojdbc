package LibraryManagementWithDatabase;

public class Books {
    private  String title;
    private String author;
    private int year;
    private double price;
    private int page;
    private boolean borrowed;

    public Books() {
    }

    public Books(String title, String author, int year, double price, int page, boolean borrowed) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
        this.page = page;
        this.borrowed = borrowed;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
}
