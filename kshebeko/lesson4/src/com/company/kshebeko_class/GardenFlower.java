package com.company.kshebeko_class;

public class GardenFlower extends Flower {
    public int stemLength ;
    public String flowerBud;

    public GardenFlower(String flowerBud) {
        this.flowerBud = flowerBud;
    }

    public GardenFlower(String name, int price, int stemLength) {
        super(name,price);
        this.stemLength = stemLength;
        System.out.println("Garden flower : " + this.getName());
    }

    @Override
    protected String setName() {
        return null;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getStemLength() {
        return stemLength;
    }

}
