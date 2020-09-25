package com.octonion.lessons.l4;

public class Main {
    public static void main(String[] args) {
        Person mike = new Person("Mike");
        System.out.println(mike.getName());

        Person john = new Person();
        john.setName("John");
        john.profession = Profession.DOCTOR;

        Child bob = new Child("Bob", "Mike");
        System.out.println(bob.getName());


    }

    public static void callSum() {
        sum(2, 5);
        sum("ss", "aa");

//        print(5);
        print(new Person("Mike"));
        print(new Child("Mike", "Bob"));
    }

    public static<T> void sum(T a, T b) {
        System.out.println(a);
        System.out.println(a);
    }

    public static<T extends Printable> void print(T a) {
        System.out.println(a);
        System.out.println(a);
    }
}
