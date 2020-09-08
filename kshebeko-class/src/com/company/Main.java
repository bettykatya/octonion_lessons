package com.company;

public class Main {

    public static void main(String[] args) {
        Flower chamomile = new Flower("chamomile", "ribbon and decoration");
        Flower hydrangea = new Flower("hydrangea", "ribbon");
        Flower knapweed = new Flower("knapweed", "decoration");


        chamomile.flowerName();
        hydrangea.flowerName();
        knapweed.flowerName();

        System.out.println("Number of flowers: " + Flower.flowers_in_bouquet);
        System.out.println("Price flowers chamomile = " + chamomile.price);

    }
}
