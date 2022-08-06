package jy;

import java.util.Random;

public class Practice {
    public static void main(String[] args) {
        sleep1 a=new sleep1();

        a.run();

    }
}
class sleep1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            int s= new Random().nextInt(10);
            try {
                Thread.sleep(s*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("该任务睡眠了"+s+"秒");
        }

    }
}