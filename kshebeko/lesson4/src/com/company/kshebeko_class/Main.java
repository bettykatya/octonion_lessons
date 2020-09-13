package com.company.kshebeko_class;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Flower chamomile = new Flower("Chamomile");//Ромашка
        Flower hydrangea = new Flower("Hydrangea");//Гортензия
        Flower knapweed = new Flower("Knapweed");//Василек

        chamomile.flowerName();
        hydrangea.flowerName();
        knapweed.flowerName();

        System.out.println("Number of flowers: " + Flower.flowersInBouquet);
        System.out.println("Price flowers chamomile = " + chamomile.price);

        ArrayList flowerName = new ArrayList();//список цветов
        flowerName.add("Chamomile");//добавление в список
        flowerName.add("Hydrangea");
        flowerName.add("Knapweed");
        flowerName.add("Rose");
        flowerName.add("Narcissus");//Нарцисс
        System.out.println(flowerName.get(3));
        System.out.println(flowerName.get(flowerName.size() - 1));//выводит названия цветка по индексу
        System.out.println("Number of flowers : " + flowerName.size());//выводит кол-во цветков

        //Метод indexOf
        int index = flowerName.indexOf("Rose");
        System.out.println("Knapweed number: " + index);

        //Меняем местами Rose и Hydrangea
        flowerName.set(1, "Rose");
        flowerName.set(3, "Hydrangea");

        //Выводим все цветы что есть в списке
        String AllFlowers = " ";
        for (int i = 0; i < flowerName.size(); i++) {
            AllFlowers = AllFlowers + flowerName.get(i) + "; ";
        }
        System.out.println("All Flower : " + AllFlowers + " ");

        //Находим цветок в списке
        System.out.println("There is flower in list: " + flowerName.contains("Peonies"));

        knapweed.getName();//получаем доступ к name. get

        Flower name_1 = new Flower();//set имя
        name_1.setName("Lily");

        name_1.flowerName();

        //Наследдование
        Garden_Flower asters = new Garden_Flower();
        asters.setName("Asters");
        System.out.println(asters.getName());

        Garden_Flower hyacinth = new Garden_Flower("Hyacinth", "Fresh");



    }
}
