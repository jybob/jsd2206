package thread;

public class SyncDemo2 {
    public static void main(String[] args) {
        Shop shop=new Shop();
        Thread a=new Thread("我"){
            @Override
            public void run() {
                shop.buy();
            }
        };
        Thread b=new Thread("你"){
            @Override
            public void run() {
                shop.buy();
            }
        };
        a.start();
        b.start();
    }

}
class Shop{
    public void buy(){
        try {
            Thread t=Thread.currentThread();
            System.out.println(t.getName()+":正在挑选衣服...");
            Thread.sleep(5000);
            synchronized (this) {
                System.out.println(t.getName() + "正在试衣服...");
                Thread.sleep(5000);
            }

            System.out.println("结账离开");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}