package com.company.kshebeko_class;


import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;


import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

    //1. Определить иерархию цветов +
    //2. Создать объекты цветы +
    //3. Создать букет цветов с аксессуарами +
    //4. Определить стоимость букета +
    //5. Сортировка по уровню свежести +
    //6. Найти цветов по диапазону стебля +

    public static void main(String[] args) throws Exception {
        ArrayList<Flower> flowerList = new ArrayList();
        Flower chamomile = new ForestFlower("Chamomile", 2,50, 10);//Ромашка
        Flower hydrangea = new GardenFlower("Hydrangea", 7, 45, 4);//Гортензия
        Flower knapweed = new ForestFlower("Knapweed", 9, 20, 2);//Василек
        Flower peony = new GardenFlower("Peony", 7,60, 9);
        Flower rose = new GardenFlower("Rose", 8,100, 7);
        Flower narcissus = new GardenFlower("Narcissus",3,29, 8);
        Flower lily = new GardenFlower("Lily", 10,35, 9);
        Flower emptyFlowerName = new ForestFlower("",4, 6, 10);

        flowerList.add(chamomile);
        flowerList.add(hydrangea);
        flowerList.add(knapweed);
        flowerList.add(peony);
        flowerList.add(rose);
        flowerList.add(narcissus);
        flowerList.add(lily);

        System.out.println(chamomile);
        System.out.println(hydrangea);
        System.out.println(knapweed);
        System.out.println(peony);
        System.out.println(rose);
        System.out.println(narcissus);
        System.out.println(lily);
        System.out.println("\t");

        Bouquet first = new Bouquet();
        first.setFlowerList(flowerList);
        first.accessories = Accessories.PAPER;
        first.accessories = Accessories.BEADS;

        try {
            first.setFlowerList(flowerList);
            //first.addFlowerList(flowerList);
            first.addFlowerList(emptyFlowerName);

        } catch (EmptyFlowerNameException e) {
            System.out.println("Empty flower name in first bouquet");
        }

        Bouquet second = new Bouquet();
        second.setFlowerList(flowerList);
        second.accessories = Accessories.RIBBON;

        try {
            second.setFlowerList(flowerList);
            second.addFlowerList(emptyFlowerName);

        } catch (EmptyFlowerNameException e) {
            System.out.println("Empty flower name in second bouquet");
        }

        System.out.println("\t");
        System.out.println("Bouquet First frost: " + first);
        System.out.println("Bouquet Autumn morning: " + second);
        System.out.println("\t");


        int index = flowerList.indexOf(peony);
        System.out.println("Peony number: " + index);

        System.out.println("\t");
        System.out.println("Price Bouquet: First frost = " + first.getPrice());
        System.out.println("Price Bouquet: Autumn morning = " + second.getPrice());

        System.out.println("\t");
        System.out.println("Quantity in bouquet: " + first.getFlowerList().size());
        System.out.println( "Flower stem range 35 - 70 " + first.getFlowerStemLength(35,70));

        System.out.println("\t");
        System.out.println(flowerList);
        Collections.sort(flowerList);
        System.out.println(flowerList);

        System.out.println("\t");
        first.printFlowers();
        first.sortFlowers();
        first.printFlowers();

        //File
        File f = new File("file.txt");
        //f.createNewFile();
        System.out.println(f.exists());

        /*String str = "Bouquet";
        FileWriter fileWriter = new FileWriter(f, true);
        fileWriter.write(str);
        fileWriter.close();*/

        FileReader fileReader = new FileReader(f);
        int b;
        while ((b = fileReader.read()) != -1) {
            System.out.print((char) b);
        }
        fileReader.close();

        //Serialization
        String filename = "file.ser";

        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);

        out.writeObject(chamomile);

        out.close();
        fileOutputStream.close();

        //deserialization
       /* FileInputStream fileInputStream = new FileInputStream(filename);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Flower chamomileCope = (Flower) objectInputStream.readObject();
        chamomile.setName();
        System.out.println(String.format("nameCopy is %s, price is %s", chamomileCope.getName(),chamomileCope.getPrice()));
        System.out.println(String.format("name is %s, price is %s", chamomile.getName(),chamomile.getPrice()));*/


        FileInputStream fileInputStream = new FileInputStream(filename);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        //first = (Bouquet) objectInputStream.readObject();
        System.out.println(String.format("first bouquet", first.getPrice()));//System.out.println(String.format("firstCopy",firstCopy.getPrice()));


        //region object to json
        File jsonFile = new File("first.json");
        ObjectMapper objectMapper = new ObjectMapper();
        //objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE, JsonTypeInfo.As.PROPERTY);
        objectMapper.writeValue(jsonFile, first);

        //region json to object
        byte[] encoded = Files.readAllBytes(jsonFile.toPath());
        String json = new String(encoded);
        try {
            Bouquet firstFromJson = objectMapper.readValue(json, Bouquet.class);
            System.out.println(firstFromJson);
        } catch (IOException e) {
            e.printStackTrace();
        }







    }
}
