package thread;

public class SleepDemo2 {
    public static void main(String[] args) {
        Thread Lin=new Thread("林永健"){
            @Override
            public void run() {
                System.out.println(getName()+":刚美完容，睡一会吧");
                try {
                    Thread.sleep(5000000);
                } catch (InterruptedException e) {
                    System.out.println(getName()+":干嘛呢，干嘛呢，破了相了都");
                }
                System.out.println(getName()+":醒了");
            }
        };
        Thread Huang=new Thread("黄大锤"){
            @Override
            public void run() {
                System.out.println("大锤80，小锤40，开始工作");
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(1000);
                        System.out.println("80,80");
                    } catch (InterruptedException e) {

                    }
                }
                    System.out.println("哐哐，大哥搞定");
                    Lin.interrupt();
            }
        };
        Lin.start();
        Huang.start();



    }
}
