package com.octonion.lesson2;

/*
Новогодний подарок.
Определить иерархию конфет и прочих сладостей.
Создать несколько объектов-конфет. Собрать детский подарок с определением его веса.
Провести сортировку конфет в подарке на основе одного из параметров. Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.
 */
public abstract class NewYearCandy {
    public String candyName;
    private final int SUGAR_IN_GRAMM = 5;
    private int weight;
    private  int price;
    protected int totalSugar;

    public NewYearCandy() {
    }

    public NewYearCandy(String candyName, int weight, int price) {
        this.candyName = candyName;
        this.weight=weight;
        this.price= price;
        System.out.println(candyName + " -  цена: " + price);
    }

    public int calculateTotalSugar(int weight) {
        this.weight = weight;
        totalSugar = SUGAR_IN_GRAMM * weight;
        return totalSugar;
    }
    public abstract int getWeight();
    public abstract  int getPrice();

}
