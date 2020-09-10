package com.octonion.lesson2.class_project;

public class Main {

    public static void main(String[] args) {


        /*
        12. Мобильная связь.
        Определить иерархию тарифов мобильной компании.
        Создать список тарифов компании.
        Подсчитать общую численность клиентов. Провести сортировку тарифов на основе размера абонентской платы.
        Найти тариф в компании, соответствующий заданному диапазону параметров.
         */

        Mobile_con comfort_S = new Mobile_con("comfort_S", 13, 60, 5);
        Mobile_con comfort_L = new Mobile_con("comfort_L",21, 120, 15);
        Mobile_con comfort_M = new Mobile_con("comfort_M", 35, 240, 1);

        comfort_S.tariffPlan();
        comfort_L.tariffPlan();
        comfort_M.tariffPlan();

        System.out.println("Number of customers: " + Mobile_con.customers); // c колличеством кастомеров у меня проблема. выводится последний заданный параметр
        System.out.println("Price of the comfort_L tariff plan = " + comfort_L.price);


    }
}
