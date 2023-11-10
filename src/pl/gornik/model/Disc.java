package pl.gornik.model;

public class Disc extends Product{
    private String productent;

    public Disc(String title, int numberOfProduct, double price, String productent) {
        super(title, numberOfProduct, price);
        this.productent = productent;
    }

    @Override
    public void displayProduct() {
        System.out.println("___");
        super.displayProduct();
        System.out.println("Producent of the disc: " + productent);
    }
}
