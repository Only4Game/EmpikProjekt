package pl.gornik.model;

public class Book extends Product{
    private String author;

    public Book(String title, int numberOfProduct, double price, String author) {
        super(title, numberOfProduct, price);
        this.author = author;
    }

    @Override
    public void displayProduct() {
        System.out.println("___");
        super.displayProduct();
        System.out.println("Author of the book: " + author);
    }
}
