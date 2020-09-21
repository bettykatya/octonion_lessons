package com.octonion.lessons.stones;

import java.util.ArrayList;

public class Necklace {
    private int price;
    //    private int stoneQt;
    private double weightKr;
    private ArrayList<Stone> stones = new ArrayList();

    public ArrayList getStones() {
        return stones;
    }

    public double getWeightKr() {
        return weightKr;
    }

    public void setWeightKr(double weightKr) {
        this.weightKr = weightKr;

    }

    public void addStone(Stone stone) {
        stones.add(stone);
        weightKr += stone.getWeigtKr();
    }

    private void calcWeight() {
        double weight = 0;
        for (int i = 0; i < stones.size(); i++) {
            weight += stones.get(i).getWeigtKr();
        }
        System.out.println(weight);
        setWeightKr(weight);
    }
}
