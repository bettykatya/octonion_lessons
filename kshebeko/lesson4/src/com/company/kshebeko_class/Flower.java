package com.company.kshebeko_class;

public class Flower {
    private String name;
    public String accessories;
    public String freshFlower;
    public final int price = 30;
    public static int flowersInBouquet = 0;

    public void flowerName(){
        System.out.println("Flower name: " + this.name);
    }

    public Flower(String name){
        this.name = name;

        flowersInBouquet++;
    }

    public Flower(){

        flowersInBouquet++;
    }

    public Flower(int price){

        flowersInBouquet++;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

}
