package org.example;

import java.util.Scanner;

public class Electronics extends Product {
    //Laptop Phone
    private String ScreenSize;
    private String RAM;
    private String color;
    private String OS;
    private String BatteryLife;
    private String producingYear;

    Scanner input = new Scanner(System.in);


    public void setScreenSize(String screenSize) {
        ScreenSize = screenSize;
    }

    public String getScreenSize() {
        return ScreenSize;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getRAM() {
        return RAM;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getOS() {
        return OS;
    }

    public void setBatteryLife(String batteryLife) {
        BatteryLife = batteryLife;
    }

    public String getBatteryLife() {
        return BatteryLife;
    }

    public void setProducingYear(String producingYear) {
        this.producingYear = producingYear;
    }

    public String getProducingYear() {
        return producingYear;
    }


    public void Electronics(){

        super.Product();


        System.out.println("Please Enter the Producing Year");
        setProducingYear(input.nextLine());

        System.out.println("Please Enter the RAM");
        setRAM(input.nextLine());

        System.out.println("Please Enter the Color");
        setColor(input.nextLine());

        System.out.println("Please Enter the OS");
        setOS(input.nextLine());

        System.out.println("Please Enter the Screen Size");
        setScreenSize(input.nextLine());

        System.out.println("Please Enter the Battery Life");
        setBatteryLife(input.nextLine());


    }
}


