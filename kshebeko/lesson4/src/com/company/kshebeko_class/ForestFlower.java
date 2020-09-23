package com.company.kshebeko_class;

public class ForestFlower extends Flower {
    public int stemLength;

    public ForestFlower(String name, int price, int stemLength){
        super(name, price);
        this.stemLength = stemLength;
        System.out.println("Forest flower : " + this.getName() + this.setName());
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
