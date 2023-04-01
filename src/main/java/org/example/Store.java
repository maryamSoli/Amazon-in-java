package org.example;

public class Store {

    /*Admin aObj = new Admin();
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


        do {

            mObj.AccountMenu();
            accountChoice = input.nextInt();

            switch (accountChoice){

                case 1:
                    System.out.println("Login Please");
                    aoObj.login();
                    if (aoObj.aloginChecker == true){

                        mObj.AdminMenu();
                        adminChoice = input.nextInt();

                        do {

                            if (adminChoice==1){
                                aoObj.addAdmin();
                            }

                            else if(adminChoice==2){
                                uoObj.showUsers();
                            }

                            else if(adminChoice==3){
                                soObj.showSellers();
                            }

                            else if(adminChoice==4){
                                aoObj.showAdmins();
                            }

                            else if (adminChoice==5){
                                aoObj.showSellerAuthorizingRequests();
                            }

                            else if(adminChoice==6){
                                aoObj.showUsersFundingRequests();
                            }

                            else if (adminChoice==7){
                                aoObj.showFinalOrderingRequests();
                            }

                            else if (adminChoice==8){
                                uoObj.showProducts();
                            }

                            else if(adminChoice==9){
                                shopObj.getShopProfit();
                            }

                            else if (adminChoice==10){
                                shopObj.showWholeOrders();
                            }

                            else {
                                System.out.println("Such Option Doesn't Exist.Try Again");
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

                             mObj.SellerMenu();
                             sellerChoice =input.nextInt();

                             do {

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
                                     sObj.getWallet();
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

                        mObj.UserMenu();
                        userChoice = input.nextInt();

                        do {

                            if (userChoice==1){
                                uoObj.editPersonalInfo();
                            }

                            else if(userChoice==2){
                                uoObj.addToCart_LeaveComment();
                            }

                            else if(userChoice==3){
                                uoObj.showProducts();
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
                                            uoObj.authorizedOrders();

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
                                uoObj.showOrders();
                            }

                            else if(userChoice==9){
                                uoObj.fundRequest();
                            }

                            else if (userChoice==10){
                                uObj.getWallet();
                            }

                            else if (userChoice==11){
                                shopObj.ContactMenu();
                            }

                            else {
                                System.out.println("Such Option Doesn't Exist.Try Again");
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
        while (accountChoice!=100);*/

}
