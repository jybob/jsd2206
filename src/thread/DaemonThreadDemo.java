package thread;

public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose=new Thread("rose"){
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    System.out.println(getName()+": let me go");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(getName()+":啊啊啊啊啊啊啊啊aaaaaaAAAAAA");
                System.out.println("扑通");
            }
        };
        Thread jack=new Thread("jack"){
            @Override
            public void run() {
                while (true) {
                    System.out.println("you jump,I jump");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };
        rose.start();
        jack.setDaemon(true);
        jack.start();

    }
}
