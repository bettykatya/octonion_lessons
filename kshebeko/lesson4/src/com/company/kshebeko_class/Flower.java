package com.company.kshebeko_class;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(name = "ForestFlower", value = ForestFlower.class),
        @JsonSubTypes.Type(name = "GardenFlower", value = GardenFlower.class)
})


public abstract class Flower implements Comparable<Flower>, Serializable {
    protected String name;
    protected int price;


    public Flower(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Flower() {
    }


   /* @Override
    public String toString() {
        return name + " flower price = " + price;
    }*/

    public String getName() {
        return name;
    }

    public abstract String setName();

    public int getPrice() {
        return price;
    };

    protected abstract int getStemLength();

    protected abstract int getFreshFlower();

    @Override
    public int compareTo(Flower o) {
        return Integer.valueOf(this.price).compareTo(Integer.valueOf(o.price));
    }
}
