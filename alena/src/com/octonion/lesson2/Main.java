package com.octonion.lesson2;
/*
Новогодний подарок.
Определить иерархию конфет и прочих сладостей. - Done
Создать несколько объектов-конфет. Собрать детский подарок с определением его веса. - Done
Провести сортировку конфет в подарке на основе одного из параметров.- by price Done
Найти конфету в подарке, соответствующую заданному диапазону содержания сахара. - Done
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.Serializable;

public class Main {
    public static void main(String[] args) throws IOException, IndexOutOfBoundsException, ClassNotFoundException {


        Chokolate bounty = new Chokolate("", 7, 14);
        Chokolate mars = new Chokolate("Mars", 10, 19);
        Ledency barbariska = new Ledency("Barbariska", 4, 6);
        Solty lakrica = new Solty("Lakrica", 4, 5);
        Chokolate emptyCandyName = new Chokolate("", 7, 14);

        Present present = new Present();
        try {
//            present.getCandies().get(0);
            present.addCandy(lakrica); //5
            present.addCandy(bounty); //14
            present.addCandy(lakrica); //5
            present.addCandy(barbariska); //6
            present.addCandy(mars); //19
            present.addCandy(barbariska); //6
            present.addCandy(bounty); //14
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
//        f.createNewFile();
        System.out.println(f.exists());

//        String str = "Hi";
//        FileWriter fileWriter = new FileWriter(f, true);
//        fileWriter.write(str);
//        fileWriter.close();

//        System.out.println();
//        Scanner scanner = new Scanner(f);
//        while(scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());
//        }
//        scanner.close();


//region serialization
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

//        mars.setName("Name");
        Chokolate marsCopy = (Chokolate) objectInputStream.readObject();
//        System.out.println(String.format("marsCopy - name is %s, price is %s", marsCopy.getName(), marsCopy.getPrice()));
        System.out.println(String.format("mars - name is %s, price is %s", mars.getName(), mars.getPrice()));
        //endregion

    }

}
