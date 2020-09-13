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

        Mobile_con comfort_S = new Mobile_con("comfort_S", 13);
        Mobile_con comfort_M = new Mobile_con("comfort_M", 26);
        Mobile_con comfort_L = new Mobile_con("comfort_L", 34);

        comfort_S.tariffPlan();
        comfort_M.tariffPlan();
        comfort_L.tariffPlan();


        System.out.println("Number of customers: " + Mobile_con.customers);
        System.out.println("Price of the comfort_M tariff plan = " + comfort_M.price);

        ArrayList tariffPlan = new ArrayList();
        tariffPlan.add("comfort_S");
        tariffPlan.add("comfort_M");
        tariffPlan.add("comfort_L");
        tariffPlan.add("comfort_XL");
        tariffPlan.add("unlimited_XS");

        System.out.println(tariffPlan.get(4)); // вывод тарифа по индексу из списка
        System.out.println("Number of tariffs : " + tariffPlan.size()); // кол-во тарифов в списке

        int index = tariffPlan.indexOf("comfort_L");
        System.out.println("comfort_L number: " + index); // определение индекса из списка по названию

        System.out.println("TP from list: " + tariffPlan.contains("comfort_XL")); //проверка на наличие в списке названия тарифного плана

        String Offers = " ";
        for (int i = 0; i < tariffPlan.size(); i++) {
            Offers = Offers + tariffPlan.get(i) + ", ";
        }
        System.out.println("Tariff plan offers : " + Offers + " "); // вывод предложений в списке


    }
}
