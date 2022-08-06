package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * 聊天室服务端
 */
public class Server {
    /*
        运行在服务端的ServerSocket,主要作用两个:
        1:开启服务端口,客户端就是通过这个端口与服务端建立连接的.(ServerSocket构造方法)
        2:监听该端口,一旦一个客户端连接时,就会返回一个Socket实例与其通讯.(accept()方法的作用)
     */
    private ServerSocket serverSocket;
    private PrintWriter[] allOut = {};

    public Server() {
        try {
            System.out.println("正在启动服务端...");
            /*
                如果执行下面代码出现异常:
                java.net.BindException:address already in use
                原因是申请的8088端口已经被系统其它程序占用了.
             */
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {

        try {
            while (true) {
                System.out.println("等待客户端连接...");
                Socket socket = serverSocket.accept();//阻塞方法
                System.out.println("一个客户端连接了!");
                //启动一个线程负责处理该客户端交互
                ClientHandler handler = new ClientHandler(socket);
                Thread t = new Thread(handler);
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

    /**
     * 该线程任务负责与指定客户端进行交互
     */
    private class ClientHandler implements Runnable {
        private Socket socket;
        private String host;//记录当前对应客户端的IP地址

        public ClientHandler(Socket socket) {
            this.socket = socket;
            //通过socket获取远端计算机IP地址(获取到了客户端的)
            host = socket.getInetAddress().getHostAddress();

        }


        public void run() {
            PrintWriter pw = null;
            try {

                //通过刚接受连接的socket,获取输入流来读取该客户端发送过来的消息
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                OutputStream out = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
                BufferedWriter bw = new BufferedWriter(osw);
                pw = new PrintWriter(bw, true);
                synchronized (Server.this) {
                    allOut = Arrays.copyOf(allOut, allOut.length + 1);
                    allOut[allOut.length - 1] = pw;
                }
                System.out.println(host + "上线了，当前在线人数:" + allOut.length);

                String line;
                while ((line = br.readLine()) != null) {
                    sendMessage(host + "说" + line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                synchronized (Server.this) {
                    for (int i = 0; i < allOut.length; i++) {
                        if (pw == allOut[i]) {

                            allOut[i] = allOut[allOut.length - 1];
                            allOut = Arrays.copyOf(allOut, allOut.length - 1);

                            break;
                        }
                    }
                }
                sendMessage(host + "下线了,当前在线人数为" + allOut.length);
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    private void sendMessage(String message) {
        System.out.println(message);
        synchronized (Server.this) {
            for (int i = 0; i < allOut.length; i++) {
                allOut[i].println(message);

            }
        }
    }
}