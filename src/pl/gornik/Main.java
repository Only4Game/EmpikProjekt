package pl.gornik;

import pl.gornik.model.Book;
import pl.gornik.model.Disc;
import pl.gornik.model.Product;
import pl.gornik.model.Toy;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("48 laws of power", 30, 44.99, "Robert Greene");
        Book book2 = new Book("Witcher - the last wish", 20, 49.99, "Andrzej Sapkowski");
        Book book3 = new Book("Pan Tadeusz", 100, 34.99, "Adam Mickiewicz");
        Book book4 = new Book("A Song of Ice and Fire", 50, 59.99, "George Raymond Richard Martin");

        Disc disc1 = new Disc("Kinematografia", 10, 35.99, "Paktofonika");
        Disc disc2 = new Disc("The Sacrament of Sin", 20, 47.99, "Power Wolf");
        Disc disc3 = new Disc("Hail to the King", 30, 45.99, "Avenged Sevenfold");
        Disc disc4 = new Disc("Ultravioled", 50, 28.99, "usedcvnt");

        Toy toy1 = new Toy("100 Board games", 30, 50.99, 6);
        Toy toy2 = new Toy("Pokemon trading cards", 200, 20.99, 6);
        Toy toy3 = new Toy("Howwheels - car", 100, 25.99, 5);
        Toy toy4 = new Toy("Drunk roulette", 20, 40.99, 18);

        List<Product> productList = new ArrayList<>();

        productList.add(book1);
        productList.add(book2);
        productList.add(book3);
        productList.add(book4);

        productList.add(disc1);
        productList.add(disc2);
        productList.add(disc3);
        productList.add(disc4);

        productList.add(toy1);
        productList.add(toy2);
        productList.add(toy3);
        productList.add(toy4);

        System.out.println("====================");
        System.out.println("WELCOME TO THE SHOP!");
        System.out.println("====================");
        double ShopVal = 0;

        for (Product products : productList) {
            ShopVal += products.countPrice();
            products.displayProduct();
        }

        System.out.println(" ");

        System.out.println("====================");
        System.out.println("==TOTAL SHOP VALUE==");
        System.out.println("=====" + Math.round(ShopVal) + " $usd=====");
        System.out.println("====================");

        System.out.println(" ");

        System.out.println("====================");
        System.out.println("DO YOU WANT TO ORDER");
        System.out.println("====================");
        System.out.println("= Y - YES = N - NO =");
        System.out.println("====================");
        Scanner scanner = new Scanner(System.in);
        String orderOption = scanner.nextLine();

        System.out.println(" ");



        switch (orderOption) {
            case "y", "Y": {
                List<Product> yourCart = new ArrayList<>();
                for (Product productss : productList) {
                    System.out.println("What you want to order?");
                String orderProd = scanner.nextLine();
                if(Objects.equals(orderProd, productss.getTitle())){
                    yourCart.add(productss);
                    int amountAfterOrder = productss.getNumberOfProduct() -1;
                    System.out.println(amountAfterOrder);
                }
                }
                System.out.println("Your cart: ");
                System.out.println("__________");
                for (Product products : yourCart) {
                    products.displayProduct();
                }
            }

            case "n", "N": {
                break;
            }
        }

//


//        switch (chooseOption) {
//            case 1: {
//                System.out.println("====================");
//                System.out.println("====OUR PRODUCTS====");
//                System.out.println("====================");
//                for (Product products : productList) {
//                    products.displayProduct();
//                }
//
//                System.out.println("====================");
//                System.out.println("==WANT TO GET BACK==");
//                System.out.println("=====TYPE - 0 ======");
//                System.out.println("====================");
//                chooseOption = scanner.nextInt();
//            }
//            case 2: {
//                System.out.println("====================");
//                System.out.println("===DEAR CUSTOMER!===");
//                System.out.println("====================");
//                break;
//            }
//            case 3: {
//                System.out.println();
//                System.out.println("=====================");
//                System.out.println("=THANKS FOR VISITING=");
//                System.out.println("======OUR  SHOP======");
//                System.out.println("=====================");
//                break;
//            }
//            case 0: {
//                System.out.println("====================");
//                System.out.println("WELCOME TO THE SHOP!");
//                System.out.println("====================");
//                System.out.println("What you want to do?");
//                System.out.println("1 - show me the products");
//                System.out.println("2 - Make an order");
//                System.out.println("3 - Exit");
//                chooseOption = scanner.nextInt();
//            }
//        }
    }
}