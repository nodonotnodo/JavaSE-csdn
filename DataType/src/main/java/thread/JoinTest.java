package thread;

public class JoinTest {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            public void run() {
                String name = Thread.currentThread().getName();
                synchronized (this){
                    Thread.yield();
                    System.out.println(name + "执行");
                }
            }
        };

        Thread thread1 = new Thread(runnable,"Thread-test1");
        Thread thread2 = new Thread(runnable,"Thread-test2");
        Thread thread3 = new Thread(runnable,"Thread-test3");
        Thread thread4 = new Thread(runnable,"Thread-test4");
        Thread thread5 = new Thread(runnable,"Thread-test5");

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
        thread4.start();
        thread4.join();
        thread5.start();
        thread5.join();
    }

}
