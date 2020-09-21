package com.company.kshebeko_class;

public class GardenFlower extends Flower {
    public int stemLength = 50;
    public String flowerBud;

    public GardenFlower(int stemLength) { //Конструктор
        this.stemLength = stemLength;
    }

    public GardenFlower(String flowerBud) { //Конструктор
        this.flowerBud = flowerBud;
    }

    public GardenFlower(String name, int price) { //Конструктор
        super(name,price);
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

}
