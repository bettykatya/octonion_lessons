package com.octonion.lesson2;

public class Main {
    public static void main(String[] args){
        NewYearCandies candy1 = new NewYearCandies();
        NewYearCandies candy2 = new NewYearCandies();
        NewYearCandies candy3 = new NewYearCandies();
        NewYearCandies candy4 = new NewYearCandies();

        candy1.weightOfPresent(2,10);
        candy2.weightOfPresent(3,4);
        candy3.findCandyType("type1");
      candy4.findCandyType("type2");
    }
}
