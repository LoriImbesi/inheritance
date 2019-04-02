package com.company;
import java.lang.String;


public class Herbs extends Plants {

    public String variety;

    Herbs()

    {
        super();
        System.out.println("New herb!");
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public void light() {
        System.out.println("Light requirements: ");
    }

    public void feed() {
        System.out.println("Feed herb plants...");
    }

    public void water() {
        System.out.println("Water requirements for the plant...");
    }
    public void plantName()
    {
        System.out.println("Plant name: " +plantName);
    }
    public void orderNum()
    {
        System.out.println("Order number: " +orderNumber);
    }
    public void variety()
    {
        System.out.println("Variety : " +variety);
    }

}
