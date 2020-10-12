package com.company.kshebeko_class;

import java.io.Serializable;

public abstract class Flower implements Comparable<Flower>, Serializable {
    protected String name;
    protected int price;


    protected Flower(String name, int price) {
        this.name = name;
        this.price = price;
    }

   /* @Override
    public String toString() {
        return name + " flower price = " + price;
    }*/

    public String getName() {
        return name;
    }

    public abstract String setName();

    public int getPrice() {
        return price;
    };

    protected abstract int getStemLength();

    protected abstract int getFreshFlower();

    @Override
    public int compareTo(Flower o) {
        return Integer.valueOf(this.price).compareTo(Integer.valueOf(o.price));
    }
}
