package com.company;
import java.lang.String;


public class Vegetables extends Plants {

    public String light;

    Vegetables() {

        super();

        System.out.println("New vegetable plant!");
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }
    public void light() {

        System.out.println("Light requirements: " + light);
    }

    public void feed() {
        System.out.println("Feed vegetable plants...");
    }

    public void water() {
        System.out.println("Water requirements for the plant...");
    }

    public void plantName() {
        System.out.println("Plant name: " + plantName);
    }

    public void orderNum() {
        System.out.println("Order number: " + orderNumber);
    }
}
