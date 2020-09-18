package com.octonion.lessons.stones;

public class Stone {
    private int weight;
    private String name;

    public Stone(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public Stone() {
    }

    public String getName() {
        return name;
    }
}
