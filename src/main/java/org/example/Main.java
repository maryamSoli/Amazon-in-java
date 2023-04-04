package org.example;

import java.util.ArrayList;
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
        int createAccount_LoginChoice;


        Admin defAdmin = new Admin();
        defAdmin.defaultAdmin();
        Panels.theAdmins.add(defAdmin);


        do {

            mObj.AccountMenu();
            accountChoice = input.nextInt();

            switch (accountChoice){

                case 1:
                    System.out.println("Login Please");
                    aoObj.login();
                    if (aoObj.aloginChecker == true){


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
                                case 9:
                                    System.out.println(Panels.totalProfit);
                                    break;
                                case 10:
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




                case 2:
                     mObj.createAccount_LoginMenu();
                     createAccount_LoginChoice =input.nextInt();

                     if (createAccount_LoginChoice==1){
                         //SellerOperations s = new SellerOperations();
                         soObj.CreateAccount();
                     }

                     else {
                         //SellerOperations s = new SellerOperations();
                         soObj.login();

                         if (soObj.sloginChecker == true){

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

                                     if (soObj.authorizedSellersChecker==true) {
                                         soObj.addProduct();
                                     }

                                     else {
                                         System.out.println("You Are Not Authorized To Add Your Product\nGet Authorized First");
                                     }

                                 }

                                 else if (sellerChoice == 4) {
                                     System.out.println(sObj.getWallet());
                                 }

                                 else if (sellerChoice == 5) {
                                     shopObj.ContactMenu();
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




                case 3:
                    mObj.createAccount_LoginMenu();
                    createAccount_LoginChoice =input.nextInt();

                    if (createAccount_LoginChoice==1){
                        uoObj.CreateAccount();
                    }

                    else {
                        uoObj.login();
                    }
                    if (uoObj.uloginChecker == true){

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

                            else if (userChoice==5){
                                uoObj.searchByName();
                            }

                            else if(userChoice==6){
                                uoObj.searchBySellerCompany();
                            }

                            else if (userChoice==7){

                                uoObj.seeShoppingCart();

                                do {

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
                                            //uoObj.OrderRequest();
                                            uoObj.authorizedOrders();

                                            if (uoObj.OrderConfirmChecker==true){
                                                uoObj.finalizeOrderWallet();
                                                uoObj.fixProductQuantity();
                                                uoObj.finalizeOrderList();

                                            }

                                            else {
                                                System.out.println("Your Order Hasn't Been Confirmed By Admins");
                                            }
                                            break;

                                        case 5:
                                            uoObj.authorizedOrders();
                                            break;

                                        case 6:
                                            if (uoObj.OrderConfirmChecker==true){
                                                uoObj.finalizeOrderList();
                                                uoObj.finalizeOrderWallet();
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
                                shopObj.ContactMenu();
                            }


                        }
                        while (userChoice!=400);

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
                uoObj.searchByName();
            }
            else{
                uoObj.addToCart_LeaveComment();
            }
        }*/





















    }
}