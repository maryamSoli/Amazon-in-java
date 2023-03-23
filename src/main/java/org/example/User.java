package org.example;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;


public class User extends Admin {

    private String phoneNumber;
    private String address;
    private UUID uuid;
    ArrayList<User> theUsers = new ArrayList();


    Scanner input = new Scanner(System.in);

    public void setAddress(String address) {this.address = address;}

    public String getAddress() {return address;}

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

       /* System.out.println("Enter a Valid E-mail Address\n(A valid E-mail Address Pattern is Like:\n(a to z upper or lower case/numbers/underline(_)/dot(.)@gmail.com");
        setEmail(input.nextLine());

        System.out.println("Your Username is : ");
        setUserName(uuid.toString());

        System.out.println("Your Password is :");
        setPassWord(uuid.toString());*/

        super.Admin();

    }


}

