package com.octonion.lesson2;

import java.io.Serializable;

// ввести шоколад %
//и натуральность в леденцах
//подарок в котором все леденцы натуральные или %шоколада > 80%

public class Chokolate extends NewYearCandy implements Serializable, Comparable<Chokolate> {
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
        return String.format("name - %s, weight - %s, price - %s", candyName, weight, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chokolate that = (Chokolate) o;
        return price == that.price;
    }

    @Override
    public int compareTo(Chokolate o) {
        return Integer.valueOf(this.price).compareTo(Integer.valueOf(o.price));
    }
}
