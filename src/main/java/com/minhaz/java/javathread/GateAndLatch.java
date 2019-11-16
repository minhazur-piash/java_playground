package com.minhaz.java.javathread;

import java.util.concurrent.CountDownLatch;

public class GateAndLatch {

    public static void main(String[] args) throws InterruptedException {
        TestHarness testHarness = new TestHarness();
        long time = testHarness.timeTasks(3, () -> {
            System.out.println("Task run....");
        });
        System.out.println("time = " + time);

    }
}

class TestHarness {

    long timeTasks(int nThreads, final Runnable task) throws InterruptedException {
        final CountDownLatch startGate = new CountDownLatch(1);
        final CountDownLatch endGate = new CountDownLatch(nThreads);

        for (int i = 0; i < nThreads; i++) {
            Thread t = new Thread(() -> {
                try {
                    System.out.println("===> waiting on start gate.");
                    startGate.await();
                    try {
                        task.run();
                    } finally {
                        endGate.countDown();
                    }

                } catch (InterruptedException ignored) {
                }

            });
            t.start();
        }

        long start = System.nanoTime();
        startGate.countDown();
        System.out.println("===> main thread is waiting on end gate.");
        endGate.await();
        long end = System.nanoTime();
        return end - start;
    }

}
