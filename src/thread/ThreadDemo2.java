package thread;

public class ThreadDemo2 {
    public static void main(String[] args) {
        Runnable t1=new MyRunnable1();
        Runnable t2=new MyRunnable2();
        Thread s1=new Thread(t1);
        Thread s2=new Thread(t2);
        s1.start();
        s2.start();

    }
}
class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("你是谁啊？");

        }
    }
}
class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {

            System.out.println("开门，查水表的");
        }

    }
}