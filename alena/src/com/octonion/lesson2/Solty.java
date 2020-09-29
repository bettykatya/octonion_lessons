package com.octonion.lesson2;

import java.util.ArrayList;

public class Solty extends NewYearCandy{

    public Solty(String candyName, int weight, int price){
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
