package com.octonion.lessons.stones;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    /*
    6. Камни. Определить иерархию драгоценных и полудрагоценных камней.
    Отобрать камни для ожерелья. Подсчитать общий вес (в каратах) и стоимость.
            Провести сортировку камней ожерелья на основе ценности. (по цене)
    Найти камни в ожерелье, соответствующие заданному диапазону параметров прозрачности.
     */

    public static void main(String[] args) {
        SemipreciosStone amber = new SemipreciosStone(2, "Amber", 3, 33);
        SemipreciosStone amber2 = new SemipreciosStone(32, "Amber2", 7, 43);
        SemipreciosStone amber3 = new SemipreciosStone(32, "Amber2", 2, 43);

        Jewel ruby = new Jewel(0.1, "Ruby", 20, 50);
        SemipreciosStone ametist = new SemipreciosStone(0.2, "Ametist", 25, 67);

        ArrayList<SemipreciosStone> stones = new ArrayList<>();
        stones.add(amber);
        stones.add(amber2);
        stones.add(amber3);
//        Necklace necklace = new Necklace();
//        necklace.addStone(ruby); //20
//        necklace.addStone(amber); //3
//        necklace.addStone(ametist); //25

        System.out.println(amber.equals(amber2));
        System.out.println(amber.compareTo(amber));
        System.out.println(amber.compareTo(amber2));
        System.out.println(amber.compareTo(amber3));

        System.out.println(stones);
        Collections.sort(stones);
        System.out.println(stones);

//        System.out.println(necklace.getStones().size());
//        System.out.println(necklace.getWeightKr());
//        System.out.println(necklace.getPrice());
//
//        String str = " stones - ";
//        ArrayList<Stone> stonesWithTransparency = necklace.getStonesWithTransparency(40, 60);
//        for (int i = 0; i < stonesWithTransparency.size(); i++) {
//            Stone stone = stonesWithTransparency.get(i);
//            str += " " + stone.getName();
//        }
//        System.out.println(str);
//
//        necklace.printStones();
//        necklace.sortStones();
//        necklace.printStones();
    }
}
