package com.company.kshebeko_class;

import java.util.ArrayList;

public class Bouquet {
    public Accessories accessories;
    public String freshFlower;
    private int price;
    private String name;

    private ArrayList<Flower> flowerList = new ArrayList();

    public Bouquet(String freshFlower) {
        this.freshFlower = freshFlower;
    }

    public Bouquet() {
    }

    public void setFlowerList(ArrayList<Flower> list) {
        this.flowerList = list;
    }

    public ArrayList<Flower> flowers = new ArrayList<>();

    public ArrayList getFlowers() { return flowers;}

    @Override
    public String toString() {
        String str = " ";
        for (int i = 0; i < flowerList.size(); i++) {
            Flower flower = flowerList.get(i);
            str += flower.getName() + "; ";
        }
        return str;
    }

    public int countPriceBouquet() {
        price = 0;
        for (int i = 0; i < flowerList.size(); i++) {
            price += flowerList.get(i).getPrice();
        }
        return price;
    }

    public int getPrice() {
        countPriceBouquet();
        return price;
    }

    public void addFlowers(Flower flower) {
        flowers.add(flower);
        price += flower.getPrice();
    }

    public ArrayList<Flower> getFlowerStemLength(int left, int right) {
        ArrayList<Flower> flowersStem = new ArrayList<>();

        for (int i = 0; i < flowerList.size(); i++) {
            Flower flower = flowerList.get(i);
            int stemLength = flower.getStemLength();
            if (stemLength > left && stemLength < right) {
                flowersStem.add(flower);
                System.out.println(flower.getName());
            }
        }
        return flowersStem;
    }




}
