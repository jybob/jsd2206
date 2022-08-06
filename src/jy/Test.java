package jy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String[] args) {
        String name="江焰";
        String address="南京";
        int age=24;
        String []otherInfo={"长得帅","天赋好","有钱"};
        Person person=new Person(name,address,age,otherInfo);
        ObjectOutputStream oos= null;
        try {
            FileOutputStream fos=new FileOutputStream("江焰的档案.obj");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
