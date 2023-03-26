package org.example;

public class Furniture extends Product{

    private String material;
    private String height;
    private String width;
    private String depth;
    private String color;
    private String purpose;
    private String weight;

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getDepth() {
        return depth;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getWidth() {
        return width;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void Furniture(){

        super.Product();

        System.out.println("Please Enter the Material");
        setMaterial(input.nextLine());

        System.out.println("Please Enter the Height");
        setHeight(input.nextLine());

        System.out.println("Please Enter the Width");
        setWidth(input.nextLine());

        System.out.println("Please Enter the Depth");
        setDepth(input.nextLine());

        System.out.println("Please Enter the Color");
        setColor(input.nextLine());

        System.out.println("Please Enter the Weight");
        setWeight(input.nextLine());
    }
}
