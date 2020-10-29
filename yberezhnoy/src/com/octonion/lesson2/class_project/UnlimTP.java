package com.octonion.lesson2.class_project;

import java.io.Serializable;

public class UnlimTP extends TariffPlan implements Serializable, Comparable<UnlimTP> {

    protected int netSpeed;

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

    @Override
    public Double getInet() {
        return inet;
    }

    @Override
    public String toString() {
        return String.format("unlimited_S - tariff plan is %s, customers is %s, price is %s, inet is %s", plan, customers, price, inet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnlimTP that = (UnlimTP) o;
        return price == that.price;
    }

    @Override
    public int compareTo(UnlimTP o) {
        return Double.valueOf(this.price).compareTo(Double.valueOf(o.price));
    }


}
