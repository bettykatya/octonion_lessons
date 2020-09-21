package com.octonion.lessons.stones;

public class Jewel extends Stone {
    private int price;
    private String transparency;
    private double weigtKr;

    public Jewel(double weight, String name, int price, String transparency) {
        super(weight, name);
        this.price = price;
        this.transparency = transparency;
        this.weigtKr = weight / 0.2;
    }

    public double getWeigtKr() {
        return weigtKr;
    }
}
