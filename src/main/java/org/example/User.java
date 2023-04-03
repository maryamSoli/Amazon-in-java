package org.example;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
import java.util.Properties;
//import javax.mail; sending a welcome email


public class User extends Admin {

    private String phoneNumber;
    private String address;
    private double wallet;
    private UUID uuid;
    ArrayList<User> theUsers = new ArrayList();


    Scanner input = new Scanner(System.in);

    public void setAddress(String address) {this.address = address;}

    public String getAddress() {return address;}

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public double getWallet() {
        return wallet;
    }

    public void setPhoneNumber(String phoneNumber) {

        String numberPattern = "^\\d{7,15}$"; // the min length for a phone number in the world is 7 and the max is 15

        boolean flag ;

        while (true){

            flag = phoneNumber.matches(numberPattern);

            if (flag == false){

                System.out.println("This Phone Number is not Valid. Try Again");
                phoneNumber = input.nextLine();

            }

            else {

                this.phoneNumber = phoneNumber;

                break;
            }

        }

    }

    public String getPhoneNumber() {return phoneNumber;}

    public void User(){

        this.uuid = UUID.randomUUID();

        System.out.println("Enter a Valid Phone Number\n(A valid Phone Number Consists of 7 to 15 Digits)");
        setPhoneNumber(input.nextLine());

        System.out.println("Enter Your Address");
        setAddress(input.nextLine());

        super.Admin();

    }

    public String toString() {
        super.toString();
        return  "PHONE NUMBER:" + phoneNumber +"  " +
                "ADDRESS:" + address + "  " +
                "E-MAIL:" + super.getEmail() + "  " +
                "USERNAME:" + super.getUserName() +"  " +
                "PASSWORD:" + super.getPassWord() + "\n" ;
    }




}

