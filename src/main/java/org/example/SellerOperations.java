package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class SellerOperations {

    ArrayList<Seller> theSellers = new ArrayList();
    ArrayList<String> theSellersAuthorizingRequests = new ArrayList();
    ArrayList<Laptop> theLaptops = new ArrayList();
    ArrayList<SmartPhone> theSmartPhones = new ArrayList();
    ArrayList<Clothes> theClothes = new ArrayList();
    ArrayList<Books> theBooks = new ArrayList();
    ArrayList<Jewelery> theJeweleries = new ArrayList();
    ArrayList<Furniture> theFurniture = new ArrayList();
    ArrayList<Perfume> thePerfume = new ArrayList();
    ArrayList<MusicalInstrument> theInstruments = new ArrayList();
    ArrayList<Shoes> theShoes = new ArrayList();
    ArrayList<Bags> theBags = new ArrayList();
    ArrayList<Cosmetics> theCosmetics = new ArrayList();
    Scanner input = new Scanner(System.in);


   /* public int compareCompanies(Seller s1, Seller s2){

        if (s1.getCompanyName().equalsIgnoreCase(s2.getCompanyName())){

            System.out.println("Company With This Name Already Exists.");

            return 0;

        }

        return 1;

    }*/

    public void CreateAccount() {

        Seller seller = new Seller();

        seller.Seller();

        int flag = 0;

        for (Seller i : theSellers)

            if (seller.getCompanyName().equalsIgnoreCase(i.getCompanyName())) {

                System.out.println("Seller With This Company Name Exists");

                flag++;
            }

        if (flag == 0) {

            theSellers.add(seller);
        }


    }

    public void login() {

        Seller seller = new Seller();

        int flag = 0;

        for (Seller i : theSellers) {

            if (seller.getCompanyName().equals(i.getCompanyName()) && seller.getPassWord().equals(i.getPassWord())) {

                System.out.println("Login Successfully!");

                flag++;

                //loginChecker = true;

            }

        }

        if (flag == 0) {

            System.out.println("Seller is not Registered.");
            System.out.println("Create Account First!");

            //loginChecker = false;

        }

    }

    public void AuthorizingRequest() {

        int flag = 0;

        int flag2 = 0;

        System.out.println("Enter The Company Name To Send The Request");

        String company = input.nextLine();

        //AdminOperations AuthorizedRequests = new AdminOperations();

        //for (String j : AuthorizedRequests.AcceptedSellerAuthorizingRequests) {

            /*if (company.equalsIgnoreCase(j)) {

                flag2++;
            }
        }

        if (flag2 == 0) {*/

        for (Seller i : theSellers) {

            if (company.equalsIgnoreCase(i.getCompanyName())) {

                flag++;
            }
        }

        if (flag != 0) {

            theSellersAuthorizingRequests.add(company);
            System.out.println("The Request has been Sent To the Admins.");
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

        AdminOperations AuthorizedRequests = new AdminOperations();

        int flag = 0;

        for (String i : AuthorizedRequests.AcceptedSellerAuthorizingRequests) {

            if (company.equalsIgnoreCase(i)) {

                flag++;
            }
        }

        if (flag != 0) {

            System.out.println("You Are Authorized to Add your Product!");
        } else {

            System.out.println("You Are Not Authorized\nPossible Reasons:");
            System.out.println("1.The Admins haven't Seen Your Request Yet( Possible Solution : Check It Again Later!)");
            System.out.println("2.You have not Requested for Authorization( Possible Solution : Make a Request!");
            System.out.println("3.The Admins didn't Confirm Your Company( Possible Solution : Try To Contact Us in CONTACT Section to Know The Reason");
        }
    }


    public void ProductMenu() {

        System.out.println("Please Choose the Product Category That You Want To Add:");
        System.out.println("1 : Electronics");
        System.out.println("2 : Clothes");
        System.out.println("3 : Bags");
        System.out.println("4 : Shoes");
        System.out.println("5 : Cosmetics");
        System.out.println("6 : Perfume");
        System.out.println("7 : Jewelery");
        System.out.println("8 : Books");
        System.out.println("9 : Musical Instruments");
        System.out.println("0 : House Furniture");
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

                        Laptop laptop = new Laptop();

                        laptop.Laptop();// calling Laptop method from Laptop class

                        int flag = 0;

                        for (Laptop i : theLaptops) {

                            if (laptop.equals(i)) {

                                i.addQuantityByOne();

                                flag++;
                            }
                        }

                        if (flag == 0) {

                            theLaptops.add(laptop); // add laptop
                        }

                    } else { // if phone is chosen

                        SmartPhone phone = new SmartPhone();

                        phone.SmartPhone();// calling SmartPhone method from SmartPhone class

                        int flag = 0;

                        for (SmartPhone i : theSmartPhones) {

                            if (phone.equals(i)) {

                                i.addQuantityByOne();

                                flag++;
                            }
                        }

                        if (flag == 0) {

                            theSmartPhones.add(phone);
                        }

                    }
                    break;


                case 2:

                    Clothes cl = new Clothes();

                    cl.Clothes();

                    int flag = 0;

                    for (Clothes i : theClothes) {

                        if (cl.equals(i)) {

                            i.addQuantityByOne();

                            flag++;
                        }
                    }

                    if (flag == 0) {

                        theClothes.add(cl);
                    }

                    break;


                case 3:

                    Bags b = new Bags();

                    b.Bags();

                    flag = 0;

                    for (Bags i : theBags) {

                        if (b.equals(i)) {

                            i.addQuantityByOne();

                            flag++;
                        }
                    }

                    if (flag == 0) {

                        theBags.add(b); // add laptop
                    }

                    break;


                case 4:

                    Shoes s = new Shoes();

                    s.Shoes();

                    flag = 0;

                    for (Shoes i : theShoes) {

                        if (s.equals(i)) {

                            i.addQuantityByOne();

                            flag++;
                        }
                    }

                    if (flag == 0) {

                        theShoes.add(s); // add laptop
                    }

                    break;


                case 5:

                    Cosmetics c = new Cosmetics();

                    c.Cosmetics();

                    flag = 0;

                    for (Cosmetics i : theCosmetics) {

                        if (c.equals(i)) {

                            i.addQuantityByOne();

                            flag++;
                        }
                    }

                    if (flag == 0) {

                        theCosmetics.add(c); // add laptop
                    }

                    break;


                case 6:

                    Perfume p = new Perfume();

                    p.Perfume();

                    flag = 0;

                    for (Perfume i : thePerfume) {

                        if (p.equals(i)) {

                            i.addQuantityByOne();

                            flag++;
                        }
                    }

                    if (flag == 0) {

                        thePerfume.add(p); // add laptop
                    }

                    break;


                case 7:

                    Jewelery j = new Jewelery();

                    j.Jewelery();

                    flag = 0;

                    for (Jewelery i : theJeweleries) {

                        if (j.equals(i)) {

                            i.addQuantityByOne();

                            flag++;
                        }
                    }

                    if (flag == 0) {

                        theJeweleries.add(j); // add laptop
                    }

                    break;


                case 8:

                    Books books = new Books();

                    books.Books();

                    flag = 0;

                    for (Books i : theBooks) {

                        if (books.equals(i)) {

                            i.addQuantityByOne();

                            flag++;
                        }
                    }

                    if (flag == 0) {

                        theBooks.add(books); // add laptop
                    }

                    break;


                case 9:

                    MusicalInstrument m = new MusicalInstrument();

                    m.MusicalInstrument();

                    flag = 0;

                    for (MusicalInstrument i : theInstruments) {

                        if (m.equals(i)) {

                            i.addQuantityByOne();

                            flag++;
                        }
                    }

                    if (flag == 0) {

                        theInstruments.add(m); // add laptop
                    }
                    break;


                case 0:

                    Furniture f = new Furniture();

                    f.Furniture();

                    flag = 0;

                    for (Furniture i : theFurniture) {

                        if (f.equals(i)) {

                            i.addQuantityByOne();

                            flag++;
                        }
                    }

                    if (flag == 0) {

                        theFurniture.add(f); // add laptop
                    }

                    break;

            }

        }
        while (choice != 10);
    }




}