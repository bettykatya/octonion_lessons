package com.octonion.lesson2;
/*
Новогодний подарок.
Определить иерархию конфет и прочих сладостей. - Done
Создать несколько объектов-конфет. Собрать детский подарок с определением его веса. - Done
Провести сортировку конфет в подарке на основе одного из параметров.
Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.
 */

public class Main {
    public static void main(String[] args) {


        Chokolate bounty = new Chokolate("Bounty", 5, 14);
        Chokolate mars = new Chokolate("Mars", 10, 19);
        Ledency barbariska = new Ledency("Barbariska", 4, 5);
        Solty lakrica = new Solty("Lakrica",4,5);

        Present present = new Present();
        present.addCandy(lakrica);
        present.addCandy(bounty);
        present.addCandy(lakrica);
        present.addCandy(barbariska);
        present.addCandy(mars);
        present.addCandy(barbariska);
        present.addCandy(bounty);


        System.out.println("стоимость - " + present.getPrice());
        System.out.println("Вес - " + present.getWeight());


    }
}
