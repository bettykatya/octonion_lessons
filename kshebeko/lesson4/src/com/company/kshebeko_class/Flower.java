package com.company.kshebeko_class;

public abstract class Flower {
    protected String name;
    protected int price;


    public Flower(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " Price  = " + price;
    }

    protected abstract String setName();

    public abstract int getPrice();

    public abstract int getStemLength();

    public abstract int getFreshFlower();
}
