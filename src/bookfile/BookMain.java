package bookfile;


import java.util.ArrayList;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
       // books.add(new Book)
        books.add(new Book("JAVA","AA",22.3,true));
        books.add(new Book("PYTHON","BB",24.3,true));
        books.add(new Book("JAVASCRIPT","CC",25.3,true));
        books.add(new Book("HTML","DD",26.3,false));
        books.add(new Book("JAVA2","EE",28.3,true));
        BookDAO dao = new BookDAO();
        for (Book book :books)
            dao.addBook(book);
    }
}
