package com.company.kshebeko_class;

import java.util.ArrayList;

public class Bouquet {
    public Accessories accessories;
    public String freshFlower;
    public int price;
    public String name;

    public Bouquet (String name, int price){ //Конструктор
        this.name = name;
        this.price = price;
        System.out.println(this.name + this.price);
    }

    public Bouquet(String freshFlower) { //Конструктор
        this.freshFlower = freshFlower;
    }

    public ArrayList<Flower> flowerList = new ArrayList();

    public void setFlowerList(ArrayList<Flower> list) {
        this.flowerList = list;
    }

    public Bouquet() {
    }

    @Override
    public String toString() {
        String str = " ";
        for (int i = 0; i < flowerList.size(); i++) {
            Flower flower = flowerList.get(i);
            str += flower.getName() + "; ";
        }
        return str;
    }

    public int CountPriceBouquet() {
        int sum = 0;
        for (int i = 0; i < flowerList.size(); i++) {
            sum += flowerList.get(i).getPrice();
        }
        return sum;
    }
}
