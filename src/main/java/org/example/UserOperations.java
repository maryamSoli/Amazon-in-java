package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class UserOperations {

    ArrayList<User> theUsers = new ArrayList();
    ArrayList<String> shoppingCart = new ArrayList();
    Scanner input = new Scanner(System.in);


    public void CreateAccount(){

        User user = new User();

        user.User();

        int flag = 0;

        for (User i : theUsers)

            if (user.getPhoneNumber().equalsIgnoreCase(i.getPhoneNumber())){

                System.out.println("User With This Phone Number Already Exists\n" +
                                   "Attention : Having More Than One Account With One Phone Number is NOT Possible!");

                flag++;
            }

        if (flag == 0){

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

                //loginChecker = true;

            }

        }

        if (flag == 0){

            System.out.println("User is not Registered.");
            System.out.println("Create Account First!");

            //loginChecker = false;

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

    public void addToCart(){

        int choice;
        SellerOperations Sobj = new SellerOperations();

        do {

            Sobj.ProductMenu();

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("");
                    break;


                case 2:
                    System.out.println("You Can See The List of Available Products Here:");
                    int rowNumber = 1;
                    ArrayList<String>temp = new ArrayList();
                    for (Clothes i : Sobj.theClothes){
                        temp.add( Integer.toString(rowNumber) + ".  " + i.toString());
                        System.out.println();
                        rowNumber++;
                    }
                    System.out.println("Enter The Row Number Of Your Wanted Product To Add To Your Cart");
                    String Option =input.nextLine();
                    for (String i : temp){
                        if (Option.equals(i.charAt(0))){
                            shoppingCart.add(i.toString());
                            break;
                        }
                    }
                    



                    break;


                case 3:
                    break;


                case 4:
                    break;


                case 5:
                    break;


                case 6:
                    break;


                case 7:
                    break;


                case 8:
                    break;


                case 9:
                    break;


                case 0:
                    break;

            }
        }

        while (choice!=10)

    }


}
