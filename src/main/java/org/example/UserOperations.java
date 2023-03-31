package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class UserOperations {

    public boolean  uloginChecker;
    public boolean  OrderConfirmChecker;
    ArrayList<User> theUsers = new ArrayList();
    ArrayList<Product> shoppingCart = new ArrayList();
    ArrayList<String> userFunding = new ArrayList();
    ArrayList<String> orderREQUEST = new ArrayList();
    Scanner input = new Scanner(System.in);
    private double totalPrice;
    SellerOperations SOobj = new SellerOperations();
    Seller Sobj = new Seller();
    Shop shop = new Shop();
    User user = new User();
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
        for (User i : theUsers)
            if (user.getPhoneNumber().equalsIgnoreCase(i.getPhoneNumber())) {
                System.out.println("User With This Phone Number Already Exists\n" +
                        "Attention : Having More Than One Account With One Phone Number is NOT Possible!");
                flag++;
            }

        if (flag == 0) {
            theUsers.add(user);
        }
    }


    public void login(){

        User user = new User();
        int flag = 0;
        for (User i : theUsers) {
            if (user.getUserName().equals(i.getUserName()) && user.getPassWord().equals(i.getPassWord())) {
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

        System.out.println("First Enter Your Username Then Your Password Please");
        User user = new User();
        int flag =0;
        String userName = input.nextLine();
        String passWord = input.nextLine();
        for (User i : theUsers){
            if (userName.equals(i.getUserName()) && passWord.equals(i.getPassWord())){
                flag++;
            }
        }
        if (flag == 0){
            System.out.println("Username or password is Incorrect. Try Again");
        }

        else{

            user.toString();
            System.out.println("Press 'a' To Change Your Address");
            System.out.println("Press 'p' To Change Your Phone Number");
            System.out.println("Press 'e' To Change Your E-Mail");
            //System.out.println("Press 'q' To Get Out");


            while (true) {

                char choice = input.next().charAt(0);
                if (choice == 'a'){
                    user.setAddress(input.nextLine());
                    break;
                }

                else if(choice == 'p'){
                    user.setPhoneNumber(input.nextLine());
                    break;
                }

                else if (choice == 'e') {
                    user.setEmail(input.nextLine());
                    break;
                }

                else {
                    break;
                }

            }

            System.out.println("Changes Submitted Successfully!");
        }
    }

    public void add(){

        System.out.println("Enter The Row Number Of Your Wanted Product To Add To Your Cart");
        int option = input.nextInt();
        for (Product i : SOobj.theProducts){
            if (option == SOobj.theProducts.indexOf(i)){
                shoppingCart.add(i);
            }
        }
    }

    public void comment(){

        System.out.println("Enter The Row Number Of Your Wanted Product To Leave a Comment");
        int option = input.nextInt();
        for (Product i : SOobj.theProducts){
            if (option == SOobj.theProducts.indexOf(i)){
                i.comments.add(input.nextLine());
            }
        }
    }


    public void addToCart_LeaveCommentChoice(){
        System.out.println("1 : Add To Cart");
        System.out.println("2 : Leave A Comment");
        int choicee = input.nextInt();
        if (choicee == 1){
            add();
        }
        else {
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
                        for (Product i : SOobj.theProducts){
                            System.out.println(SOobj.theProducts.indexOf(i) + i.toStringLaptop());
                        }

                        addToCart_LeaveCommentChoice();
                    }

                    else {
                        System.out.println("Here You Can See The Smart Phones:");
                        for (Product i : SOobj.theProducts){
                            System.out.println(SOobj.theProducts.indexOf(i) + i.toStringPhone());
                        }
                        addToCart_LeaveCommentChoice();
                    }

                    break;


                case 2:

                    System.out.println("Please Choose The Category You Want\n" +
                            "<<Clothes>> <<Bags>> <<Shoes>> <<Books>>\n" +
                            "<<Cosmetics>> <<Perfume>> <<Jewelery>> <<House Furniture>> <<Musical Instruments>>");
                    String category = input.nextLine();
                    for (Product i : SOobj.theProducts){
                        if (category.equalsIgnoreCase(i.getCategory())){
                            System.out.println(SOobj.theProducts.indexOf(i) + i.toString());
                        }
                    }
                    addToCart_LeaveCommentChoice();

                    break;

            }
        }

        while (choice!=0);

    }

    public void searchByName(){

        String name = input.nextLine();
        int flag = 0;
        for (Product i : SOobj.theProducts ){

            if (i.getName().equalsIgnoreCase(name)){

                System.out.println(SOobj.theProducts.indexOf(i) + i.toStringProduct());
                System.out.println(SOobj.theProducts.indexOf(i) + i.toStringPhone());
                System.out.println(SOobj.theProducts.indexOf(i) + i.toStringLaptop());

                flag++;

            }
        }

        if (flag == 0){

            System.out.println("Product With Name " + name + " not Found.");
        }

        addToCart_LeaveCommentChoice();

    }



    public void searchByBrand(){

        String brand = input.nextLine();
        int flag = 0;
        for (Product i : SOobj.theProducts ){

            if (i.getBrand().equalsIgnoreCase(brand)){

                System.out.println(SOobj.theProducts.indexOf(i) + i.toStringProduct());
                System.out.println(SOobj.theProducts.indexOf(i) + i.toStringPhone());
                System.out.println(SOobj.theProducts.indexOf(i) + i.toStringLaptop());

                flag++;

            }
        }

        if (flag == 0){
            System.out.println("Product With Brand " + brand + " not Found.");
        }

        addToCart_LeaveCommentChoice();
    }


    public void searchBySellerCompany(){

        String company = input.nextLine();
        int flag = 0;
        for (Product i : SOobj.theProducts ){

            if (i.getSellerCompany().equalsIgnoreCase(company)){

                System.out.println(SOobj.theProducts.indexOf(i) + i.toStringProduct());
                System.out.println(SOobj.theProducts.indexOf(i) + i.toStringPhone());
                System.out.println(SOobj.theProducts.indexOf(i) + i.toStringLaptop());

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

            System.out.println(shoppingCart.indexOf(i) + i.toStringProduct());
            System.out.println(shoppingCart.indexOf(i) + i.toStringPhone());
            System.out.println(shoppingCart.indexOf(i) + i.toStringLaptop());

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
        // fix product quantity
        for (Product i : shoppingCart) {
            i.setSellerQuantity(i.getSellerQuantity() - i.getUserQuantity());
        }
        //add 90% to sellers wallet
        for (Product i : shoppingCart){
            for (Seller j : SOobj.theSellers){
                if (i.getSellerCompany().equalsIgnoreCase(j.getCompanyName())){
                    j.setWallet(j.getWallet()+(0.9*i.getPrice()));
                }
            }
        }

        //add 10% to shop profit
        shop.setShopProfit(shop.getShopProfit()+(0.1*getTotalPrice()));


        //remove from user wallet
        if (user.getWallet()-getTotalPrice() < 0 ){
            System.out.println("The Amount Of Money In Your Wallet Is Not Enough.\n" +
                    "Please Send a Funding Request To the Administration.");
        }
        else {
            user.setWallet(user.getWallet()-getTotalPrice());
        }

    }

    public void finalizeOrderList(){

        Shop shop = new Shop();

        for (Product i : SOobj.theProducts){
            user.ListOfOrders.add(i.toString() + localDate.toString() + getTotalPrice() + user.getUserName());
            shop.theWholeOrders.add(i.toString() + localDate.toString() + getTotalPrice() + user.getUserName());
        }
        shoppingCart = null;
    }

    public void authorizedOrders(){

        String password = input.nextLine();

        AdminOperations AuthorizedRequests = new AdminOperations();

        int flag = 0;

        for (String i : AuthorizedRequests.AcceptedOrderListsRequests) {

            if (password.equals(i)) {

                flag++;
            }
        }

        if (flag != 0) {
            for (String i : user.ListOfOrders){
                System.out.println(i);
                OrderConfirmChecker = true;
            }
        }
        else {
            System.out.println("Your order is Not confirmed");
            OrderConfirmChecker = false;
        }

    }


    public void fundRequest() {

        int flag = 0;
        System.out.println("Enter Your Password To Send The Request");

        String password = input.nextLine();
        for (User i : theUsers) {

            if (password.equalsIgnoreCase(i.getPassWord())) {

                flag++;
            }
        }

        if (flag != 0) {

            userFunding.add(password);
            System.out.println("The Request has been Sent To the Admins.");
        } else {

            System.out.println("User With This Password Doesn't Exists.");
        }
    }


    public void OrderRequest() {

        int flag = 0;
        System.out.println("Enter Your Password To Send The Order Request");

        String password = input.nextLine();
        for (User i : theUsers) {

            if (password.equals(i.getPassWord())) {

                flag++;
            }
        }

        if (flag != 0) {

            orderREQUEST.add(password);
            System.out.println("The Request has been Sent To the Admins.");
        } else {

            System.out.println("User With This Password Doesn't Exists.");
        }
    }


    public void showUsers(){
        for (User i : theUsers){
            System.out.println(i.toString());
        }
    }

    public void showProducts(){
        for (Product i : SOobj.theProducts){
            System.out.println(i);
        }
    }

    public void showOrders(){
        for (String i : user.ListOfOrders){
            System.out.println(i);
        }
    }


}
