package thread;

public class InterruptTest {

    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = new Runnable() {
            public void run() {
                while(true){
                    boolean bool = Thread.currentThread().isInterrupted();
                    System.out.println(Thread.currentThread().getName() + "线程是否中断：" + bool);
                    if(bool){
                        System.out.println(Thread.currentThread().getName() + "线程阻塞");
                        return;
                    }
                }
            }
        };

        Thread thread = new Thread(runnable, "Thread-test");
        thread.start();
        Thread.sleep(2);
        thread.interrupt();

    }

}
