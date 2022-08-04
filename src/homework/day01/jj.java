package homework.day01;

public class jj {
    public static void main(String[] args) {
        Runnable r1=new Runnable() {
        @Override
        public void run() {
            System.out.println("aaa");
        }
    };
        Thread t1=new Thread(){
            @Override
            public void run() {
                System.out.println("bbb");
            }
        };
        Thread t2=new Thread(r1);
        t2.start();
        t1.start();
    }
}
