package pl.gornik.model;

public class Toy extends Product {
private int requiredAge;

    public Toy(String title, int numberOfProduct, double price, int requiredAge) {
        super(title, numberOfProduct, price);
        this.requiredAge = requiredAge;
    }

    @Override
    public void displayProduct() {
        System.out.println("___");
        super.displayProduct();
        System.out.println("Required age: " + requiredAge + " years");
    }
}
