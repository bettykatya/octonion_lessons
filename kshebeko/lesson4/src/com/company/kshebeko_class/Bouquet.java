package com.company.kshebeko_class;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Bouquet implements Serializable {
    public Accessories accessories;
    private int price;

    //@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")

    public ArrayList<Flower> flowerList = new ArrayList();

    public Bouquet() {
    }

    public void setFlowerList(ArrayList<Flower> list) {
        this.flowerList = list;
        countPriceBouquet();
    }

    public ArrayList getFlowerList() { return flowerList;}

    @Override
    public String toString() {
        String str = " ";
        for (int i = 0; i < flowerList.size(); i++) {
            Flower flower = flowerList.get(i);
            str += flower.getName() + "; ";
        }
        return str + " with " + Accessories.BEADS + " " + Accessories.RIBBON;
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

    public void addFlowerList(Flower flower) throws EmptyFlowerNameException {
        if (flower.getName().isEmpty()) { // проверка на пустое имя. если имя пустое выбросит исключения если нет, то добавит в букет
            throw new EmptyFlowerNameException();
        }
        flowerList.add(flower);
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

    public void sortFlowers() {

        List<Flower> sortedList = new ArrayList();

        int size = flowerList.size();
        //while (flowerList.size() != 0) {
        for (int i = 0; i < size; i++) { // 10 4 2 9 7 8 9
            Flower flower = flowerList.get(0);

            for (int j = 1; j < flowerList.size(); j++) {
                Flower flowerJ = flowerList.get(j);
                if (flowerJ.getFreshFlower() < flower.getFreshFlower()) {
                    flower = flowerJ;
                }
            }
            sortedList.add(flower);
            flowerList.remove(flower);

        }
        flowerList = (ArrayList<Flower>) sortedList;
    }

    public void printFlowers() {
        System.out.println("Flowers in bouquet: ");
        for (int i = 0; i < flowerList.size(); i++) {
            System.out.println(" " + flowerList.get(i).getName());
        }
    }

    public void getFirst() {}

}
