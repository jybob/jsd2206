package io;

import java.io.*;
import java.util.Scanner;

public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos=new FileOutputStream("pw2.txt");
        OutputStreamWriter fis=new OutputStreamWriter(fos);
        BufferedWriter pp=new BufferedWriter(fis);
        PrintWriter tt=new PrintWriter(pp);
        Scanner scan=new Scanner(System.in);

       while (true) {
           String a = scan.nextLine();
           if ("exit".equals(a)){
               break;
           }
           tt.println(a);
           tt.flush();



       }
        tt.close();

    }
}
