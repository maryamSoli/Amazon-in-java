package org.example;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.time.LocalDate;

public class UserOperations {

    public boolean  uloginChecker;
    public boolean  OrderConfirmChecker;
    ArrayList<Product> shoppingCart = new ArrayList();
    ArrayList<Product> ListOfOrders = new ArrayList();
    Scanner input = new Scanner(System.in);
    private double totalPrice;
    SellerOperations SOobj = new SellerOperations();
    Seller Sobj = new Seller();
    Shop shop = new Shop();
   // User user = new User();
    LocalDate localDate = LocalDate.now();

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void CreateAccount() {

        User user = new User();
        user.User();
        int flag = 0;
        for (User i : Panels.theUsers)
            if (user.getPhoneNumber().equalsIgnoreCase(i.getPhoneNumber())) {
                System.out.println("User With This Phone Number Already Exists\n" +
                        "Attention : Having More Than One Account With One Phone Number is NOT Possible!");
                flag++;
            }

        if (flag == 0) {
            Panels.theUsers.add(user);
        }
    }


    public void login(){

        System.out.println("Enter Your User Name");
        String username = input.nextLine();
        System.out.println("Enter Your Password");
        String password = input.nextLine();
        int flag = 0;
        for (User i : Panels.theUsers) {
            if (username.equals(i.getUserName()) && password.equals(i.getPassWord())) {
                System.out.println("Login Successfully!");
                flag++;

            uloginChecker = true;
            }
        }

        if (flag == 0){

            System.out.println("User is not Registered Or Username Or Password Is Not Correct.");

            uloginChecker = false;
        }
    }



    public void editPersonalInfo(){ //only after login //Not sure about the function try it later
        User user = new User();
        int flag =0;
        String userNameForUpdating = "";

        System.out.println("First Enter Your Username Then Your Password Please");
        String userName = input.nextLine();
        String passWord = input.nextLine();

        for (User i : Panels.theUsers){
            if (userName.equals(i.getUserName()) && passWord.equals(i.getPassWord())){
                userNameForUpdating = userName;
                System.out.println(i.toString());
                flag++;
            }
        }
        if (flag == 0){
            System.out.println("Username or password is Incorrect. Try Again");
        }

        else{

            Scanner in = new Scanner(System.in);

            int choice ;

            do {
                System.out.println("Press 1 To Change Your Address");
                System.out.println("Press 2 To Change Your Phone Number");
                System.out.println("Press 3 To Change Your E-Mail");
                System.out.println("Press 4 To Get Out");

                choice=input.nextInt();

                switch (choice){

                   case 1:

                       String newAddress;
                       System.out.println("You Can Change Your Address Now");
                       newAddress = in.nextLine();
                       for (User i : Panels.theUsers){
                           if (userNameForUpdating.equals(i.getUserName())){
                               i.setAddress(newAddress);
                               Panels.theUsers.set(Panels.theUsers.indexOf(i),i);
                               System.out.println(i.toString());
                           }
                       }


                       break;


                   case 2:
                       String newNumber;
                       System.out.println("You Can Change Your Phone Number Now");
                       newNumber = in.nextLine();
                       for (User i : Panels.theUsers){
                           if (userNameForUpdating.equals(i.getUserName())){
                               i.setPhoneNumber(newNumber);
                               Panels.theUsers.set(Panels.theUsers.indexOf(i),i);
                               System.out.println(i.toString());
                           }
                       }
                    break;


                   case 3:
                       String newEmail;
                       System.out.println("You Can Change Your E-mail Now");
                       newEmail = in.nextLine();
                       for (User i : Panels.theUsers){
                           if (userNameForUpdating.equals(i.getUserName())){
                               i.setEmail(newEmail);
                               Panels.theUsers.set(Panels.theUsers.indexOf(i),i);
                               System.out.println(i.toString());
                           }
                       }
                    break;

               }

            }
            while (choice!=4);

            System.out.println("Changes Submitted Successfully!");
        }
    }

    public void add(){

        System.out.println("Enter The Row Number Of Your Wanted Product To Add To Your Cart");
        int option = input.nextInt();
        for (Product i : Panels.theProducts){
            if (option == Panels.theProducts.indexOf(i)){
                shoppingCart.add(i);
            }
        }
    }

