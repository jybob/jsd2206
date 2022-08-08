//package socket1;
//
//import java.io.*;
//import java.net.Socket;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Client {
//    private Socket socket;
//    private PrintWriter[] allout={};
//    public Client() {
//        System.out.println("等待连接服务器");
//        System.out.println("正在连接服务器，请稍后");
//        System.out.println("服务器连接成功");
//    }
//    public static void main(String[] args) {
//      Client client=new Client();
//      client.start();
//    }
//    public void start(){
//        serverHandle c=new serverHandle();
//        Thread t1=new Thread(c);
//        t1.setDaemon(true);
//        t1.start();
//        Scanner scan=new Scanner(System.in);
//        try {
//            while(true){
//            OutputStream out=socket.getOutputStream();
//            OutputStreamWriter osw=new OutputStreamWriter(out);
//            BufferedWriter br=new BufferedWriter(osw);
//            PrintWriter pw=new PrintWriter(br);
//            String str=scan.nextLine();
//                allout= Arrays.copyOf(allout,allout.length+1);
//                allout[allout.length-1]=pw;
//                if("exit".equalsIgnoreCase(str)){
//                    break;
//                }
//                for (int i = 0; i < allout.length; i++) {
//                    PrintWriter printWriter = allout[i];
//                    printWriter.println(str);
//                }
//
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                socket.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
//
//
//    }
//    public class  serverHandle implements Runnable{
//        @Override
//        public void run() {
//
//
//        }
//    }
//
//
//}
