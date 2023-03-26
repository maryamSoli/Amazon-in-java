package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminOperations {

    ArrayList<Admin> theAdmins = new ArrayList();
    ArrayList<String> AcceptedSellerAuthorizingRequests = new ArrayList();
    Scanner input = new Scanner(System.in);


    public void addAdmin(){

        Admin admin = new Admin();

        admin.Admin();

        theAdmins.add(admin);
    }

    public void login(){

        Admin admin = new Admin();

        int flag = 0;

        for (Admin i : theAdmins) {

            if (admin.getUserName().equals(i.getUserName()) && admin.getPassWord().equals(i.getPassWord())) {

                System.out.println("Login Successfully!");

                flag++;

                //loginChecker = true;

            }

        }

        if (flag == 0){

            System.out.println("Admin is not Registered.");

            //loginChecker = false;

        }

    }

    public void showSellerAuthorizingRequests(){

        System.out.println("SHOWING THE COMPANIES THAT ASKED FOR PERMISSION");

        SellerOperations requests = new SellerOperations();

        for (String i : requests.theSellersAuthorizingRequests){

            System.out.println(i);
        }

        System.out.println("Enter The Company Names To Confirm(When Finished , Enter 'o'");
        System.out.println("ATTENTION : When You Enter 'o' Every Companies Remaining in the Authorizing Requests List Will be Removed Automatically.\nSo Before Entering 'o' Make Sure To Confirm Every Companies You Desire");

        while (true){

            int flag = 0;

            String company = input.nextLine();

            if (company.equals("o")){

                break;
            }

            else {

                for (String i : requests.theSellersAuthorizingRequests){

                    if (company.equalsIgnoreCase(i)){

                        flag++;
                    }
                }

                if (flag == 0){

                    System.out.println("Such Company Doesn't Exists in the Requests");
                }

                else {

                    AcceptedSellerAuthorizingRequests.add(company);
                    requests.theSellersAuthorizingRequests.remove(company);
                }

                requests.theSellersAuthorizingRequests = null;

            }

        }
    }


}