    public void comment(){

        String comment;
        //int flag=0;
        System.out.println("Enter The Row Number Of Your Wanted Product To Leave a Comment");
        //input.nextLine();
        int option = input.nextInt();
        input.nextLine();
        for (Product i : Panels.theProducts){
            if (option == Panels.theProducts.indexOf(i)){
               // flag++;
                System.out.println("Leave A Comment Please");
                 comment = input.nextLine();
                i.comments.add(comment);
            }
        }

    }


    public void addToCart_LeaveCommentChoice(){
        System.out.println("1 : Add To Cart");
        System.out.println("2 : Leave A Comment");
        System.out.println("3 : Get Out");
        int choicee = input.nextInt();
        if (choicee == 1){
            add();
        }
        else if(choicee == 2) {
            comment();
        }

    }


    public void addToCart_LeaveComment(){

        int choice;

        do {

            SOobj.ProductMenu();
            choice = input.nextInt();
            switch (choice) {

                case 1:
                    SOobj.electronicsMenu();
                    int electronicsChoice = input.nextInt();

                    if (electronicsChoice == 1) {
                        System.out.println("Here You Can See The Laptops:");
                        for (Product i : Panels.theProducts) {
                            if (Objects.isNull(i.getCategory()) && Objects.isNull(i.getCameraQuality())) {
                                System.out.println(Panels.theProducts.indexOf(i) + i.toStringLaptop());
                            }
                        }

                        addToCart_LeaveCommentChoice();
                    }

                    else {
                        System.out.println("Here You Can See The Smart Phones:");
                        for (Product i : Panels.theProducts) {
                            if (Objects.isNull(i.getCategory()) && Objects.nonNull(i.getCameraQuality())) {
                                System.out.println(Panels.theProducts.indexOf(i));
                                i.toStringPhone();
                            }
                        }
                        addToCart_LeaveCommentChoice();
                    }

                    break;


                case 2:

                    Scanner in = new Scanner(System.in);
                    System.out.println("Please Choose The Category You Want\n" +
                            "<<Clothes>> <<Bags>> <<Shoes>> <<Books>>\n" +
                            "<<Cosmetics>> <<Perfume>> <<Jewelery>> <<House Furniture>> <<Musical Instruments>>");
                    String category = in.nextLine();
                    for (Product i : Panels.theProducts){
                        if (category.equalsIgnoreCase(i.getCategory())){
                            System.out.println(Panels.theProducts.indexOf(i) + i.toStringProduct());
                        }
                    }
                    addToCart_LeaveCommentChoice();

                    break;

            }
        }

        while (choice!=0);

    }

    public void searchByName(){

        System.out.println("Please Enter The Name Of Product To Search By Name");
        String name = input.nextLine();
        input.nextLine();
        int flag = 0;
        for (Product i : Panels.theProducts ){

            if (i.getName().equalsIgnoreCase(name)){

               /* if(Objects.isNull(i.getCategory()) && Objects.isNull(i.getCameraQuality())){
                    System.out.println(Panels.theProducts.indexOf(i) + i.toStringLaptop());
                }

                if (Objects.isNull(i.getCategory()) && Objects.nonNull(i.getCameraQuality())){
                    System.out.println(Panels.theProducts.indexOf(i)+i.toStringPhone());

                }

                if (Objects.nonNull(i.getCategory())){
                    System.out.println(Panels.theProducts.indexOf(i) + i.toStringProduct());

                }

                flag++;*/

                System.out.println(Panels.theProducts.indexOf(i)+i.toString());
                flag++;

            }
        }

        if (flag == 0){

            System.out.println("Product With Name " + name + " not Found.");
        }

        addToCart_LeaveCommentChoice();

    }



    public void searchByBrand(){

        System.out.println("Please Enter The Brand To Search By Brand");
        String brand = input.nextLine();
        input.nextLine();
        int flag = 0;
        for (Product i : Panels.theProducts ){

            if (i.getBrand().equalsIgnoreCase(brand)){

               /* if(Objects.isNull(i.getCategory()) && Objects.isNull(i.getCameraQuality())){
                    System.out.println(Panels.theProducts.indexOf(i) + i.toStringLaptop());
                }

                if (Objects.isNull(i.getCategory()) && Objects.nonNull(i.getCameraQuality())){
                    System.out.println(Panels.theProducts.indexOf(i)+i.toStringPhone());

                }

                if (Objects.nonNull(i.getCategory())){
                    System.out.println(Panels.theProducts.indexOf(i) + i.toStringProduct());

                }
                flag++;*/

                System.out.println(Panels.theProducts.indexOf(i)+i.toString());
                flag++;

            }
        }

        if (flag == 0){
            System.out.println("Product With Brand " + brand + " not Found.");
        }

        addToCart_LeaveCommentChoice();
    }


