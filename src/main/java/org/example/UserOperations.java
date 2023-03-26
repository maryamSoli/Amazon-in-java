package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class UserOperations {

    ArrayList<User> theUsers = new ArrayList();
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
            System.out.println("Username or password is Incorrect. Try Aagain");
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
}
