package com.octonion.lessons.lesson2;

public class Device {
    public String id;
    private int owner;
    public String name;
    private static int deviceNumber = 0;
    private final int DEVICE_NAME_MAX_LENGTH = 10;

    public void introduceYourself() {
        System.out.println("My id is " + this.id + ". My owner id is " + owner + ". Hello!");
    }

    public Device() {
        deviceNumber++;
    }

    public int getOwner() {
        return owner;
    }

    public Device(String trhfbfj) {
        deviceNumber++;
        this.id = trhfbfj;
        this.owner = 5;
    }

    public Device(String id, int owner, String name) {
        deviceNumber++;
        this.id = id;
        this.owner = owner;
        if (name.length() > DEVICE_NAME_MAX_LENGTH) {
            this.name = "";
        }
    }
}
