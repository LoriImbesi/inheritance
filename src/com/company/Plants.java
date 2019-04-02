package com.company;
import java.lang.String;

//Post a java program to Github that utilizes the concepts of inheritance,
//encapsulation, and polymorphism.

//Examples of encapsulation are the classes: Plants, Vegetables and Herbs.

//Inheritance is implemented via the "extends" keyword in Vegetables.java and
//Herbs.java.

//Polymorphism is part of the program because the details about the
//plants (water, light, food) can be changed in the subclasses.

public class Plants {

    public int orderNumber;
    public String plantName;

    public int getorderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getplantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public Plants()
    {
        System.out.println("A new plant has been listed.");
    }

    public void light()
    {
        System.out.println("Light requirements: ");
    }

    public void water()
    {
        System.out.println("Water requirements: ");
    }

}

