package booklibrary;

public class Book {
    private int isbn;
    private String title;
    private String author;
    private double price;

    public Book(){
        this.isbn=0;
        this.title=null;
        this.author=null;
        this.price=0;
    }

    public Book(int isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
