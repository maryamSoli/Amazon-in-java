package org.example;

public class Bags extends Product{

    private String color;
    private String size;
    private String material;
    private String style;
    private String purpose;

    public void setStyle(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }

    public void Bags(){

        super.Product();

        System.out.println("Please Enter the Material");
        setMaterial(input.nextLine());

        System.out.println("Please Enter the Style");
        setStyle(input.nextLine());

        System.out.println("Please Enter the Size");
        setSize(input.nextLine());

        System.out.println("Please Enter the Color");
        setColor(input.nextLine());

        System.out.println("Please Enter the  Purpose");
        setColor(input.nextLine());

    }
}
