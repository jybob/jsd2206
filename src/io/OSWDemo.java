package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream p=new FileOutputStream("osw.txt");
        OutputStreamWriter o=new OutputStreamWriter(p, StandardCharsets.UTF_8);
        String line="我爱你，爱着你";
        o.write(line);
        o.write("就像老鼠爱大米");
        o.close();
    }
}
