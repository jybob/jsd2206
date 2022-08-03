package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    private ServerSocket serverSocket;

    public Server() {
        System.out.println("正在启动服务端");
        try {
            serverSocket = new ServerSocket(8088);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("服务端启动完毕");
    }

    public void start() {
        try {

            while (true) {

                System.out.println("等待客户端连接");
                Socket socket = serverSocket.accept();
                System.out.println("一个客户端连接了");
                Runnable handle=new ClientHandle(socket);
                Thread t=new Thread(handle);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
    private class ClientHandle implements Runnable{
        private Socket socket;
        private String host;

        public ClientHandle(Socket socket) {
            this.socket = socket;
            host=socket.getInetAddress().getHostAddress();
        }

        @Override
        public void run() {
            try {
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(host+"说" + line);

                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
