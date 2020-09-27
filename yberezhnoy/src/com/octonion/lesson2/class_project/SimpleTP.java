package com.octonion.lesson2.class_project;

public class SimpleTP extends TariffPlan {

    private double price;
    private int minutes;
    private int sms;
    private int inet;


    public SimpleTP(String plan, int customers, int inet, int minutes, int sms, double price) {
        super(plan, customers);
        this.minutes = minutes;
        this.sms = sms;
        this.inet = inet;
        this.price = price;

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
