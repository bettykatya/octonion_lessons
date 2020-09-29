package com.company.kshebeko_class;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    public Accessories accessories;
    private int price;

    public Bouquet() {
    }

    private ArrayList<Flower> flowerList = new ArrayList();

    public void setFlowerList(ArrayList<Flower> list) {
        this.flowerList = list;
        countPriceBouquet();
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

    public void sortFlowerFreshFlower() {

        List<Flower> sortedList = new ArrayList();

        int size = flowerList.size();
        //while (flowerList.size() != 0) {
        for (int i = 0; i < size; i++) { // 10 4 2 9 7 8 9
            Flower flowerMin = flowerList.get(0);

            for (int j = 1; j < flowerList.size(); j++) {
                Flower flower = flowerList.get(j);
                if (flower.getFreshFlower() < flowerMin.getFreshFlower()) {
                    flowerMin = flower;
                }
            }
            sortedList.add(flowerMin);
            flowerList.remove(flowerMin);

        }
        flowerList = (ArrayList<Flower>) sortedList;
    }

    public void printFlower() {
        System.out.println("Flower in bouquet : ");
        for (int i = 0; i < flowerList.size(); i++) {
            System.out.println(" " + flowerList.get(i).getName());
        }
    }
}
