package thread;

class Mythread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <1000; i++) {

            System.out.println("你是谁啊？");
        }

    }
}

class Mythread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("开门，查水表的");

        }

    }
}