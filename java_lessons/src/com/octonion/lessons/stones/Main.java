package com.octonion.lessons.stones;

public class Main {

    /*
    6. Камни. Определить иерархию драгоценных и полудрагоценных камней.
    Отобрать камни для ожерелья. Подсчитать общий вес (в каратах) и стоимость.
    Провести сортировку камней ожерелья на основе ценности.
    Найти камни в ожерелье, соответствующие заданному диапазону параметров прозрачности.
     */

    public static void main(String[] args) {
        Stone amber = new Stone(2, "Amber");
        System.out.println(amber.getName());


        Stone jewel = new Stone(1, "Brilliant");
    }
}
