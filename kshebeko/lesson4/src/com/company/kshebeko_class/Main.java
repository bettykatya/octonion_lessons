package com.company.kshebeko_class;

import java.util.ArrayList;

public class Main {

    //1. Определить иерархию цветов +
    //2. Создать объекты цветы +
    //3. Создать букет цветов с аксессуарами +
    //4. Определить стоимость букета +
    //5. Сортировка по уровню свежести
    //6. Найти цветов по диапазону стебля

    public static void main(String[] args) {
        ArrayList<Flower> flowerList = new ArrayList();
        Flower chamomile = new ForestFlower("Chamomile", 2);//Ромашка
        Flower hydrangea = new GardenFlower("Hydrangea", 7);//Гортензия
        Flower knapweed = new ForestFlower("Knapweed", 9);//Василек
        Flower peony = new GardenFlower("Peony", 7);
        Flower rose = new GardenFlower("Rose", 8);
        Flower narcissus = new GardenFlower("Narcissus",3);
        Flower lily = new GardenFlower("Lily", 10);

        flowerList.add(chamomile);//Добавление элементов
        flowerList.add(hydrangea);
        flowerList.add(knapweed);
        flowerList.add(peony);
        flowerList.add(rose);
        flowerList.add(narcissus);
        flowerList.add(lily);

        System.out.println(chamomile);//Вывод на консоль
        System.out.println(hydrangea);
        System.out.println(knapweed);
        System.out.println(peony);
        System.out.println(rose);
        System.out.println(narcissus);
        System.out.println(lily);

        Bouquet AutumnMorning = new Bouquet();
        AutumnMorning.setFlowerList(flowerList);
        AutumnMorning.accessories = Accessories.PAPER;
        AutumnMorning.accessories = Accessories.BEADS;

        Bouquet FirstFrost = new Bouquet();
        FirstFrost.setFlowerList(flowerList);
        FirstFrost.accessories = Accessories.RIBBON;

        System.out.println("Bouquet Autumn morning: " + AutumnMorning + Accessories.RIBBON);
        System.out.println("Bouquet First frost: " + FirstFrost + Accessories.PAPER + ", " + Accessories.BEADS);

        int index = flowerList.indexOf(peony);
        System.out.println("Peony number: " + index);

        System.out.println("Price Bouquet: Autumn morning = " + AutumnMorning.CountPriceBouquet());




    }
}
