package pl.gornik.model;

import java.util.Scanner;

public class Product {
    private String title;
    private int numberOfProduct;
    private double price;

    public Product(String title, int numberOfProduct, double price) {
        this.title = title;
        this.numberOfProduct = numberOfProduct;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfProduct() {
        return numberOfProduct;
    }

    public double getPrice() {
        return price;
    }

    public void displayProduct() {
        System.out.println("Product name: " + title + ", total number of products: " + numberOfProduct + ", price per one: " + price);
    }

    public double countPrice() {

        return numberOfProduct * price;
    }
}
