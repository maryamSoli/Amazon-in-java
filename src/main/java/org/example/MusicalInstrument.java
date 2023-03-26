package org.example;

public class MusicalInstrument extends Product {

    private String weight;
    private String type;

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void MusicalInstrument(){

        super.Product();

        System.out.println("Please Enter the Weight");
        setWeight(input.nextLine());

        System.out.println("Please Enter the Type (e.g. percussion, string, wind)");
        setType(input.nextLine());
    }
}
