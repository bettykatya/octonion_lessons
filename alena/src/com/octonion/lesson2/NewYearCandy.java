package com.octonion.lesson2;

/*
Новогодний подарок.
Определить иерархию конфет и прочих сладостей.
Создать несколько объектов-конфет. Собрать детский подарок с определением его веса.
Провести сортировку конфет в подарке на основе одного из параметров. Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.
 */
public class NewYearCandy {
    protected String candyName;
    protected Type type;
    private final int SUGAR_IN_GRAMM = 5;
    private int weight;
    protected int totalSugar;

    public NewYearCandy() {
    }

    public NewYearCandy(String candyName, int id) {
        this.candyName = candyName;
        System.out.println(candyName + " - ");
    }

    public void printCalculatedWeight(int weight, int qty) {
        System.out.println("Presents weight is " + weight * qty);
    }

    public int calculateTotalSugar(int weight) {
        this.weight = weight;
        totalSugar = SUGAR_IN_GRAMM * weight;
        return totalSugar;
    }

    public String setCandyName(String candyName) {
        this.candyName = candyName;
        return candyName;
    }

    public String getCandyName() {
        return candyName;
    }
}
