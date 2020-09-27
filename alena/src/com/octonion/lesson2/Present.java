package com.octonion.lesson2;

import java.util.ArrayList;

public class Present {
    public int weight;
    public int price;

    private ArrayList<NewYearCandy> candies = new ArrayList();

    public int getWeight() {
        return weight;
    }

    public int getPrice(){
        return price;
    }

    public void addCandy(NewYearCandy candy) {
        candies.add(candy);
        weight += candy.getWeight();
        price += candy.getPrice();
    }
}
