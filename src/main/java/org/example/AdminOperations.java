package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminOperations {

    public boolean  aloginChecker;

   // ArrayList<String> AcceptedOrderListsRequests = new ArrayList();
    Scanner input = new Scanner(System.in);

    //User user = new User();







    public void addAdmin(){

        Admin admin = new Admin();
        admin.Admin();
        Panels.theAdmins.add(admin);

    }

    public void login(){

        System.out.println("Enter Your Username(Or Default Username)");
        String username = input.nextLine();
        System.out.println("Enter Your Password(Or Default Password)");
        String password = input.nextLine();

        int flag = 0;
        for (Admin i : Panels.theAdmins) {
            if (username.equals(i.getUserName()) && password.equals(i.getPassWord())) {
                aloginChecker = true;
                System.out.println("Login Successfully!");
                flag++;

            }
        }

        if (flag == 0){
            aloginChecker = false;
            System.out.println("Admin is not Registered Or Username Or Password Is Not Correct.");

        }
    }



    public void showSellerAuthorizingRequests(){

        System.out.println("SHOWING THE COMPANIES THAT ASKED FOR PERMISSION");

        for (String i : Panels.theSellersAuthorizingRequests){
            System.out.println(i);
        }

        System.out.println("Enter The Company Names To Confirm , When Finished , Enter 'o'");
        System.out.println("ATTENTION : When You Enter 'o' Every Companies Remaining in the Authorizing Requests List Will be Removed Automatically.\nSo Before Entering 'o' Make Sure To Confirm Every Companies You Desire");

        while (true){


            int flag = 0;
            String company = input.nextLine();
            if (company.equals("o")){
                Panels.theSellersAuthorizingRequests.clear();
                break;
            }
            else {
                for (String i : Panels.theSellersAuthorizingRequests){
                    if (company.equalsIgnoreCase(i)){
                        flag++;
                    }
                }
                if (flag == 0){
                    System.out.println("Such Company Doesn't Exists in the Requests");
                }

                else {
                    Panels.AcceptedSellerAuthorizingRequests.add(company);
                    Panels.theSellersAuthorizingRequests.remove(company);

                }

            }
        }
    }


    public void showUsersFundingRequests(){

            System.out.println("SHOWING THE USERS THAT ASKED FOR FUND");
            UserOperations request = new UserOperations();
            for (String i : Panels.userFunding){
                System.out.println(i);
            }
            System.out.println("Enter The Users Passwords To Confirm(When Finished , Enter 'o'");
            System.out.println("ATTENTION : When You Enter 'o' Every Users Remaining in the Authorizing Requests List Will be Removed Automatically.\nSo Before Entering 'o' Make Sure To Confirm Every Companies You Desire");

            while (true){

                int flag = 0;
                String password = input.nextLine();
                if (password.equals("o")){

                    break;
                }

                else {

                    for (String i : Panels.userFunding){

                        if (password.equalsIgnoreCase(i)){

                            for (User j : Panels.theUsers){
                                if (password.equals(j.getPassWord())){
                                    j.setWallet(j.getWallet()+input.nextDouble());
                                }
                            }

                            flag++;
                        }
                    }

                    if (flag == 0){
                        System.out.println("Such User Password Doesn't Exists in the Requests");
                    }

                    else {
                        Panels.userFunding.remove(password);
                    }

                    Panels.userFunding.clear();
                }
            }
    }


    public void showFinalOrderingRequests() {

        System.out.println("SHOWING THE USERS THAT ASKED FOR FINALIZING ORDERS");
        //UserOperations orequest = new UserOperations();
        for (String i : Panels.orderREQUEST) {
            System.out.println(i);
            }

        System.out.println("Enter The Users Passwords To Confirm(When Finished , Enter 'o'");
        System.out.println("ATTENTION : When You Enter 'o' Every Users Remaining in the Authorizing Requests List Will be Removed Automatically.\nSo Before Entering 'o' Make Sure To Confirm Every Companies You Desire");

        while (true){

            int flag = 0;
            String password = input.nextLine();
            if (password.equals("o")){
                break;
            }

            else {

                for (String i : Panels.orderREQUEST){
                    if (password.equals(i)){
                        flag++;
                    }
                }

                if (flag == 0){
                    System.out.println("Such User Doesn't Exists in the Requests");
                }

                else {
                    //AcceptedOrderListsRequests.add(password);
                    Panels.orderREQUEST.remove(password);
                }

                Panels.orderREQUEST.clear();

            }

        }
    }


    public void showAdmins(){
        for (Admin i : Panels.theAdmins){
            System.out.println(i.toString());
        }
    }

}
