package thread;

public class SleepTest {

    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = new Runnable() {

            private volatile int i = 0;

            public void run() {
                for(;;){
                    Thread thread = Thread.currentThread();
                    synchronized (this){
                        i++;
                        if(i<6){
                            System.out.println(thread.getName() + "线程。。。" + i);
                        }else {
                            while(true){
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                }
            }
        };

        Thread thread1 = new Thread(runnable,"Thread-test1");
        Thread thread2 = new Thread(runnable,"Thread-test2");
        thread1.start();
        thread2.start();

    }

}
