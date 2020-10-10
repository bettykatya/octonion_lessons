package com.octonion.lessons.files;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "person")
public class Person implements Serializable {

    @XmlElement
    private String name;

    @XmlElement
    private String passportId;

    @XmlAttribute
    private int age;

    /*
    Person - john, id, 30

    <person age="30">
        <name>john</name>
        <passportId>id</passportId>
    </person>


<Necklace>
	<price>100</price>
	<weightKr>5</weightKr>
	<stones>
		<stone name="Amber" price="300" weightKr="10" />
		<stone price="300">
			<name>Ruby</name>
		</stone>
	</stones>
</Necklace>

     */

    public Person() {
    }

    public Person(String name, String passportId) {
        this.name = name;
        this.passportId = passportId;
    }

    public Person(String name, String passportId, int age) {
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
        return String.format("name - %s, id - %s, age - %d", name, passportId, age);
    }
}
