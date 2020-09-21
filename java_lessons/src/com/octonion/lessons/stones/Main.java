package com.octonion.lessons.stones;

public class Main {

    /*
    6. Камни. Определить иерархию драгоценных и полудрагоценных камней.
    Отобрать камни для ожерелья. Подсчитать общий вес (в каратах) и стоимость.
    Провести сортировку камней ожерелья на основе ценности. (по цене)
    Найти камни в ожерелье, соответствующие заданному диапазону параметров прозрачности.
     */

    public static void main(String[] args) {
        Stone amber = new Stone(2, "Amber");
        System.out.println(amber.getName());

        Jewel ruby = new Jewel(0.1, "Ruby", 20, "transparent");
        SemipreciosStone ametist = new SemipreciosStone(0.2, "Ametist", 25, "half-transparent");

        Necklace necklace = new Necklace();
//        necklace.getStones().add(ruby);
//        necklace.getStones().add(ametist);
        necklace.addStone(ruby);
        necklace.addStone(ametist);

        System.out.println(necklace.getStones().size());
        System.out.println(necklace.getWeightKr());
    }
}
