package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Product {

    private String name;
    private String price;
    private int quantity;
    private String brand;

   // private String category;
    ArrayList<String> comments = new ArrayList();
    Scanner input = new Scanner(System.in);

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setQuantity(String quantity) {

        String pricePattern = "^\\d$";

        boolean flag ;

        while (true) {

            flag = quantity.matches(pricePattern);

            if (flag == false) {

                System.out.println("ERROR\nTRY AGAIN");

                quantity = input.nextLine();

            } else {

                this.quantity =Integer.parseInt(quantity);

                break;
            }

        }


    }

    public int getQuantity() {
        return quantity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    /* public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }*/

    public void Product(){

        System.out.println("Please Enter the Name of Your Product");
        setName(input.nextLine());

        System.out.println("Please Enter the Price");
        setPrice(input.nextLine());

        System.out.println("Please Enter the Brand");
        setBrand(input.nextLine());

        /*System.out.println("Please Enter the Category");
        System.out.println("The Categories:\n<<Electronics>> <<Clothes>> <<Bags>> <<Shoes>> <<Books>> <<Cosmetics>> <<Perfume>> <<Furniture>> <<Musical Instruments>> <<Accessories>>");
        setCategory(input.nextLine());*/

        System.out.println("Please Enter the Quantity");
        setQuantity(input.nextLine());


    }
}
