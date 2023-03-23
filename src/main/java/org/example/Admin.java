package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;


public class Admin {

    private String userName;
    private String passWord;
    private String email;
    private UUID uuid;

    Scanner input = new Scanner(System.in);

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setEmail(String email) {

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

       this.uuid = UUID.randomUUID();

        System.out.println("Enter a Valid E-mail Address\n(A valid E-mail Address Pattern is Like:\n(a to z upper or lower case/numbers/underline(_)/dot(.)@gmail.com");
        setEmail(input.nextLine());

        String u = uuid.toString();
        setUserName(u);
        System.out.println("Your Username is : ");
        getUserName();
        System.out.println(u);

        System.out.println("Your Password is :");
        setPassWord(uuid.toString());
        getPassWord();
    }

}
