package com.octonion.lessons.stones;

public class SemipreciosStone extends Stone {
    private int price;
    private String transparency;
    private double weigtKr;

    public SemipreciosStone(double weight, String name, int price, String transparency) {
        super(weight, name);
        this.price = price;
        this.transparency = transparency;
        this.weigtKr = weight / 0.2;
    }

}
