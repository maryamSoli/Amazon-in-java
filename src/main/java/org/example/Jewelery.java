package org.example;

public class Jewelery extends Product{

    private String materialComposition;
    private String gender;
    private String weight;

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setMaterialComposition(String materialComposition) {
        this.materialComposition = materialComposition;
    }

    public String getMaterialComposition() {
        return materialComposition;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void Jewelery(){

        super.Product();

        System.out.println("Please Enter the Material Composition (e.g. gold, silver, diamond, gemstones)");
        setMaterialComposition(input.nextLine());

        System.out.println("Please Enter the Gender");
        setGender(input.nextLine());

        System.out.println("Please Enter the Weight");
        setWeight(input.nextLine());
    }
}
