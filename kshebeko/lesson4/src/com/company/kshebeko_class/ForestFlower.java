package com.company.kshebeko_class;

public class ForestFlower extends Flower {
    public int stemLength = 10;
    public String flowerBud;


    public ForestFlower(int stemLength) {
        this.stemLength = stemLength;
    }

    public ForestFlower(String flowerBud) {
        this.flowerBud = flowerBud;
    }

    public ForestFlower(String name, int price){
        super(name, price);
        System.out.println("Forest flower : " + this.getName() + this.setName());
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    public void setFlowerBud(String flowerBud) {
        this.flowerBud = flowerBud;
    }

    public int getStemLength() {
        return stemLength;
    }

    public String getFlowerBud() {
        return flowerBud;
    }

    @Override
    protected String setName() {
        return null;
    }

    @Override
    public int getPrice() {
        return price;
    }

}
