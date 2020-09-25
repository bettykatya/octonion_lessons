package com.octonion.lesson2;

public class Main {
    public static void main(String[] args) {
        NewYearCandy candy1 = new NewYearCandy();
        candy1.candyName = "Strange Candy";
        System.out.println(candy1.candyName);

        NewYearCandy candy2 = new NewYearCandy("Cheremushka", "soviet", 1);

        Chokolate candy3 = new Chokolate();
        candy3.setCandyName("Mars");
        System.out.println(candy3.getCandyName());

        Ledency candy4 = new Ledency();
        candy4.setCandyName("Barbariska");
        System.out.println(candy4.getCandyName());


        candy1.weightOfPresent(2, 10);
        candy2.weightOfPresent(3, 4);
        candy3.weightOfPresent(15, 32);
        candy4.weightOfPresent(28, 75);


    }
}
