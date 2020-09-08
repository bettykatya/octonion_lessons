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
    public int weight;
    public int qty;
    public String ingredients;

    //region constructor
    public NewYearCandies() {
    }

    public NewYearCandies(int id) {
        id++;
    }

    public NewYearCandies(String CandyName) {
        this.CandyName = CandyName;
    }
  /*  почему-то краснеет
    public NewYearCandies(String "Bounty") {
        this.CandyName = "Bounty";

    }
      public NewYearCandies(String CandyName) {
      this.CandyName = CandyName;
  }
    */


    public void weightOfPresent(int weight, int qty) {
        System.out.println("Presents weight is " + weight * qty);
    }

    public void findCandyType(String CandyType) {
        this.CandyType = CandyType;
        System.out.println(CandyType);
    }
}
