package com.octonion.lessons.stones;

import java.util.ArrayList;

public class Necklace {
    private int price;
    private double weightKr;
    private ArrayList<Stone> stones = new ArrayList();

    public ArrayList getStones() {
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
}