    public void searchBySellerCompany(){

        System.out.println("Please Enter The Seller Company To Search By Seller Company");
        String company = input.nextLine();
        input.nextLine();
        int flag = 0;
        for (Product i : Panels.theProducts ){


            if (i.getSellerCompany().equalsIgnoreCase(company)){

              /*  if(Objects.isNull(i.getCategory()) && Objects.isNull(i.getCameraQuality())){
                    System.out.println(Panels.theProducts.indexOf(i) + i.toStringLaptop());
                    flag++;
                }

                 if (Objects.isNull(i.getCategory()) && Objects.nonNull(i.getCameraQuality())){
                    System.out.println(Panels.theProducts.indexOf(i) + i.toStringPhone());
                     flag++;

                }

                 if (Objects.nonNull(i.getCategory())){
                    System.out.println(Panels.theProducts.indexOf(i) + i.toStringProduct());
                     flag++;

                }*/

                System.out.println(Panels.theProducts.indexOf(i)+i.toString());
                flag++;

            }
        }

        if (flag == 0){

            System.out.println("Product With Seller Company " + company + " not Found.");
        }
        addToCart_LeaveCommentChoice();

    }

    public void seeShoppingCart(){

        System.out.println("Your Shopping Cart:");

        for (Product i : shoppingCart){

            if(Objects.isNull(i.getCategory()) && Objects.isNull(i.getCameraQuality())){
                System.out.println(shoppingCart.indexOf(i) + i.toStringLaptop());
            }

            else if (Objects.isNull(i.getCategory()) && Objects.nonNull(i.getCameraQuality())){
                System.out.println(shoppingCart.indexOf(i));
                i.toStringPhone();
            }

            else if (Objects.nonNull(i.getCategory())){
                System.out.println(shoppingCart.indexOf(i) + i.toStringProduct());

            }




        }

    }

    public void removeFromCart(){

         seeShoppingCart();

        System.out.println("Please Enter The Row Number Of The Product You Want To Remove\n" +
                "From Your Shopping Cart");
        int option = input.nextInt();
        int flag =0;
        for (Product i : shoppingCart){
            if (option == shoppingCart.indexOf(i)){
                shoppingCart.remove(i);
                flag++;
            }
        }
        if (flag == 0){

            System.out.println("Such Product Doesn't Exist In Your Shopping Cart");
        }

    }

    public void addQuantity(){

        seeShoppingCart();

        System.out.println("Please Enter The Row Number Of The Product You Want To Add Its Quantity");
        int option = input.nextInt();
        int flag =0;
        int wantedQuantity;
        for (Product i : shoppingCart){
            if (option == shoppingCart.indexOf(i)){
                wantedQuantity = input.nextInt();
                if (i.getSellerQuantity() - wantedQuantity < 0){
                    System.out.println("UNAVAILABLE\n" +
                            "PLEASE PAY ATTENTION TO THE AVAILABLE QUANTITY");
                }
                else {

                    i.setUserQuantity(wantedQuantity);
                    // i.setSellerQuantity(i.getSellerQuantity()-wantedQuantity);
                }
                flag++;
            }
        }
        if (flag == 0){

            System.out.println("Such Product Doesn't Exist In Your Shopping Cart");
        }

    }

    public void finalPrice(){

        seeShoppingCart();

        double total = 0;

        for (Product i : shoppingCart){

            total+=(i.getPrice()*i.getUserQuantity());

        }
        setTotalPrice(total);
        System.out.println("TOTAL PRICE:" + getTotalPrice());
    }



