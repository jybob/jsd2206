package jy;

import java.io.Serializable;
import java.util.Arrays;

public class Person implements Serializable {
    private String name;
    private String address;
    private int age;
    private String[] otherInfo;

    public Person(String name, String address, int age, String[] otherInfo) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.otherInfo = otherInfo;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }
}
