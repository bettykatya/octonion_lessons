package com.octonion.lesson2;
/*
Новогодний подарок.
Определить иерархию конфет и прочих сладостей. - Done
Создать несколько объектов-конфет. Собрать детский подарок с определением его веса. - Done
Провести сортировку конфет в подарке на основе одного из параметров.- by price Done
Найти конфету в подарке, соответствующую заданному диапазону содержания сахара. - Done
 */

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, IndexOutOfBoundsException, ClassNotFoundException {
        Chokolate bounty = new Chokolate("Bounty", 7, 21);
        Chokolate mars = new Chokolate("Mars", 10, 11);
        Ledency barbariska = new Ledency("Barbariska", 4, 6);
        Chokolate emptyCandyName = new Chokolate("", 7, 14);

        Present present = new Present();
        try {
            present.addCandy(bounty);
            present.addCandy(barbariska);
            present.addCandy(mars);
            present.addCandy(barbariska);
            present.addCandy(bounty);
            present.addCandy(emptyCandyName);
        } catch (EmptyCandyNameException e) {
            System.out.println("empty candy exception");
        } catch (NullPointerException npe) {
            System.out.println("Null pointer exception");
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Out of boundaries");
        } catch (Exception exception) {
            System.out.println("Exception");
        }

        System.out.println();
        System.out.println("Price - " + present.getPrice());
        System.out.println("Weight - " + present.getWeight());
        System.out.println();

        String cnd = "Total sugar in range - ";
        ArrayList<NewYearCandy> calculateTotalSugar = present.calculateTotalSugar(30, 60);
        for (int i = 0; i < calculateTotalSugar.size(); i++) {
            NewYearCandy candy = calculateTotalSugar.get(i);
            cnd += " " + candy.getName();
        }
        System.out.println();
        System.out.println(cnd);
        System.out.println();
        present.printCandies();
        present.sortCandies();
        present.printCandies();
        System.out.println();

        File f = new File("file.txt");
        f.createNewFile();
        System.out.println(f.exists());

        String str = "Hi";
        FileWriter fileWriter = new FileWriter(f, true);
        fileWriter.write(str);
        fileWriter.close();

        System.out.println();
        Scanner scanner = new Scanner(f);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();

//      region serialization
        String filename = "file.ser";

        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);

        out.writeObject(mars);
        out.close();
        fileOutputStream.close();
        //endregion

        //region deserialization
        FileInputStream fileInputStream = new FileInputStream(filename);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

//      mars.setName("Name");
        Chokolate marsCopy = (Chokolate) objectInputStream.readObject();
//      System.out.println(String.format("marsCopy - name is %s, price is %s", marsCopy.getName(), marsCopy.getPrice()));
        System.out.println(String.format("mars - name is %s, price is %s", mars.getName(), mars.getPrice()));
        //endregion

        Chokolate candy = new Chokolate("mars", 15, 5);

        //region object to json
        File jsonFile = new File("candy.json");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(jsonFile, candy);
        //endregion

        //region json to object
        byte[] encoded = Files.readAllBytes(jsonFile.toPath());
        String json = new String(encoded);
        Chokolate candyFromJson = objectMapper.readValue(json, Chokolate.class);
        System.out.println(candyFromJson);
        //endregion

        System.out.println();
        System.out.println("Сравнение цены одной конфетки с другой");
        System.out.println(mars.equals(bounty));
        System.out.println(mars.compareTo(bounty));
    }
}
