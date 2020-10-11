package com.octonion.lesson2.class_project;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private int customers;
    private double price;


    private List<TariffPlan> plans = new ArrayList();

    public int getCustomers() {
        return customers;
    }

    public void addTp(TariffPlan tp) throws EmptyTariffPlanNameException{
        if (tp.getPlan().isEmpty())
            throw new EmptyTariffPlanNameException();
        plans.add(tp);
        customers += tp.getCustomers();
        price += tp.getPrice();
    }

    public ArrayList<TariffPlan> getPriceRange(double left, double right) {
        ArrayList<TariffPlan> plansTr = new ArrayList<>();

        for (int i = 0; i < plans.size(); i++) {
            TariffPlan tp = plans.get(i);
            double price = tp.getPrice();
            if (price > left && price < right) {
                plansTr.add(tp);
                System.out.println(tp.getPlan());
            }
        }

        return plansTr;
    }


    public void sortTP() {

        List<TariffPlan> sortedListTP = new ArrayList<>();

        while (plans.size() > 0) {
            TariffPlan priceMin = plans.get(0);
            for (int j = 1; j < plans.size(); j++) {
                TariffPlan priceCurr = plans.get(j);

                if (priceCurr.getPrice() < priceMin.getPrice()) {
                    priceMin = priceCurr;
                }
            }
            sortedListTP.add(priceMin);
            plans.remove(priceMin);

        }
        plans = sortedListTP;

    }

}

