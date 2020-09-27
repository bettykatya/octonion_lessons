package com.octonion.lesson2;

public class Main {
    public static void main(String[] args) {


        Chokolate bounty = new Chokolate("Bounty", 5, 16);
        Chokolate mars = new Chokolate("Mars", 10, 14);
        Ledency barbariska = new Ledency("Barbariska", 4, 5);
        Solty lakrica = new Solty("Lakrica",4,5);

        Present present = new Present();
        present.addCandy(lakrica);
        present.addCandy(lakrica);
        present.addCandy(barbariska);
        present.addCandy(mars);
        present.addCandy(bounty);


        System.out.println("стоимость - " + present.getPrice());
        System.out.println("Вес - " + present.getWeight());


    }
}
