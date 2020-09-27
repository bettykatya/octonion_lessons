package com.octonion.lesson2;

public class Chokolate extends NewYearCandy {

    private int price;
    private int weight;


    public Chokolate(String candyName, int weight, int price) {
        super(candyName, weight, price);
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
