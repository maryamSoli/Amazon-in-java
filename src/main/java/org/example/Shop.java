package org.example;

import java.util.ArrayList;

public class Shop {

    private double shopProfit;
    //ArrayList<String> theWholeOrders = new ArrayList();

    public void setShopProfit(double shopProfit) {
        this.shopProfit = shopProfit;
    }

    public double getShopProfit() {
        return shopProfit;
    }

    public void ContactMenu(){

        System.out.println("######################");
        System.out.println("MEANS TO CONTACT US :");
        System.out.println("######################");
        System.out.println("------------------------------------");
        System.out.println("WEB ADDRESS : www.sageOnlineShop.ir");
        System.out.println("------------------------------------");
        System.out.println("SUPPORT PHONE : 0127896543322");
        System.out.println("------------------------------------");

    }

    public void Title(){

        System.out.println("***********************************************************************");
        System.out.println("                     WELCOME TO SAGE ONLINE SHOP");
        System.out.println("***********************************************************************");
    }



    public void showWholeOrders(){

        for (String i : Panels.theWholeOrders){
            System.out.println(i);
        }
    }
}
