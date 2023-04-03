package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class SellerOperations {

    public boolean  sloginChecker;
    public boolean  authorizedSellersChecker;
    Scanner input = new Scanner(System.in);


    public void CreateAccount() {

        Seller s = new Seller();
        s.Seller();
        int flag = 0;
        for (Seller i : Panels.theSellers) {
            if (s.getCompanyName().equalsIgnoreCase(i.getCompanyName())) {
                System.out.println("Seller With This Company Name Exists\nSo The Current Information Including Your Company Name And Password Won't Go Inside The Shop's Data Base");
                flag++;
            }
        }
        if (flag == 0) {
            Panels.theSellers.add(s);
            System.out.println("Account Created!");
        }
    }


    public void login() {

        System.out.println("Enter Your Company Name");
        String company = input.nextLine();
        System.out.println("Enter Your Password");
        String password = input.nextLine();
        int flag = 0;
        for (Seller i : Panels.theSellers) {
            if (company.equals(i.getCompanyName()) && password.equals(i.getPassWord())) {
                System.out.println("Login Successfully!");
                flag++;

                sloginChecker = true;
            }
        }
        if (flag == 0) {
            System.out.println("Seller is not Registered Or Company Name Or Password Is Not Correct.");

            sloginChecker = false;
        }
    }


    public void AuthorizingRequest() {

        int flag = 0;
        // int flag2 = 0;
        System.out.println("Enter The Company Name To Send The Request");
        String company = input.nextLine();
        //AdminOperations AuthorizedRequests = new AdminOperations();
        //for (String j : AuthorizedRequests.AcceptedSellerAuthorizingRequests) {
        /*if (company.equalsIgnoreCase(j)) {
        flag2++;
            }
        }
        if (flag2 == 0) {*/
        for (Seller i : Panels.theSellers) {
            if (company.equalsIgnoreCase(i.getCompanyName())) {
                flag++;
            }
        }

        if (flag != 0) {
            Panels.theSellersAuthorizingRequests.add(company);
            System.out.println("The Request has been Sent To the Admins.");
           /* for (String i : Panels.theSellersAuthorizingRequests){
                System.out.println(i);
            }*/
        } else {
            System.out.println("Company With This Name Doesn't Exists.");
        }
    }
       /* } else {

            System.out.println("This Company is Already Authorized");
        }
    }*/

    public void AuthorizedSellers() {

        System.out.println("To See If You are Authorized Please Enter The Name Of Your Company");
        String company = input.nextLine();
        int flag = 0;
        for (String i : Panels.AcceptedSellerAuthorizingRequests) {
            if (company.equalsIgnoreCase(i)) {
                flag++;
            }
        }
        if (flag != 0) {
            System.out.println("You Are Authorized to Add your Product!");
             authorizedSellersChecker = true;
        }

        else {

            authorizedSellersChecker = false;
            System.out.println("You Are Not Authorized\nPossible Reasons:");
            System.out.println("1.The Admins haven't Seen Your Request Yet( Possible Solution : Check It Again Later!)");
            System.out.println("2.You have not Requested for Authorization( Possible Solution : Make a Request!");
            System.out.println("3.The Admins didn't Confirm Your Company( Possible Solution : Try To Contact Us in CONTACT Section to Know The Reason");
        }
    }


    public void ProductMenu() {

        System.out.println("Please Choose the Product Category That You Want To Add:");
        System.out.println("1 : Electronics");
        System.out.println("2 : Any Other Categories");
        System.out.println("0 : Get Out");
    }

    public void electronicsMenu() {

        System.out.println("1 : Laptop");
        System.out.println("2 : Smart Phone");
    }

    public void addProduct() {

        int choice;
        do {
            ProductMenu();
            choice = input.nextInt();

            switch (choice) {

                case 1:

                    electronicsMenu();
                    int electronicsChoice = input.nextInt();
                    if (electronicsChoice == 1) {
                        Product laptop = new Product();
                        laptop.Laptop();// calling Laptop method from Laptop class
                        int flag = 0;
                        for (Product i : Panels.theProducts) {
                            if (laptop.equals(i)) {
                                i.addQuantityByOne();
                                flag++;
                            }
                        }

                        if (flag == 0) {
                            Panels.theProducts.add(laptop); // add laptop
                        }

                    } else { // if phone is chosen
                        Product phone = new Product();
                        phone.SmartPhone();// calling SmartPhone method from SmartPhone class
                        int flag = 0;
                        for (Product i : Panels.theProducts) {
                            if (phone.equals(i)) {
                                i.addQuantityByOne();
                                flag++;
                            }
                        }

                        if (flag == 0) {
                            Panels.theProducts.add(phone);
                        }
                    }

                    break;

                case 2:

                    Product product = new Product();
                    product.Product();
                    int flag = 0;
                    for (Product i : Panels.theProducts) {
                        if (product.equals(i)) {
                            // i.addQuantityByOne();
                            flag++;
                        }
                    }

                    if (flag == 0) {
                        Panels.theProducts.add(product);
                    }

                    break;
            }
        }

        while (choice != 0);

    }

    public void showSellers(){

        for (Seller i : Panels.theSellers){
            System.out.println(i.toString());
        }
    }

}