package playground;

class TestSync implements Runnable {
    private  int balance;

    public void run() {
        for (int i = 0; i < 50; i++) {
            increment();
            System.out.println(Thread.currentThread().getName() + " balance is " + balance);
        }
    }

    public void increment() {
        int i = balance;
        balance = i + 1;
    }
}

public class TestSyncTest {
    public static void main(String[] args) {
        TestSync job = new TestSync();
        Thread a = new Thread(job);
        a.setName("A");

        Thread b = new Thread(job);
        b.setName("B");

        a.start();
        b.start();
    }
}

