package com.octonion.lesson2;

import java.util.ArrayList;
import java.util.List;

public class Present {
    public int weight;
    public int price;

    private List<NewYearCandy> candies = new ArrayList();

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public void addCandy(NewYearCandy candy) {
        candies.add(candy);
        weight += candy.getWeight();
        price += candy.getPrice();
    }

    public void sortCandies() {
        List<NewYearCandy> sortedList = new ArrayList<>();

        for (int i = 0; i < candies.size(); i++) {
            NewYearCandy candyMin = candies.get(i);
            for (int j = i + 1; j < candies.size(); j++) {
                NewYearCandy candyCurr = candies.get(j);

                if (candyCurr.getPrice() < candyMin.getPrice()) {
                    candyMin = candyCurr;
                }
            }
            sortedList.add(candyMin);
        }

        candies = sortedList;
    }

    public void printCandies() {
        System.out.println("Candies in present:");
        for (int i = 0; i < candies.size(); i++) {
            System.out.println(" - " + candies.get(i).getName());
        }
    }



}
