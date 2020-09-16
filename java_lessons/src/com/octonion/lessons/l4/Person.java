package com.octonion.lessons.l4;

public class Person implements Printable {
    private String name;
    public Profession profession;

    public Person(String name) {
        setName(name);
    }

    public Person() {
    }

    protected final String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return this.getName();
    }

    @Override
    public void print() {
        System.out.println("hi");
    }
}
