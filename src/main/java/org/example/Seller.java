package org.example;

import java.util.Scanner;
import java.util.UUID;

public class Seller {

    private String passWord;
    private String companyName;
    private double wallet;

    Scanner input = new Scanner(System.in);

    public void setPassWord() {
        UUID uuid = UUID.randomUUID();
        this.passWord = uuid.toString();
    }

    public String getPassWord() {
        return passWord;
    }


    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
    public double getWallet() {
        return wallet;
    }

    public void Seller(){

        System.out.println("Please Enter Your Company Name");
        setCompanyName(input.nextLine());

        System.out.println("Your Password is:");
        setPassWord();
        System.out.println(getPassWord());
    }

  //  @Override
   /* public String toString() {
        return  "COMPANY NAME:" + companyName +"  " +
                "PASSWORD:" + passWord + "\n" +
                "WALLET:" + wallet + "\n" ;
    }*/
}
