package homework.day01;

import java.io.Serializable;
import java.util.Arrays;

public class Person implements Serializable {
    private String name;
    private String gender;
    private int age;
    private String []otherInfo;

    public Person(String name, String gender, int age, String[] otherInfo) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.otherInfo = otherInfo;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }
}

