package com.octonion.lesson2;
/*
Новогодний подарок.
Определить иерархию конфет и прочих сладостей. - Done
Создать несколько объектов-конфет. Собрать детский подарок с определением его веса. - Done
Провести сортировку конфет в подарке на основе одного из параметров.- by price Done
Найти конфету в подарке, соответствующую заданному диапазону содержания сахара. - Done
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws EmptyCandyNameException {


        Chokolate bounty = new Chokolate("", 7, 14);
        Chokolate mars = new Chokolate("Mars", 10, 19);
        Ledency barbariska = new Ledency("Barbariska", 4, 6);
        Solty lakrica = new Solty("Lakrica", 4, 5);

        Chokolate emptyCandyName = new Chokolate("", 7, 14);

        Present present = new Present();
        try {
            present.addCandy(lakrica);
            present.getCandies(emptyCandyName).get(0);
            try {
                present.addCandy();
                throw new ArrayIndexOutOfBoundsException();
            } catch (NullPointerException npe) {
                throw new EmptyCandyNameException();
            }

        } catch (EmptyCandyNameException e) {
            System.out.println("exception1");
        } catch (NullPointerException npe) {
            System.out.println("exception2");
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("exception3");
        } catch (Exception exception) {
            System.out.println("exception4");
        }
//        present.getCandies().get(2);
//        present.addCandy(lakrica); //5
//        present.addCandy(bounty); //14
//        present.addCandy(lakrica); //5
//        present.addCandy(barbariska); //6
//        present.addCandy(mars); //19
//        present.addCandy(barbariska); //6
//        present.addCandy(bounty); //14


//        try {
//            present.addCandy(emptyCandyName);
//            throw new EmptyCandyNameException();
//        } catch (EmptyCandyNameException e) {
//            System.out.println();
//            System.out.println("empty candy name! Achtung!");
//        }

//        System.out.println();
//        System.out.println("стоимость - " + present.getPrice());
//        System.out.println("Вес - " + present.getWeight());
//        System.out.println();
//
//
//        String cnd = "Total sugar in range - ";
//        ArrayList<NewYearCandy> calculateTotalSugar = present.calculateTotalSugar(30, 60);
//        for (int i = 0; i < calculateTotalSugar.size(); i++) {
//            NewYearCandy candy = calculateTotalSugar.get(i);
//            cnd += " " + candy.getName();
//        }
//        System.out.println();
//        System.out.println(cnd);
//        System.out.println();
//
//
//        present.printCandies();
//        present.sortCandies();
//        present.printCandies();
//        System.out.println();


    }
}
