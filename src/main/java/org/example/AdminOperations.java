package org.example;


import java.util.Scanner;

public class AdminOperations {

    public boolean  aloginChecker;

    Scanner input = new Scanner(System.in);



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
                    Panels.userFunding.clear();
                    break;
                }

                else {

                    for (String i : Panels.userFunding){

                        if (password.equals(i)){
                            for (User j : Panels.theUsers){
                                if (password.equals(j.getPassWord())){
                                    System.out.println("Enter the amount of fund");
                                    double fund = input.nextDouble();
                                    j.setWallet(j.getWallet()+fund);
                                }
                            }

                            flag++;
                        }
                    }

                    if (flag == 0){
                        System.out.println("Such User Password Doesn't Exists in the Requests");
                    }

                    else {
                        Panels.userFundingAccepted.add(password);
                        Panels.userFunding.remove(password);
                    }

                }
            }
    }

    public void UserSeeWallet(){
        int flag = 0;
        System.out.println("Enter Password To See Wallet");
        String pass = input.nextLine();
        for (User i : Panels.theUsers){
            if (pass.equals(i.getPassWord())){
                System.out.println(i.getWallet());
                flag++;
            }
        }
        if (flag==0){
            System.out.println("User Doesn't Exist");
        }
    }



    public void showFinalOrderingRequests() {

        System.out.println("SHOWING THE USERS THAT ASKED FOR FINALIZING ORDERS");

        for (String i : Panels.orderREQUEST) {
            System.out.println(i);
            }

        System.out.println("Enter The Users Passwords To Confirm(When Finished , Enter 'o'");
        System.out.println("ATTENTION : When You Enter 'o' Every Users Remaining in the Authorizing Requests List Will be Removed Automatically.\nSo Before Entering 'o' Make Sure To Confirm Every Companies You Desire");

        while (true){

            int flag;
            String password = input.nextLine();
            if (password.equals("o")){
                Panels.orderREQUEST.clear();
                break;
            }

            else {

                flag = 0;
                for (String i : Panels.orderREQUEST){
                    if (password.equals(i)){
                        flag++;
                    }
                }

                if (flag == 0){
                    System.out.println("Such User Doesn't Exists in the Requests");
                }

                else {

                    Panels.orderREQUEST.remove(password);
                    Panels.AcceptedOrderListsRequests.add(password);
                }

            }

        }
    }


    public void showAdmins(){
        for (Admin i : Panels.theAdmins){
            System.out.println(i.toString());
        }
    }

}
