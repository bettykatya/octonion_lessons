package com.company.kshebeko_class;

import java.util.ArrayList;

public class ForestFlower extends Flower {
    private int stemLength;
    private int freshFlower;

    public ForestFlower(String name, int price, int stemLength, int freshFlower){
        super(name, price);
        this.stemLength = stemLength;
        this.freshFlower = freshFlower;
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

    @Override
    public int getFreshFlower() {
        return freshFlower;
    }

}
