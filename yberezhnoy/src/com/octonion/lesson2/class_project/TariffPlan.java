package com.octonion.lesson2.class_project;


public abstract class TariffPlan {
    private String plan;
    public int customers;

    public TariffPlan(String plan, int customers) {
        this.plan = plan;
        this.customers = customers;
    }

    public TariffPlan() {
    }

    public String getPlan() {
        return plan;
    }

    public abstract int getCustomers();

    public abstract double getPrice();

}
