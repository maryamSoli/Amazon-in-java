package org.example;

public class Perfume extends Product{

    private String size;
    private String bottleShape;
    private String formula;
    private String longevity;
    private String occasion;
    private String scentFamily;

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getFormula() {
        return formula;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setBottleShape(String bottleShape) {
        this.bottleShape = bottleShape;
    }

    public String getBottleShape() {
        return bottleShape;
    }

    public void setLongevity(String longevity) {
        this.longevity = longevity;
    }

    public String getLongevity() {
        return longevity;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setScentFamily(String scentFamily) {
        this.scentFamily = scentFamily;
    }

    public String getScentFamily() {
        return scentFamily;
    }

    public void Perfume(){

        super.Product();

        System.out.println("Please Enter the Bottle Shape");
        setBottleShape(input.nextLine());

        System.out.println("Please Enter the Formula");
        setFormula(input.nextLine());

        System.out.println("Please Enter the Size");
        setSize(input.nextLine());

        System.out.println("Please Enter the Longevity");
        setLongevity(input.nextLine());

        System.out.println("Please Enter the Occasion");
        setOccasion(input.nextLine());

        System.out.println("Please Enter the Scent Family");
        setOccasion(input.nextLine());
    }
}
