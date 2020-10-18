package com.octonion.lesson2.class_project;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {


        /*
        12. Мобильная связь.
        Определить иерархию тарифов мобильной компании.
        Создать список тарифов компании.
        Подсчитать общую численность клиентов.
        Провести сортировку тарифов на основе размера абонентской платы.
        Найти тариф в компании, соответствующий заданному диапазону параметров.
         */

        SimpleTP comfort_S = new SimpleTP("comfort_S", 4761, 1.0, 60, 500, 13.90);
        SimpleTP comfort_M = new SimpleTP("comfort_M", 3458, 10.0, 120, 1000, 20.90);
        SimpleTP comfort_L = new SimpleTP("comfort_L", 2319, 25.0, 240, 2000, 29.90);
        SimpleTP comfort_XL = new SimpleTP("comfort_XL", 1109, 50.0, 1000, 5000, 39.90);

        UnlimTP unlimited_XS = new UnlimTP("unlimited_XS", 2314, Double.POSITIVE_INFINITY, 1, 8.90);
        UnlimTP unlimited_S = new UnlimTP("unlimited_S", 1234, Double.POSITIVE_INFINITY, 2, 13.90);
        UnlimTP unlimited_M = new UnlimTP("unlimited_M", 2242, Double.POSITIVE_INFINITY, 4, 17.90);

        UnlimTP unlimited_SL = unlimited_S;
        SimpleTP emptyTariffPlanName = new SimpleTP("", 4761, 1.0, 60, 500, 13.90);

        Company velcom = new Company();
        try {
            velcom.addTp(comfort_S);
            velcom.addTp(comfort_M);
            velcom.addTp(comfort_L);
            velcom.addTp(comfort_XL);
            velcom.addTp(unlimited_XS);
            velcom.addTp(unlimited_S);
            velcom.addTp(unlimited_M);
            velcom.addTp(emptyTariffPlanName);
        } catch (EmptyTariffPlanNameException em) {
            System.out.println("empty tariff plan name exception");

        }

        System.out.println("Общая численность клиентов = " + velcom.getCustomers());
        System.out.println("Cортировка на основе размера стоимости тарифного плана: " );

        velcom.sortTP();

        String str = "Тарифные планы в диапазоне заданных цен :";
        ArrayList<TariffPlan> getTpPrices = velcom.getPriceRange(15, 40);
        for (int i = 0; i < getTpPrices.size(); i++) {
            TariffPlan tp = getTpPrices.get(i);
            str += " " + tp.getPlan() + ";";
        }
        System.out.println(str);

        System.out.println();
        System.out.println("Compare and equals the prices of one tariff plan to another: ");
        System.out.println(unlimited_S.equals(unlimited_SL));
        System.out.println(unlimited_S.compareTo(unlimited_M));


        File f = new File("file.txt");
        f.createNewFile();
        System.out.println();
        System.out.println("Сhecking for file existence: ");
        System.out.println(f.exists());

        String str2 = "Added new text entry in file.txt; ";
        FileWriter fileWriter = new FileWriter(f, true);
        fileWriter.write(str2);
        fileWriter.close();

        System.out.println();
        Scanner scanner = new Scanner(f);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();

        //region serialization
        String filename = "file.ser";

        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);

        out.writeObject(unlimited_S);
        out.close();
        fileOutputStream.close();
        //endregion

        //region deserialization
        FileInputStream fileInputStream = new FileInputStream(filename);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        System.out.println(String.format("unlimited_S - tariff plan is %s, customers is %s, price is %s, inet is %s", unlimited_S.getPlan(), unlimited_S.getCustomers(), unlimited_S.getPrice(), unlimited_S.getInet()));
        //endregion

        UnlimTP plan = new UnlimTP("unlimited_S", 1234, Double.POSITIVE_INFINITY, 3, 12.90);

        //region object to json
        File jsonFile = new File("plan.json");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(jsonFile, plan);
        //endregion

//        //region json to object
//        byte[] encoded = Files.readAllBytes(jsonFile.toPath());
//        String json = new String(encoded);
//        UnlimTP planFromJson = objectMapper.readValue(json, UnlimTP.class);
//        System.out.println(planFromJson);
//        //endregion


    }

}
