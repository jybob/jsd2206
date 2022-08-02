package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("./src/io/CopyDemo.java");
        InputStreamReader fos=new InputStreamReader(fis);
        int d;
        while((d=fos.read())!=-1){
            char c=(char) d;
            System.out.print(c);
        }
        fos.close();
    }
}
