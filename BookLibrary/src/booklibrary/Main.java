package booklibrary;

public class Main {
    public static void main(String[] args) {
        Book b1=new Book(212323213,"The Rap Of the Darkness","Roms Juje",2250);
        System.out.println(b1.toString());

        Book b2=new EBook("https://doc.therapeofthedarkness.pdf",32.45);
        System.out.println(b2.toString());

        Book b3=new PaperBook(231234432,5);
        System.out.println(b3.toString());

    }
}
