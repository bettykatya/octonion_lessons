package com.octonion.lesson2;

public class Chokolate extends Sweet {
    private String ingredientCacao;
    private String ingredientPalma;

    public String getChildName() {
        return super.getCandyName();
    }
}
