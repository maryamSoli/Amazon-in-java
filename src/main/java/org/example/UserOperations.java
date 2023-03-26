package org.example;

import java.util.ArrayList;

public class UserOperations {

    ArrayList<User> theUsers = new ArrayList();


    public void CreateAccount(){

        User user = new User();

        user.User();

        theUsers.add(user);

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
}
