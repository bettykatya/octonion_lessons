package com.octonion.lesson2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "candy")

public class Chokolate extends NewYearCandy implements Serializable {
    @XmlElement
    private int candyName;
    @XmlElement
    private int weight;
    @XmlElement
    private int price;

//public class Chokolate extends NewYearCandy implements Serializable {

    public Chokolate(String candyName, int weight, int price) {

        super(candyName, weight, price);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int calculateTotalSugar() {
        totalSugar = 5 * weight;
        return totalSugar;
    }
}
