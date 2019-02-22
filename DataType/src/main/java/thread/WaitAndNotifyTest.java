package thread;

public class WaitAndNotifyTest {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            public void run() {
                for(int i=0; i<10; i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(i == 2){
                        System.out.println(Thread.currentThread().getName() + "调用wait方法，开始等待");
                        try {
                            synchronized (this){
                                this.wait();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + "线程打印：i = " + i);
                }
            }
        };

        Thread thread1 = new Thread(runnable,"Thread-test");
        thread1.start();
        Thread.sleep(5000);
        synchronized (runnable){
            System.out.println("通知" + thread1.getName() + "线程");
            runnable.notify();
        }
    }

}
