package com.octonion.lesson2.class_project;


public abstract class TariffPlan {
    private String plan;
    protected int customers;
    protected double price;
    protected Integer inet;

    public TariffPlan(String plan, int customers, double price, Integer inet) {
        this.plan = plan;
        this.customers = customers;
        this.price = price;
        this.inet = inet;
    }

    public TariffPlan() {
    }

    public String getPlan() {
        return plan;
    }

    public abstract int getCustomers();

    public abstract double getPrice();

}
