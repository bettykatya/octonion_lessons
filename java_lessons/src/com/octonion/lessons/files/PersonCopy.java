package com.octonion.lessons.files;

import java.io.Serializable;

public class PersonCopy implements Serializable {

    private String name;

    private String passportId;

    private int age;

    public PersonCopy() {
    }

    public PersonCopy(String name, String passportId) {
        this.name = name;
        this.passportId = passportId;
    }

    public PersonCopy(String name, String passportId, int age) {
        this.name = name;
        this.passportId = passportId;
        this.age = age;
    }

    //region getters&setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //endregion


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", passportId='" + passportId + '\'' +
                ", age=" + age +
                '}';
    }
}
