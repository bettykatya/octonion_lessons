package com.octonion.lesson2;

import java.util.ArrayList;
import java.util.List;

public class Present {
    private int weight;
    private int price;

    private List<NewYearCandy> candies = new ArrayList();

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public List getCandies() {
        return candies;
    }

    public void addCandy(NewYearCandy candy) throws EmptyCandyNameException {
        if (candy.getName().isEmpty()) {
            throw new EmptyCandyNameException();
        }
        candies.add(candy);
        weight += candy.getWeight();
        price += candy.getPrice();
    }

    public void sortCandies() {
        List<NewYearCandy> sortedList = new ArrayList<>();

        while (candies.size() > 0) {
            NewYearCandy candyMin = candies.get(0);
            for (int i = 1; i < candies.size(); i++) {
                NewYearCandy candyCurr = candies.get(i);

                if (candyCurr.getPrice() < candyMin.getPrice()) {
                    candyMin = candyCurr;
                }
            }
            sortedList.add(candyMin);
            candies.remove(candyMin);
        }

        candies = sortedList;
    }

    public void printCandies() {
        System.out.println("Candies in present:");
        for (int i = 0; i < candies.size(); i++) {
            System.out.println(" - " + candies.get(i).getName());
        }
    }

    public ArrayList<NewYearCandy> calculateTotalSugar(int left, int right) {
        ArrayList<NewYearCandy> candyTotalSugar = new ArrayList<>();

        for (int i = 0; i < this.candies.size(); i++) {
            NewYearCandy candy = this.candies.get(i);
            int totalSugar = candy.calculateTotalSugar();
            if (totalSugar > left && totalSugar < right) {
                candyTotalSugar.add(candy);
            }
        }
        return candyTotalSugar;
    }


}
