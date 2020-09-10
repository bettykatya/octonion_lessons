package com.company.kshebeko_class;

public class Flower {
    public String name;
    public String accessories;
    public final int price = 30;
    public static int flowers_in_bouquet = 0;

    public void flowerName(){
        System.out.println("Flower name: " + this.name + " accessories: " + this.accessories);
    }

    public Flower(String name, String accessories){
        this.name = name;
        this.accessories = accessories;
        flowers_in_bouquet++;
    }

    public Flower(){
        flowers_in_bouquet++;
    }

    public Flower(int price){
        flowers_in_bouquet++;
    }






}
