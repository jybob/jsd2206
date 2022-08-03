package socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private Socket socket;
Scanner scan=new Scanner(System.in);
    public Client() {
        try {
            System.out.println("正在连接服务端");
            socket=new Socket("176.5.14.99",8088);
            System.out.println("与服务端建立连接");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            OutputStream out=socket.getOutputStream();
            OutputStreamWriter osw=new OutputStreamWriter(out);
            BufferedWriter bw=new BufferedWriter(osw);
            PrintWriter pw=new PrintWriter(bw,true);
            while(true) {
                String s=scan.nextLine();
                if("exit".equals(s)){
                    break;
                }
                pw.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
