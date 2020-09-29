package com.company.kshebeko_class;

import java.util.ArrayList;

public class Main {

    //1. Определить иерархию цветов +
    //2. Создать объекты цветы +
    //3. Создать букет цветов с аксессуарами +
    //4. Определить стоимость букета +
    //5. Сортировка по уровню свежести +
    //6. Найти цветов по диапазону стебля +

    public static void main(String[] args) {
        ArrayList<Flower> flowerList = new ArrayList();
        Flower chamomile = new ForestFlower("Chamomile", 2,50, 10);//Ромашка
        Flower hydrangea = new GardenFlower("Hydrangea", 7, 45, 4);//Гортензия
        Flower knapweed = new ForestFlower("Knapweed", 9, 20, 2);//Василек
        Flower peony = new GardenFlower("Peony", 7,60, 9);
        Flower rose = new GardenFlower("Rose", 8,100, 7);
        Flower narcissus = new GardenFlower("Narcissus",3,29, 8);
        Flower lily = new GardenFlower("Lily", 10,35, 9);

        flowerList.add(chamomile);
        flowerList.add(hydrangea);
        flowerList.add(knapweed);
        flowerList.add(peony);
        flowerList.add(rose);
        flowerList.add(narcissus);
        flowerList.add(lily);

        System.out.println(chamomile);
        System.out.println(hydrangea);
        System.out.println(knapweed);
        System.out.println(peony);
        System.out.println(rose);
        System.out.println(narcissus);
        System.out.println(lily);

        Bouquet first = new Bouquet();
        first.setFlowerList(flowerList);
        first.accessories = Accessories.PAPER;
        first.accessories = Accessories.BEADS;
        first.addFlowers(rose);
        first.addFlowers(rose);



        Bouquet second = new Bouquet();
        second.setFlowerList(flowerList);
        second.accessories = Accessories.RIBBON;

        System.out.println("Bouquet First frost: " + first + Accessories.PAPER + ", " + Accessories.BEADS);
        System.out.println("Bouquet Autumn morning: " + second + Accessories.RIBBON);


        int index = flowerList.indexOf(peony);
        System.out.println("Peony number: " + index);

        System.out.println("Price Bouquet: First frost = " + first.getPrice());
        System.out.println("Price Bouquet: Autumn morning = " + second.getPrice());

        System.out.println(first.getFlowers().size());
        System.out.println(first.getFlowerStemLength(35,70));

        first.printFlower();
        first.sortFlowerFreshFlower();
        first.printFlower();









    }
}