    public void finalizeOrderWallet(){

        //add 90% to sellers wallet
        for (Product i : shoppingCart){
            for (Seller j : Panels.theSellers){
                if (i.getSellerCompany().equalsIgnoreCase(j.getCompanyName())){
                    j.setWallet(j.getWallet()+(0.9*i.getUserQuantity()*i.getPrice()));
                }
            }
        }

        //add 10% to shop profit
        Panels.totalProfit+=(0.1*getTotalPrice());


        //remove from user wallet
        int flag = 0;
        System.out.println("Enter Password");
        String pass = input.nextLine();
        for (User i : Panels.theUsers){
            if (pass.equals(i.getPassWord())){
                if (i.getWallet()-getTotalPrice()<0){
                    System.out.println("The Amount Of Money In Your Wallet Is Not Enough.\n" +
                            "Please Send a Funding Request To the Administration.");
                }
                else {
                    i.setWallet(i.getWallet()-getTotalPrice());
                }
                System.out.println(i.getWallet());
                flag++;
            }
        }
        if (flag==0){
            System.out.println("User Doesn't Exist");
        }

        // fix product quantity



    }

    public void fixProductQuantity(){
        for (Product i : shoppingCart) {
            for (Product j : Panels.theProducts) {
                if (i.equals(j)) {
                    j.setSellerQuantity(j.getSellerQuantity() - j.getUserQuantity());
                    j.setUserQuantity(0);
                }
            }
        }
    }

    public void finalizeOrderList() {
        int flag = 0;
        System.out.println("Enter Password");
        String pass = input.nextLine();
        for (User i : Panels.theUsers) {
            if (pass.equals(i.getPassWord())) {
                for (Product j : shoppingCart) {
                    ListOfOrders.add(j);
                    Panels.theWholeOrders.add(j.toString() + "  " + "Local date:" + localDate.toString() + "  "+ "Total Price:" + getTotalPrice() + "Username:"+ i.getUserName());
                    flag++;
                }
            }
        }
        if (flag == 0) {
            System.out.println("such user does not exist");
        }

        shoppingCart.clear();
    }


    public void seeFinalOrderList() {

        int flag = 0;
        System.out.println("Enter Password");
        String pass = input.nextLine();
        for (User i : Panels.theUsers) {
            if (pass.equals(i.getPassWord())) {
                for (Product j : ListOfOrders) {
                    System.out.println(j + localDate.toString() + getTotalPrice() + i.getUserName());
                    flag++;
                }
            }
        }

        if (flag==0) {
            System.out.println("such user does not exist");
        }
    }

    public void seeWholeOrdersList(){
        for (String i : Panels.theWholeOrders){
            System.out.println(i);
        }
    }
    public void authorizedOrders(){


        System.out.println("enter password");
        String password = input.nextLine();

        int flag = 0;

        for (String i : Panels.AcceptedOrderListsRequests) {

            if (password.equals(i)) {

                flag++;
            }
        }

        if (flag != 0) {
            System.out.println("You Are Confirmed to Finalize Your Order!");
            OrderConfirmChecker = true;
            }

        else {
            System.out.println("Your order is Not confirmed");
            OrderConfirmChecker = false;
        }

    }

    public void acceptedFunds(){


        System.out.println("enter password");
        String password = input.nextLine();

        int flag = 0;

        for (String i : Panels.userFundingAccepted) {

            if (password.equals(i)) {

                flag++;
            }
        }

        if (flag != 0) {
            System.out.println("Your Fund is Added!");
            OrderConfirmChecker = true;
        }

        else {
            System.out.println("Your Fund is Not confirmed");
            OrderConfirmChecker = false;
        }

    }


    public void fundRequest() {

        int flag = 0;
        System.out.println("Enter Your Password To Send The Request");

        String password = input.nextLine();
        for (User i : Panels.theUsers) {

            if (password.equals(i.getPassWord())) {

                flag++;
            }
        }

        if (flag != 0) {

            Panels.userFunding.add(password);
            System.out.println("The Request has been Sent To the Admins.");
        } else {

            System.out.println("User With This Password Doesn't Exists.");
        }
    }


    public void OrderRequest() {

        int flag = 0;
        System.out.println("Enter Your Password To Send The Order Request");

        String password = input.nextLine();
        for (User i : Panels.theUsers) {

            if (password.equals(i.getPassWord())) {

                flag++;
            }
        }

        if (flag != 0) {

            Panels.orderREQUEST.add(password);
            System.out.println("The Request has been Sent To the Admins.");
        } else {

            System.out.println("User With This Password Doesn't Exists.");
        }
    }


    public void showUsers(){
        for (User i : Panels.theUsers){
            System.out.println(i.toString());
        }
    }

    public void showProducts(){
        for (Product i : Panels.theProducts){
            System.out.println(i);
        }
    }



}
