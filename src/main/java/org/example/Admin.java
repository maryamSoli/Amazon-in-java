package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;


public class Admin {

    private String userName;
    private String passWord;
    private String email;


    Scanner input = new Scanner(System.in);

    public void setUserName() { // creating random usernames and passwords using the concept of uuid
        UUID uuid = UUID.randomUUID();

        this.userName = uuid.toString();
    }

    public String getUserName() {
        return userName;
    }

    public void setPassWord() {

        UUID uuid = UUID.randomUUID();
        this.passWord = uuid.toString();
    }

    public String getPassWord() {
        return passWord;
    }

    public void setEmail(String email) { //asking for an e-mail address with a specific pattern using regex and checking uts validity inside the setter method

        String emailPattern = "^[a-zA-Z0-9._%+-]+@gmail\\.com$";

        boolean flag ;

        while (true) {

            flag = email.matches(emailPattern);

            if (flag == false) {

                System.out.println("This Email is not Valid. Try Again");

                email = input.nextLine();

            } else {

                this.email = email;

                break;
            }

        }

    }

    public String getEmail() {return email;}

    public void Admin(){


        System.out.println("Enter a Valid E-mail Address\nA valid E-mail Address Pattern is Like:\na to z upper or lower case/numbers/underline(_)/dot(.)@gmail.com");
        setEmail(input.nextLine());


        System.out.println(" Username is : ");
        setUserName();
        System.out.println(getUserName());

        System.out.println(" Password is :");
        setPassWord();
        System.out.println(getPassWord());
    }


    @Override
    public String toString() {
        return  "USERNAME:" + userName +"  " +
                "PASSWORD:" + passWord + "  " +
                "E-Mail:" + email + "\n" ;
    }

    public void defaultAdmin(){ //default Admin

        this.passWord = "123456";
        this.userName = "defaultAdmin";

    }



}
