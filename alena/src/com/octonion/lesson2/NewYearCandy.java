package com.octonion.lesson2;


public abstract class NewYearCandy {
    public String candyName;
    protected int weight;
    protected int price;
    protected int totalSugar;

    public NewYearCandy() {
    }

    public NewYearCandy(String candyName, int weight, int price) {
        this.candyName = candyName;
        this.weight = weight;
        this.price = price;
        System.out.println(getName() + " -  цена: " + price);
    }

    public abstract int calculateTotalSugar();

    public abstract int getWeight();

    public abstract int getPrice();

    public String getName() {
        return candyName;
    }

}
