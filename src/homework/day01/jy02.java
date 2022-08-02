package homework.day01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class jy02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream p=new FileInputStream("person1.obj");
        ObjectInputStream f=new ObjectInputStream(p);
        Object s=f.readObject();
        Person m=(Person) s;
        System.out.println(m);
        f.close();
    }
}
