package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminOperations {

    public boolean  aloginChecker;
    ArrayList<Admin> theAdmins = new ArrayList();
    ArrayList<String> AcceptedSellerAuthorizingRequests = new ArrayList();
    ArrayList<String> AcceptedOrderListsRequests = new ArrayList();
    Scanner input = new Scanner(System.in);

    User user = new User();





    public void addAdmin(){

        Admin admin = new Admin();
        admin.Admin();
        theAdmins.add(admin);

    }

    public void login(){

        Admin defAdmin = new Admin();
        defAdmin.defaultAdmin();
        theAdmins.add(defAdmin);

        System.out.println("Enter Your Username(Or Default Username)");
        String username = input.nextLine();
        System.out.println("Enter Your Password(Or Default Password)");
        String password = input.nextLine();

        int flag = 0;
        for (Admin i : theAdmins) {
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


    public void showUsersFundingRequests(){

            System.out.println("SHOWING THE USERS THAT ASKED FOR FUND");
            UserOperations request = new UserOperations();
            for (String i : request.userFunding){
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

                    for (String i : request.userFunding){

                        if (password.equalsIgnoreCase(i)){

                            for (User j : user.theUsers){
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
                        request.userFunding.remove(password);
                    }

                    request.userFunding = null;
                }
            }
    }


    public void showFinalOrderingRequests() {

        System.out.println("SHOWING THE USERS THAT ASKED FOR FINALIZING ORDERS");
        UserOperations orequest = new UserOperations();
        for (String i : orequest.orderREQUEST) {
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

                for (String i : orequest.orderREQUEST){
                    if (password.equals(i)){
                        flag++;
                    }
                }

                if (flag == 0){
                    System.out.println("Such User Doesn't Exists in the Requests");
                }

                else {
                    AcceptedOrderListsRequests.add(password);
                    orequest.orderREQUEST.remove(password);
                }

                orequest.orderREQUEST = null;

            }

        }
    }


    public void showAdmins(){
        for (Admin i : theAdmins){
            System.out.println(i.toString());
        }
    }

}
