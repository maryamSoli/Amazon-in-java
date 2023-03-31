package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Product {

    private String name;
    private double price;
    private int sellerQuantity;
    private int userQuantity;
    private String brand;
    private String gender;
    private String weight;
    private String category;
    private String material;
    private String style;
    private String size;
    private String season;
    private String purpose;
    private String authorName;
    private String publishYear;
    private String formula;
    private String scent;
    private String color;
    private String SellerCompany;


    private String ScreenSize;
    private String RAM;
    private String OS;
    private String BatteryLife;
    private String producingYear;
    private String CameraQuality;
    private String StorageCapacity;


    ArrayList<String> comments = new ArrayList();
    Scanner input = new Scanner(System.in);

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setSellerQuantity(int sellerQuantity) {
        this.sellerQuantity = sellerQuantity;
    }

    public int getSellerQuantity() {
        return sellerQuantity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

     public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }

    public String getScent() {
        return scent;
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

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setSellerCompany(String sellerCompany) {
        SellerCompany = sellerCompany;
    }

    public String getSellerCompany() {
        return SellerCompany;
    }


    public void setCameraQuality(String cameraQuality) {
        CameraQuality = cameraQuality;
    }

    public String getCameraQuality() {
        return CameraQuality;
    }

    public void setStorageCapacity(String storageCapacity) {
        StorageCapacity = storageCapacity;
    }

    public String getStorageCapacity() {
        return StorageCapacity;
    }



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


    public void setUserQuantity(int userQuantity) {
        this.userQuantity = userQuantity;
    }

    public int getUserQuantity() {
        return userQuantity;
    }


    public void Product(){

        System.out.println("HERE YOU CAN ADD YOUR PRODUCT\nIF YOUR PRODUCT DOESN'T INCLUDE ANY OF THE FOLLOWING ITEMS LEAVE IT EMPTY");

        System.out.println("Dear Seller Please Enter The Name Of Your Company ");
        setSellerCompany(input.nextLine());

        System.out.println("Please Enter the Category");
        System.out.println("The Categories:\n<<Electronics>> <<Clothes>> <<Bags>> <<Shoes>> <<Books>> <<Cosmetics>> <<Perfume>> <<Jewelery>> <<House Furniture>> <<Musical Instruments>>");
        setCategory(input.nextLine());

        System.out.println("Please Enter the Name of Your Product");
        setName(input.nextLine());

        System.out.println("Please Enter the Price");
        setPrice(input.nextDouble());

        System.out.println("Please Enter the Brand (For Books Enter Publisher)");
        setBrand(input.nextLine());

        System.out.println("Please Enter the Author Name (Only For Books)");
        setAuthorName(input.nextLine());

        System.out.println("Please Enter the Publishing Year (Only For Books)");
        setProducingYear(input.nextLine());

        System.out.println("Please Enter the Quantity");
        setSellerQuantity(input.nextInt());

        System.out.println("Please Enter the Color");
        setColor(input.nextLine());

        System.out.println("Please Enter the Gender");
        setGender(input.nextLine());

        System.out.println("Please Enter the Weight");
        setWeight(input.nextLine());

        System.out.println("Please Enter the Material");
        setMaterial(input.nextLine());

        System.out.println("Please Enter the Style");
        setStyle(input.nextLine());

        System.out.println("Please Enter the Size");
        setSize(input.nextLine());

        System.out.println("Please Enter the Season");
        setSeason(input.nextLine());

        System.out.println("Please Enter the Purpose");
        setPurpose(input.nextLine());

        System.out.println("Please Enter the Formula");
        setFormula(input.nextLine());

        System.out.println("Please Enter the Scent");
        setScent(input.nextLine());

    }


    public void Laptop(){

        System.out.println("Dear Seller Please Enter The Name Of Your Company ");
        setSellerCompany(input.nextLine());

        System.out.println("Please Enter the Name of Your Product");
        setName(input.nextLine());

        System.out.println("Please Enter the Price");
        setPrice(input.nextDouble());

        System.out.println("Please Enter the Brand");
        setBrand(input.nextLine());

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

        System.out.println("Please Enter the Weight");
        setWeight(input.nextLine());
    }

    public void SmartPhone(){

        System.out.println("Dear Seller Please Enter The Name Of Your Company ");
        setSellerCompany(input.nextLine());

        System.out.println("Please Enter the Name of Your Product");
        setName(input.nextLine());

        System.out.println("Please Enter the Price");
        setPrice(input.nextDouble());

        System.out.println("Please Enter the Brand");
        setBrand(input.nextLine());

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

        System.out.println("Please Enter the Camera Quality");
        setCameraQuality(input.nextLine());

        System.out.println("Please Enter the Storage Capacity");
        setStorageCapacity(input.nextLine());
    }



    public String toStringProduct() {
        return  "CATEGORY:" + category + "  " +
                "NAME:" + name +"  " +
                "BRAND/PUBLISHER:" + brand + "  " +
                "AUTHOR NAME (FOR BOOKS):" + authorName + "  " +
                "PUBLISHING YEAR (FOR BOOKS):" + publishYear + "  " +
                "PRICE:" + price + "  " +
                "GENDER:" + gender + "  " +
                "MATERIAL:" + material + "  " +
                "STYLE:" + style + "  " +
                "SIZE:" + size + "  " +
                "WEIGHT:" + weight + "  " +
                "COLOR:" + color + "  " +
                "SEASON:" + season + "  " +
                "PURPOSE:" + purpose + "  " +
                "FORMULA:" + formula + "  " +
                "SCENT:" + scent + "  " +
                "SELLER:" + SellerCompany + "  " +
                "AVAILABLE QUANTITY" + sellerQuantity + "  " +
                "WANTED QUANTITY" + userQuantity + "  " +
                "COMMENTS" + comments + "\n";

    }

    public String toStringLaptop(){

        return  "CATEGORY:" + category + "  " +
                "NAME:" + name +"  " +
                "BRAND:" + brand + "  " +
                "PRICE:" + price + "  " +
                "RAM:" + RAM + "  " +
                "COLOR:" + color + "  " +
                "OS:" + OS + "  " +
                "BATTERY LIFE:" + BatteryLife + "  " +
                "PRODUCING YEAR:" + producingYear + "  " +
                "WEIGHT:" +  weight + "  " +
                "AVAILABLE QUANTITY" + sellerQuantity + "  " +
                "WANTED QUANTITY" + userQuantity + "  " +
                "COMMENTS" + comments + "\n";
    }

    public String toStringPhone(){

        return  "CATEGORY:" + category + "  " +
                "NAME:" + name +"  " +
                "BRAND:" + brand + "  " +
                "PRICE:" + price + "  " +
                "RAM:" + RAM + "  " +
                "COLOR:" + color + "  " +
                "OS:" + OS + "  " +
                "BATTERY LIFE:" + BatteryLife + "  " +
                "PRODUCING YEAR:" + producingYear + "  " +
                "CAMERA QUALITY:" + CameraQuality + "  " +
                "STORAGE CAPACITY:" + StorageCapacity + "  " +
                "AVAILABLE QUANTITY" + sellerQuantity + "  " +
                "WANTED QUANTITY" + userQuantity + "  " +
                "COMMENTS" + comments + "\n";
    }


    public void addQuantityByOne(){

        this.sellerQuantity++;
    }
}
