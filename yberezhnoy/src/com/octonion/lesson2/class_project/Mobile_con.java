package com.octonion.lesson2.class_project;


public class Mobile_con {
    public String plan;
    private int minutes;
    public static int customers = 0;
    public int price = 35;

    public void tariffPlan() {
        System.out.println("Tariff plan " + this.plan + ". number of customers " + this.customers + ". minutes to other network " + this.minutes);
    }

    public Mobile_con(String plan, int price, int minutes, int customers) {
        this.plan = plan;
        this.minutes = minutes;
        this.price = price;
        this.customers = customers;
        customers++;


    }
}
