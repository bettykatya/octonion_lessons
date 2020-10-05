package com.octonion.lesson2.class_project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        /*
        12. Мобильная связь.
        Определить иерархию тарифов мобильной компании.
        Создать список тарифов компании.
        Подсчитать общую численность клиентов.
        Провести сортировку тарифов на основе размера абонентской платы.
        Найти тариф в компании, соответствующий заданному диапазону параметров.
         */

        SimpleTP comfort_S = new SimpleTP("comfort_S", 4761, 1.0, 60, 500, 13.90);
        SimpleTP comfort_M = new SimpleTP("comfort_M", 3458, 10.0, 120, 1000, 20.90);
        SimpleTP comfort_L = new SimpleTP("comfort_L", 2319, 25.0, 240, 2000, 29.90);
        SimpleTP comfort_XL = new SimpleTP("comfort_XL", 1109, 50.0, 1000, 5000, 39.90);

        UnlimTP unlimited_XS = new UnlimTP("unlimited_XS", 2314, Double.POSITIVE_INFINITY, 1, 8.90);
        UnlimTP unlimited_S = new UnlimTP("unlimited_S", 1234, Double.POSITIVE_INFINITY, 2, 12.90);
        UnlimTP unlimited_M = new UnlimTP("unlimited_M", 2242, Double.POSITIVE_INFINITY, 4, 17.90);

        System.out.println(comfort_L.inet);
        System.out.println("Unlimited = " + unlimited_M.inet); //??? здесь не очень понятно как инфинити сделать. через Double

        Company velcom = new Company(); // список тарифов компании velcom
        velcom.addTp(comfort_S);
        velcom.addTp(comfort_M);
        velcom.addTp(comfort_L);
        velcom.addTp(comfort_XL);
        velcom.addTp(unlimited_XS);
        velcom.addTp(unlimited_S);
        velcom.addTp(unlimited_M);

        System.out.println("Общая численность клиентов = " + velcom.getCustomers());
        System.out.println("Cортировка на основе размера стоимости тарифного плана: ");

        String str = "Тарифные планы в диапазоне заданных цен :";
        ArrayList<TariffPlan> getTpPrices = velcom.getTpPrices(20, 40);
        for (int i = 0; i < getTpPrices.size(); i++) {
            TariffPlan tp = getTpPrices.get(i);
            str += " " + tp.getPlan() + ";";
        }
        System.out.println(str);

    }


}
