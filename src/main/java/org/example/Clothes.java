package org.example;

import java.util.Scanner;

public class Clothes extends Product {

    private String material;
    private String style;
    private String size;
    private String color;
    private String season;
    private String gender;

    Scanner input = new Scanner(System.in);

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void Clothes(){

        System.out.println("Please Enter the Material");
        setMaterial(input.nextLine());

        System.out.println("Please Enter the Style");
        setStyle(input.nextLine());

        System.out.println("Please Enter the Size");
        setSize(input.nextLine());

        System.out.println("Please Enter the Color");
        setColor(input.nextLine());

        System.out.println("Please Enter the Season");
        setSeason(input.nextLine());

        System.out.println("Please Enter the Gender");
        setGender(input.nextLine());
    }
}
