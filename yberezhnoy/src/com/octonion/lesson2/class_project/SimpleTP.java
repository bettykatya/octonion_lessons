package com.octonion.lesson2.class_project;

public class SimpleTP extends TariffPlan {

    private int minutes;
    private int sms;


    public SimpleTP(String plan, int customers, Integer inet, int minutes, int sms, double price) {
        super(plan, customers, price, inet);
        this.minutes = minutes;
        this.sms = sms;

    }

    @Override
    public int getCustomers() {
        return customers;
    }

    @Override
    public double getPrice() {
        return price;
    }

}
