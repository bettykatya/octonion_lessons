package com.octonion.lessons.stones;

import java.util.ArrayList;
import java.util.List;

public class Necklace {
    private int price;
    private double weightKr;
    private List<Stone> stones = new ArrayList();

    public List getStones() {
        return stones;
    }

    public double getWeightKr() {
        return weightKr;
    }

    public int getPrice() {
        return price;
    }

    public void addStone(Stone stone) {
        stones.add(stone);
        weightKr += stone.getWeigtKr();
        price += stone.getPrice();
    }

    public ArrayList<Stone> getStonesWithTransparency(int left, int right) {
        ArrayList<Stone> stonesTr = new ArrayList<>();

        for (int i = 0; i < stones.size(); i++) {
            Stone stone = stones.get(i);
            int transparency = stone.getTransparency();
            if (transparency > left && transparency < right) {
                System.out.println(stone.getName());
                stonesTr.add(stone);
            }
        }

        return stonesTr;
    }

    public void sortStones() {

        List<Stone> sortedList = new ArrayList<>();

        for (int i = 0; i < stones.size(); i++) {
            Stone stoneMin = stones.get(i);
            for (int j = i+1; j < stones.size(); j++) {
                Stone stoneCurr = stones.get(j);

                if(stoneCurr.getPrice() < stoneMin.getPrice()) {
                    stoneMin = stoneCurr;
                }
            }
            sortedList.add(stoneMin);
        }
        stones = sortedList;
    }

    public void printStones() {
        System.out.println("Stones in necklace:");
        for (int i = 0; i < stones.size(); i++) {
            System.out.println(" - " + stones.get(i).getName());
        }
    }
}
