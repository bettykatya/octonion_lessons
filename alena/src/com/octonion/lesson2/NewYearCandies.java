package com.octonion.lesson2;

/*
Новогодний подарок.
Определить иерархию конфет и прочих сладостей.
Создать несколько объектов-конфет. Собрать детский подарок с определением его веса.
Провести сортировку конфет в подарке на основе одного из параметров. Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.
 */
public class NewYearCandies {
    public int id;
    public String CandyName;
    public String CandyType;
//    public int weight;
//    public int qty;

    //region constructor
    public NewYearCandies() {
    }

    public NewYearCandies(String CandyName, String CandyType, int id) {
        this.CandyName = CandyName;
        this.CandyType = CandyType;
        System.out.println(CandyName + " - " + CandyType );
    }

    public void weightOfPresent(int weight, int qty) {
        System.out.println("Presents weight is " + weight * qty);
    }

    public String setCandyName(String candyName) {
        this.CandyName = candyName;
        return candyName;
    }

    public String getCandyName() {
        return CandyName;
    }
}
