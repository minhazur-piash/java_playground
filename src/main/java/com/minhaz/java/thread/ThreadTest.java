package com.minhaz.java.thread;

public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("===> main started");

        // JVM doesn't wait for a daemon thread to be finished
        startDaemonThread();

        // JVM waits for a normal thread to be finished
//        startNormalThread();

        System.out.println("===> is daemon thread " + Thread.currentThread().isDaemon());
    }

    private static void startDaemonThread() {
        Thread thread = new Thread(() -> {
            int i = 0;
            while (true) {
                System.out.print(Thread.currentThread().getName() + " " + i++ + " ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setDaemon(true);
        thread.setName("Daemon");
        thread.start();
    }

    private static void startNormalThread() {
        Thread thread = new Thread(() -> {
            int i = 0;
            while (true) {
                System.out.print(Thread.currentThread().getName() + " " + i++ + " ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setName("Normal");
        thread.start();
    }
}
