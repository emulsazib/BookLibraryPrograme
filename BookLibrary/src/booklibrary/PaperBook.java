package booklibrary;

public class PaperBook extends Book{
    private int shippingWieght;
    private int inStock;

    public PaperBook(){
        this.shippingWieght=0;
        this.inStock=0;
    }

    public PaperBook(int shippingWieght, int inStock) {
        this.shippingWieght = shippingWieght;
        this.inStock = inStock;
    }

    public PaperBook(int isbn, String title, String author, double price, int shippingWieght, int inStock) {
        super(isbn, title, author, price);
        this.shippingWieght = shippingWieght;
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "shippingWieght=" + shippingWieght +
                ", inStock=" + inStock +
                '}';
    }
}
