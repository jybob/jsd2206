package jy;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("江焰的档案.obj");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Person p=(Person) ois.readObject();
            System.out.println(p.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
