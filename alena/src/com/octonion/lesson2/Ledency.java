package com.octonion.lesson2;

public class Ledency extends NewYearCandy {
    private int price;
    private int weight;


    public Ledency(String candyName, int weight, int price) {
//        super(candyName);
        this.price = price;
        this.weight = weight;
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
