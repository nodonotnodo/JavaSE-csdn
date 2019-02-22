package thread;

public class YieldTest {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            public void run() {
                for(int i=0; i<5; i++){
                    Thread.yield();
                    System.out.println(Thread.currentThread().getName() + "线程打印的： i = " + i);
                }
            }
        };

        new Thread(runnable,"Thread-test1").start();
        new Thread(runnable,"Thread-test2").start();
        new Thread(runnable,"Thread-test3").start();

    }

}
