package com.octonion.lessons.files;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.nio.file.Files;

public class Main {

//    private static Object john;

    public static void main(String[] args) throws Exception {

//        File f = new File("file.txt");
////        f.createNewFile();
//        System.out.println(f.exists());
//
//        String str = "Hello world!";
//
//        FileWriter fileWriter = new FileWriter(f, true);
//        fileWriter.write(str);
//        fileWriter.close();
//
//        FileReader fileReader = new FileReader(f);
//        int b;
//        while ((b = fileReader.read()) != -1) {
//            System.out.print((char) b);
//        }
//        fileReader.close();
//
//        System.out.println();
//        Scanner scanner = new Scanner(f);
//        while(scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());
//        }
//        scanner.close();


        //region serialization
//        Person bob = new Person("Bob", "bob_id");
//
//        String filename = "file.ser";
//
//        FileOutputStream fileOutputStream = new FileOutputStream(filename);
//        ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
//
//        out.writeObject(bob);
//
//        out.close();
//        fileOutputStream.close();
//        //endregion
//
//        //region deserialization
//        FileInputStream fileInputStream = new FileInputStream(filename);
//        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//
//        bob.setName("John");
//        Person bobCopy = (Person) objectInputStream.readObject();
//        System.out.println(String.format("bobCopy - name is %s, id is %s", bobCopy.getName(), bobCopy.getPassportId()));
//        System.out.println(String.format("bob - name is %s, id is %s", bob.getName(), bob.getPassportId()));
        //endregion

//        //region object to xml
        Person john = new Person("John", "john_id", 30);
//
//        File file = new File("person.xml");
//        JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
//        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//
//        // output pretty printed
//        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//
//        jaxbMarshaller.marshal(john, file);
//        jaxbMarshaller.marshal(john, System.out);
//        //endregion
//
//        //region xml to object
//        john.setName("john2");
//        jaxbContext = JAXBContext.newInstance(Person.class);
//
//        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//        Person johnFromXml = (Person) jaxbUnmarshaller.unmarshal(file);
//        System.out.println(johnFromXml);
//        System.out.println(john);
//        //endregion

        //region object to json
        File jsonFile = new File("john.json");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(jsonFile, john);
        //endregion

        //    region json to object
        byte[] encoded = Files.readAllBytes(jsonFile.toPath());
        String json = new String(encoded);
        Person johnFromJson = objectMapper.readValue(json, Person.class);
        System.out.println(johnFromJson);
        //endregion
    }

}
