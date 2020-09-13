package com.company.kshebeko_class;

public class Garden_Flower extends Flower {

    public String getGarden_FlowerName() {
        return super.getName();
    }

    public Garden_Flower(String name, String freshFlower) {
        super(name);
        this.freshFlower = freshFlower;
        System.out.println("Name Flower : " + this.getName() +  " Freshness of the flower: " + this.freshFlower);
    }

    public Garden_Flower() {

    }

}
