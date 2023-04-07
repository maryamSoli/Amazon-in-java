package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // defining objs from the classes that are used in Main
        AdminOperations aoObj = new AdminOperations();
        SellerOperations soObj = new SellerOperations();
        UserOperations uoObj = new UserOperations();
        Menus mObj = new Menus();
        Scanner input = new Scanner(System.in);


        //defining different choices for different menus
        int accountChoice;
        int adminChoice;
        int userChoice;
        int sellerChoice;
        int shoppingCartChoice;
        int createAccount_LoginChoice;


        //adding the default admin username and password to theAdmins arrlist
        Admin defAdmin = new Admin();
        defAdmin.defaultAdmin();
        Panels.theAdmins.add(defAdmin);

        System.out.println("***********************************************************************");
        System.out.println("                     WELCOME TO eiRene ONLINE SHOP");
        System.out.println("***********************************************************************");

        do {

            mObj.AccountMenu();
            accountChoice = input.nextInt();

            switch (accountChoice){

                case 1:// Admin
                    System.out.println("Login Please");
                    aoObj.login();
                    if (aoObj.aloginChecker == true){//the following menu can only be accessed if this is true


                        do {

                            mObj.AdminMenu();
                            adminChoice = input.nextInt();


                            switch (adminChoice) {

                                case 1 :
                                    aoObj.addAdmin();
                                    break;
                                case 2:
                                    uoObj.showUsers();
                                    break;
                                case 3:
                                    soObj.showSellers();
                                    break;
                                case 4:
                                    aoObj.showAdmins();
                                    break;
                                case 5:
                                    aoObj.showSellerAuthorizingRequests();
                                    break;
                                case 6:
                                    aoObj.showUsersFundingRequests();
                                    break;
                                case 7:
                                    aoObj.showFinalOrderingRequests();
                                    break;
                                case 8:
                                    uoObj.showProducts();
                                    break;
                                case 9://Show the total profit of the shop
                                    System.out.println(Panels.totalProfit);
                                    break;
                                case 10:// all the order lists from all users
                                    uoObj.seeWholeOrdersList();
                                    break;
                                  }

                        }
                        while (adminChoice!=200);

                    }
                    else {
                        System.out.println("You can not access this section.\nLogin first!");
                    }
                    break;




                case 2://Seller
                     mObj.createAccount_LoginMenu();
                     createAccount_LoginChoice =input.nextInt();

                     if (createAccount_LoginChoice==1){//create account
                         soObj.CreateAccount();
                     }

                     else {//login
                         soObj.login();

                         if (soObj.sloginChecker == true){//the following menu can only be accessed if this is true

                             do {

                                 mObj.SellerMenu();
                                 sellerChoice =input.nextInt();

                                 if (sellerChoice == 1) {
                                     soObj.AuthorizingRequest();
                                 }

                                 else if (sellerChoice == 2) {
                                     soObj.AuthorizedSellers();
                                 }

                                 else if (sellerChoice == 3) {

                                     if (soObj.authorizedSellersChecker==true) {// only if this is true the seller can add Products
                                         soObj.addProduct();
                                     }

                                     else {
                                         System.out.println("You Are Not Authorized To Add Your Product\nGet Authorized First");
                                     }

                                 }

                                 else if (sellerChoice == 4) {
                                      soObj.sellerSeeWallet();
                                 }

                                 else if (sellerChoice == 5) {
                                     mObj.ContactMenu();
                                 }

                                 else {
                                     System.out.println("Such Option Doesn't Exist.Try Again");
                                 }

                             }
                             while (sellerChoice!=300);
                         }


                         else {
                             System.out.println("You can not access this section.\nLogin first!");
                         }
                     }


                    break;




                case 3://User
                    mObj.createAccount_LoginMenu();
                    createAccount_LoginChoice =input.nextInt();

                    if (createAccount_LoginChoice==1){//create account
                        uoObj.CreateAccount();
                    }

                    else {
                        uoObj.login();
                    }
                    if (uoObj.uloginChecker == true){//the following menu can only be accessed if this is true

                        do {

                            mObj.UserMenu();
                            userChoice = input.nextInt();

                            if (userChoice==1){
                                uoObj.editPersonalInfo();
                            }

                            else if(userChoice==2){
                                uoObj.addToCart_LeaveComment();
                            }

                            else if(userChoice==4){
                                uoObj.searchByBrand();
                            }

                           /* else if (userChoice==5){
                                uoObj.searchByName();
                            }

                            else if(userChoice==6){
                                uoObj.searchBySellerCompany();
                            }*/

                            else if (userChoice==7){

                                uoObj.seeShoppingCart();

                                do {//all the following stuff are inside choice 7

                                    mObj.shoppingCartMenu();
                                    shoppingCartChoice = input.nextInt();

                                    switch (shoppingCartChoice){

                                        case 1:
                                            uoObj.removeFromCart();
                                            break;

                                        case 2:
                                            uoObj.addQuantity();
                                            break;

                                        case 3:
                                            uoObj.finalPrice();
                                            break;

                                        case 4:
                                            uoObj.OrderRequest();

                                            break;

                                        case 5:
                                            uoObj.authorizedOrders();
                                            break;

                                        case 6:
                                            if (uoObj.OrderConfirmChecker==true){
                                                uoObj.finalizeOrderWallet();
                                                uoObj.finalizeOrderList();
                                               // uoObj.fixProductQuantity();
                                            }
                                            else {
                                                System.out.println("Your Order Hasn't Been Confirmed By Admins");
                                            }
                                            break;
                                    }

                                }
                                while (shoppingCartChoice!=500);

                            }

                            else if (userChoice==8){
                                uoObj.seeFinalOrderList();
                            }

                            else if(userChoice==9){
                                uoObj.fundRequest();
                            }

                            else if (userChoice==12){
                                uoObj.acceptedFunds();
                            }

                            else if (userChoice==10){
                                aoObj.UserSeeWallet();
                            }

                            else if (userChoice==11){
                                mObj.ContactMenu();
                            }


                        }
                        while (userChoice!=400);

                    }

                    else {
                        System.out.println("You can not access this section.\nLogin first!");
                    }
                    break;

                default:
                    System.out.println("Thanks For Shopping Here :)");
            }
        }
        while (accountChoice!=100);





       /* while (true){

            System.out.println("0:out  1:add   2:see 3:remove 4:search by name");
            int ch = input.nextInt();

            if (ch == 0){
                break;
            }

            else if (ch == 1){
                soObj.addProduct();
            }

            else if (ch == 3) {
                uoObj.removeFromCart();
            }

            else if(ch==4){
                System.out.println("press 1 to search with name");
                System.out.println("press 2 to search with brand");
                System.out.println("press 3 to search with seller company");

               int wholeSearchChoice = input.nextInt();

                switch (wholeSearchChoice) {

                    case 1:// if wholeSearchChoice is 1

                        uoObj.searchByName();

                        break;

                    case 2:// if it is 2

                        uoObj.searchByBrand();

                        break;

                    case 3: // if it is 3

                        uoObj.searchBySellerCompany();

                        break;
                }
            }





            else{
                uoObj.addToCart_LeaveComment();
            }
        }*/





















    }
}