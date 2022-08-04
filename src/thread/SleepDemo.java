package thread;

import java.util.Scanner;

public class SleepDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("程序开始了");
        int a=scanner.nextInt();
        for (int i=a;i>0;i--) {
            try {
                Thread.sleep(1000);
                a--;
                System.out.println(a);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("时间到");

    }
}
