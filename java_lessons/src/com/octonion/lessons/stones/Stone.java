package com.octonion.lessons.stones;

public abstract class Stone {
    private double weightGr;
    private String name;

    public Stone(double weight, String name) {
        this.weightGr = weight;
        this.name = name;
    }

    public Stone() {
    }

    public String getName() {
        return name;
    }

    public abstract double getWeigtKr();

    public abstract int getPrice();

    public abstract int getTransparency();
}
