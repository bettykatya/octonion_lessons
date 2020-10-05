package com.octonion.lesson2.class_project;

public class UnlimTP extends TariffPlan {

    private int netSpeed;

    public UnlimTP(String plan, int customers, Double inet, int netSpeed, double price) {
        super(plan, customers, price, inet);
        this.netSpeed = netSpeed;
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
