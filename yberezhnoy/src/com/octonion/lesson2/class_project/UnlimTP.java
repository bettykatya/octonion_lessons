package com.octonion.lesson2.class_project;

public class UnlimTP extends TariffPlan {

    private double price;
    private String inet;
    private int netSpeed;

    public UnlimTP(String plan, int customers, String inet, int netSpeed, double price) {
        super(plan, customers);
        this.netSpeed = netSpeed;
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
