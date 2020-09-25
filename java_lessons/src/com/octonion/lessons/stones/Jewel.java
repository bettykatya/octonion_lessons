package com.octonion.lessons.stones;

public class Jewel extends Stone {
    private int price;
    private int transparency;
    private double weigtKr;

    public Jewel(double weight, String name, int price, int transparency) {
        super(weight, name);
        this.price = price;
        this.transparency = transparency;
        this.weigtKr = weight / 0.2;
    }

    @Override
    public double getWeigtKr() {
        return weigtKr;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getTransparency() {
        return transparency;
    }
}
