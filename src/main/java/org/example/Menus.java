package org.example;

public class Menus {

    public void AccountMenu(){

        System.out.println("Choose Your Account Type :");
        System.out.println("1: Admin");
        System.out.println("2: Seller");
        System.out.println("3: User");
        System.out.println("4 : Logout");
        System.out.println("100 : Get Out");

    }

    public void AdminMenu(){

        System.out.println("Admin Menu");
        System.out.println("1 : Add Admin");
        System.out.println("2 : See Users Information");
        System.out.println("3 : See Sellers Information");
        System.out.println("4 : See Admins Information");
        System.out.println("5 : See Sellers Authorizing Requests");
        System.out.println("6 : See Users Funding Requests");
        System.out.println("7 : See Users Finalizing Order Requests");
        System.out.println("8 : See All The Products");
        System.out.println("9 : See Shop Total Profit");
        System.out.println("10 : See The List Of All The Orders");
        System.out.println("200 : Get Out");
    }

    public void SellerMenu(){

        System.out.println("Seller Menu");
        System.out.println("1 : Request For Authorization");
        System.out.println("2 : Checking Your Authorization");
        System.out.println("3 : Add Product");
        System.out.println("4 : See Wallet");
        System.out.println("5 : Contact Us");
        System.out.println("300 : Get Out");
    }

    public void UserMenu(){

        System.out.println("Welcome To The Shop\nPlease Choose From The Following Menu:");
        System.out.println("1 : Edit Personal Info");
        System.out.println("2 : See The Products (In This Section You Can See The Products From Your Chosen Category,Add Them To Your Cart Or Leave A Comment)");
        System.out.println("3 : See All The Products");
        System.out.println("4 : Search By Brand(For Books : Search By Publisher)");
        System.out.println("5 : Search By Product Name");
        System.out.println("6 : Search By The Seller Company");
        System.out.println("7 : See Your Shopping Cart");
        System.out.println("8 : See Your Orders Lists");
        System.out.println("9 : Make Funding Requests");
        System.out.println("10 : See Wallet");
        System.out.println("11 : Contact Us");
        System.out.println("400 : Get Out");

    }

    public void shoppingCartMenu(){

        System.out.println("1 : Remove The Product From Your Cart");
        System.out.println("2 : Add The Quantity Of A Product");
        System.out.println("3 : See Final Price");
        System.out.println("4 : Finalizing Your Cart\nATTENTION : In This Section There Is No Way To Cancel Your Order");
        System.out.println("500 : Get Out");

    }

    public void createAccount_LoginMenu(){

        System.out.println("1 : Create Account");
        System.out.println("2 : Login");
    }
}
