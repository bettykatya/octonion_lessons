package com.octonion.lesson2;

public class Ledency extends NewYearCandy {
// %procent
    public Ledency(String candyName, int weight, int price) {
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

    @Override
    public int calculateTotalSugar() {
        totalSugar = 5 * weight;
        return totalSugar;
    }


}
