package thread;

public class NameTest {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("这是线程");
            }
        },"Thread-user1");

        System.out.println("thread1线程的名称为：" + thread1.getName());

        thread1.setName("Thread-newName");

        System.out.println("thread1线程的名称为：" + thread1.getName());

    }

}
