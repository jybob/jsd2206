package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class jy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("image.jpg");
        FileOutputStream fos = new FileOutputStream("image3.jpg");
        byte[] data = new byte[1024*10];//10kb
        int len = 0;//记录每次实际读取的字节数

        long start = System.currentTimeMillis();
        while( (fis.read(data)) != -1  ){
            fos.write(data,0,fis.read(data));
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕,耗时"+(end-start)+"ms");

        fis.close();
        fos.close();
}
}

