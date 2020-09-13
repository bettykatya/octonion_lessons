package com.octonion.lesson2;

public class Main {
    public static void main(String[] args) {
        NewYearCandies candy1 = new NewYearCandies();
        candy1.CandyName = "Strange Candy";
        System.out.println(candy1.CandyName);

        NewYearCandies candy2 = new NewYearCandies("Cheremushka", "soviet", 1);

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
