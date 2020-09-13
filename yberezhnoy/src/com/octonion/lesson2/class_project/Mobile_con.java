package com.octonion.lesson2.class_project;


public class Mobile_con {
    private String plan;
    //public int minutes;
    public static int customers = 0;
    public int price = 35;

    public void tariffPlan() {
        System.out.println("Tariff plan " + this.plan);
    }

    public Mobile_con(String plan, int price) {
        this.plan = plan;
        this.price = price;
        customers++;
    }

}
