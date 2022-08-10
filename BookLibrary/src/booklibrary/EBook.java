package booklibrary;

public class EBook extends Book{
    private String downloadUrl;
    private double sizeMB;

    public EBook(){
        this.downloadUrl=null;
        this.sizeMB=0;
    }

    public EBook(String downloadUrl, double sizeMB) {
        this.downloadUrl = downloadUrl;
        this.sizeMB = sizeMB;
    }

    public EBook(int isbn, String title, String author, double price, String downloadUrl, double sizeMB) {
        super(isbn, title, author, price);
        this.downloadUrl = downloadUrl;
        this.sizeMB = sizeMB;
    }

    @Override
    public String toString() {
        return "EBook{" +
                "downloadUrl='" + downloadUrl + '\'' +
                ", sizeMB=" + sizeMB +
                '}';
    }
}
