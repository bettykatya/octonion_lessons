package com.octonion.lessons.stones;

public class SemipreciosStone extends Stone implements Comparable<SemipreciosStone> {
    private int price;
    private int transparency;
    private double weigtKr;

    public SemipreciosStone(double weight, String name, int price, int transparency) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SemipreciosStone that = (SemipreciosStone) o;
        return price == that.price;
    }

    @Override
    public int compareTo(SemipreciosStone o) {
        return Integer.valueOf(this.price).compareTo(Integer.valueOf(o.price));
    }

    @Override
    public String toString() {
        return " price=" + price;
    }
}
