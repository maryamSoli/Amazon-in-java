package org.example;

public class Laptop extends Electronics{

    private String weight;

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void Laptop(){

        super.Electronics();

        System.out.println("Please Enter the Weight");
        setWeight(input.nextLine());
    }
}
