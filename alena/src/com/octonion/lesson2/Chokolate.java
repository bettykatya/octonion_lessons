package com.octonion.lesson2;

import java.io.Serializable;

public class Chokolate extends NewYearCandy implements Serializable {
    public Chokolate() {
    }

    public Chokolate(String candyName, int weight, int price) {
        super(candyName, weight, price);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
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

    @Override
    public String toString() {
        return String.format("name - %s, id - %s, age - %d", candyName, weight, price);
    }
}
