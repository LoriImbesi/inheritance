package com.company;

public class Test {

    public static void main(String[] args) {

        System.out.println();
        Vegetables vegetables = new Vegetables();
        vegetables.setPlantName("Tomato");
        vegetables.plantName();
        vegetables.setOrderNumber(243);
        vegetables.orderNum();
        vegetables.water();
        vegetables.setLight("Full sun");
        vegetables.light();
        vegetables.feed();
        System.out.println();
        Herbs herbs = new Herbs();
        herbs.setPlantName("Basil");
        herbs.plantName();
        herbs.setOrderNumber(302);
        herbs.orderNum();
        herbs.setVariety("Italian");
        herbs.variety();
        herbs.water();
        herbs.light();


    }
}
