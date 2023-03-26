package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class SellerOperations {

    ArrayList<Seller> theSellers = new ArrayList();
    ArrayList<String> theSellersAuthorizingRequests = new ArrayList();
    Scanner input = new Scanner(System.in);


   /* public int compareCompanies(Seller s1, Seller s2){

        if (s1.getCompanyName().equalsIgnoreCase(s2.getCompanyName())){

            System.out.println("Company With This Name Already Exists.");

            return 0;

        }

        return 1;

    }*/

    public void CreateAccount(){

        Seller seller = new Seller();

        seller.Seller();

        int flag = 0;

        for (Seller i : theSellers)

        if (seller.getCompanyName().equalsIgnoreCase(i.getCompanyName())){

            System.out.println("Seller With This Company Name Exists");

            flag++;
        }

        if (flag == 0){

            theSellers.add(seller);
        }


    }

    public void login(){

        Seller seller = new Seller();

        int flag = 0;

        for (Seller i : theSellers) {

            if (seller.getCompanyName().equals(i.getCompanyName()) && seller.getPassWord().equals(i.getPassWord())) {

                System.out.println("Login Successfully!");

                flag++;

                //loginChecker = true;

            }

        }

        if (flag == 0){

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

    public void AuthorizedSellers(){

        System.out.println("To See If You are Authorized Please Enter The Name Of Your Company");

       String company = input.nextLine();

       AdminOperations AuthorizedRequests = new AdminOperations();

       int flag = 0;

       for (String i : AuthorizedRequests.AcceptedSellerAuthorizingRequests){

           if (company.equalsIgnoreCase(i)){

               flag++;
           }
       }

       if (flag != 0){

           System.out.println("You Are Authorized to Add your Product!");
       }

       else {

           System.out.println("You Are Not Authorized\nPossible Reasons:");
           System.out.println("1.The Admins haven't Seen Your Request Yet( Possible Solution : Check It Again Later!)");
           System.out.println("2.You have not Requested for Authorization( Possible Solution : Make a Request!");
           System.out.println("3.The Admins didn't Confirm Your Company( Possible Solution : Try To Contact Us in CONTACT Section to Know The Reason");
       }
    }














}
