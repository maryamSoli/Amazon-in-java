package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Admin aObj = new Admin();
        Seller sObj = new Seller();
        User uObj = new User();
        AdminOperations aoObj = new AdminOperations();
        SellerOperations soObj = new SellerOperations();
        UserOperations uoObj = new UserOperations();
        Product pObj = new Product();
        Shop shopObj = new Shop();
        Menus mObj = new Menus();
        Scanner input = new Scanner(System.in);


        int accountChoice;
        int adminChoice;
        int userChoice;
        int sellerChoice;
        int shoppingCartChoice;


        do {

            mObj.AccountMenu();
            accountChoice = input.nextInt();

            switch (accountChoice){

                case 1:
                    System.out.println("Login Please");
                    aoObj.login();
                    if (aoObj.aloginChecker == true){

                        mObj.AdminMenu();


                    }
                    else {
                        System.out.println("You can not access this section.\nLogin first!");
                    }
                    break;




                case 2:
                    System.out.println("Login Please");
                    soObj.login();
                    if (soObj.sloginChecker == true){

                        mObj.SellerMenu();


                    }
                    else {
                        System.out.println("You can not access this section.\nLogin first!");
                    }
                    break;




                case 3:
                    System.out.println("Login Please");
                    uoObj.login();
                    if (uoObj.uloginChecker == true){

                        mObj.UserMenu();


                    }
                    else {
                        System.out.println("You can not access this section.\nLogin first!");
                    }
                    break;




                case 4:
                    aoObj.aloginChecker = false;
                    soObj.sloginChecker = false;
                    uoObj.uloginChecker = false;
                    break;



                default:
                    System.out.println("Thanks For Shopping Here :)");
            }
        }
        while (accountChoice!=100);























    }
}