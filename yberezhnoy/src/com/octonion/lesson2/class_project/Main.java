package com.octonion.lesson2.class_project;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        /*
        12. Мобильная связь.
        Определить иерархию тарифов мобильной компании.
        Создать список тарифов компании.
        Подсчитать общую численность клиентов. Провести сортировку тарифов на основе размера абонентской платы.
        Найти тариф в компании, соответствующий заданному диапазону параметров.
         */

        SimpleTP comfort_S = new SimpleTP("comfort_S", 4761, 1, 60, 500, 13.90);
        SimpleTP comfort_M = new SimpleTP("comfort_M", 3458, 10, 120, 1000, 20.90);
        SimpleTP comfort_L = new SimpleTP("comfort_L", 2319, 25, 240, 2000, 29.90);
        SimpleTP comfort_XL = new SimpleTP("comfort_XL", 1109, 50, 1000, 5000, 39.90);

        UnlimTP unlimited_XS = new UnlimTP("unlimited_XS", 2314, "Unlim", 1, 8.90);
        UnlimTP unlimited_S = new UnlimTP("unlimited_S", 1234, "Unlim", 2, 12.90);
        UnlimTP unlimited_M = new UnlimTP("unlimited_M", 2242, "Unlim", 4, 17.90);


        System.out.println("Price of the comfort_M tariff plan = " + comfort_M.getPrice());


        ArrayList ListTP = new ArrayList();
        ListTP.add("comfort_S");
        ListTP.add("comfort_M");
        ListTP.add("comfort_L");
        ListTP.add("comfort_XL");
        ListTP.add("unlimited_XS");
        ListTP.add("unlimited_S");
        ListTP.add("unlimited_M");

        System.out.println(ListTP.get(4));


    }


}
