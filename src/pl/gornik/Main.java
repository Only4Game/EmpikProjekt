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



        List<Product> productList = new ArrayList<>();
        initializeShop(productList);


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


        System.out.println(" ");



        List<Product> basket = new ArrayList<>();
        String name;
        int quantity;
        String choice = "T";
        boolean isFind = false;
        while (choice.equalsIgnoreCase("T") || choice.equalsIgnoreCase("Tak")
                || choice.equalsIgnoreCase("Yes") || choice.equalsIgnoreCase("Y")){
            System.out.println("Podaj nazwę produktu który chcesz dodać do koszyka");
            name = scanner.nextLine();
            System.out.println("Podaj liczbę sztuk produktu");
            quantity = scanner.nextInt();
            scanner.nextLine();

            for (Product product : productList) {
                if(product.getTitle().equalsIgnoreCase(name)){
                    Product prod = new Product(product);
                    if(product.getNumberOfProduct() > quantity){
                        prod.setNumberOfProduct(quantity);
                        basket.add(prod);
                        product.setNumberOfProduct(product.getNumberOfProduct() - quantity);
                        isFind = true;
                    }
                    else if(product.getNumberOfProduct() == quantity){
                        prod.setNumberOfProduct(quantity);
                        basket.add(prod);
                        isFind = true;
                        productList.remove(product);
                        break;
                    }
                    else{
                        System.out.printf("Nie ma %d %s w sklepe. Do koszyka dodano %d\n",
                                quantity, name, product.getNumberOfProduct());
                        basket.add(product);
                        isFind = true;
                        productList.remove(product);
                        break;
                    }
                }

            }

            if(!isFind)System.out.println("Tego produktu nie ma w sklepie");
            System.out.println("czy dodać kolejny produkt. Wpisz Tak/T/Yes/Y ");
            choice = scanner.nextLine();
        }

        double grossPrice = 0;
        System.out.println("Twój koszyk");
        for(Product prod: basket){
            prod.displayProduct();
            grossPrice += prod.countPrice();
        }
        System.out.println("_____________________");
        System.out.printf("Wartość koszyka to %.2f zł\n", grossPrice);
        System.out.println("_____________________");

        System.out.printf("\n\n\n");

        System.out.println("_____________________");
        System.out.println("Potwierdzam swoje zamowienie tak/t/yes/y");
        System.out.println("_____________________");
        String choice2;
        choice2 = scanner.nextLine();
switch (choice2){
    case "tak", "Tak","t","T","yes","Yes","y","Y":
}

        grossPrice = 0;
        System.out.println("Twój sklep");
        for(Product product :productList){
            product.displayProduct();
            grossPrice += product.countPrice();
        }
        System.out.println("_____________________");
        System.out.printf("Wartość sklepu to %.2f zł\n", grossPrice);
        System.out.println("_____________________");

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
    public static void initializeShop (List<Product> productList){
        productList.add(new Book("48 laws of power", 30, 44.99, "Robert Greene"));
        productList.add(new Book("Witcher - the last wish", 20, 49.99, "Andrzej Sapkowski"));
        productList.add(new Book("Pan Tadeusz", 100, 34.99, "Adam Mickiewicz"));
        productList.add(new Book("A Song of Ice and Fire", 50, 59.99, "George Raymond Richard Martin"));

        productList.add(new Disc("Kinematografia", 10, 35.99, "Paktofonika"));
        productList.add( new Disc("The Sacrament of Sin", 20, 47.99, "Power Wolf"));
        productList.add( new Disc("Hail to the King", 30, 45.99, "Avenged Sevenfold"));
        productList.add( new Disc("Ultraviolet", 50, 28.99, "usedcvnt"));

        productList.add( new Toy("100 Board games", 30, 50.99, 6));
        productList.add( new Toy("Pokemon trading cards", 200, 20.99, 6));
        productList.add( new Toy("Hotwheels - car", 100, 25.99, 5));
        productList.add( new Toy("Drunk roulette", 20, 40.99, 18));
    }
}