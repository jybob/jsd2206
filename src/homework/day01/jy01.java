package homework.day01;

import java.io.*;

public class jy01 {
    public static void main(String[] args) throws IOException {
        String name="申桑";
        String gender="男";
        int age=20;
        String []otherInfo={"年轻力壮","身体好","活好"};
        Person l=new Person(name,gender,age,otherInfo);
        FileOutputStream h=new FileOutputStream("person1.obj");
        ObjectOutputStream k=new ObjectOutputStream(h);
        k.writeObject(l);
        k.close();

    }
}
