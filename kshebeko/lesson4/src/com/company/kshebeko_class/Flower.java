package com.company.kshebeko_class;

public abstract class Flower {
    protected String name;
    protected int price;


    public Flower(String name, int price) { //Конструктор
        this.name = name;
        this.price = price;
    }

    public Flower() { //Конструктор
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Flower name: " + name + " Price  = " + price;
    }

    protected abstract String setName();

    public abstract int getPrice();

    public abstract int getStemLength();
}
