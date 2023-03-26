package org.example;

public class Books extends Product{

    private String authorName;
    private String publishYear;

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void Books(){

        System.out.println("Please Enter the Name of Book");
        setName(input.nextLine());

        System.out.println("Please Enter the Price");
        setPrice(input.nextLine());

        System.out.println("Please Enter the Publisher");
        setBrand(input.nextLine());

        System.out.println("Please Enter the Quantity");
        setQuantity(input.nextLine());

        System.out.println("Please Enter the Author Name");
        setAuthorName(input.nextLine());

        System.out.println("Please Enter the Publishing Year");
        setPublishYear(input.nextLine());
    }

}
