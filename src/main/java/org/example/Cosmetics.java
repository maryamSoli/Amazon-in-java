package org.example;

public class Cosmetics extends Product{

    private String color;
    private String size;
    private String formula;
    private String warnings;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getFormula() {
        return formula;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    public String getWarnings() {
        return warnings;
    }

    public void Cosmetics(){

        super.Product();

        System.out.println("Please Enter the Color");
        setColor(input.nextLine());

        System.out.println("Please Enter the Size");
        setSize(input.nextLine());

        System.out.println("Please Enter the Formula");
        setFormula(input.nextLine());

        System.out.println("Please Enter any Caution or Warnings That are Needed");
        setWarnings(input.nextLine());
    }
}
