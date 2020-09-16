package com.octonion.lessons.l4;

public class Child extends Person implements Printable, Comparable {

    private String parentName;

    public Child(String name, String parentName) {
        super(name);
        this.parentName = parentName;
    }

    public String getChildName() {
        return super.getName();
    }

    public void printInfo() {

    }

//    @Override
//    public String getName() {
//        return super.getName() + "dd";
//    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
