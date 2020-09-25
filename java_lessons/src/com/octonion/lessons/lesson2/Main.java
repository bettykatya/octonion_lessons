package com.octonion.lessons.lesson2;

public class Main {
    public static void main(String[] args) {
        Device device1 = new Device();
        Device device2 = new Device("id_dev");
        Device device3 = new Device("id_dev2", 234, "dev_name");

        device1.introduceYourself();
        device2.introduceYourself();
        device3.introduceYourself();
        device2.id = "26e3rqy2tgyhuj";
        System.out.println(device2.getOwner());

//        System.out.println("device nmber - " + Device.deviceNumber);
//        device1.DEVICE_NAME_MAX_LENGTH = 5;
//        System.out.println(device1.DEVICE_NAME_MAX_LENGTH);

        int x = 1;
        Point a = new Point(x, 6);
        System.out.println(a.z);
    }
}
