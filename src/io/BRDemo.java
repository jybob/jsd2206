package io;

import java.io.*;

public class BRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("src/io/BRDemo.java");
        InputStreamReader isr=new InputStreamReader(fis);
        BufferedReader br=new BufferedReader(isr);
        String s;
        while ((s=br.readLine())!=null){

            System.out.println(s);
        }

        br.close();
    }
}
