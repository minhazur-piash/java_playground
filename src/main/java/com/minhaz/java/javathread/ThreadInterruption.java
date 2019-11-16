package com.minhaz.java.javathread;

public class ThreadInterruption {

    static String message;

    private static class CorrectorThread extends Thread {
        public void run() {
            setName(getClass().getSimpleName());

            int i = 0;
            while (true) {
                System.out.println(getName() + "is running. i is: " + ++i);
                if (isInterrupted()) {
                    System.out.println( getName() + " isInterrupted. Terminated.");
                    return;
                }
            }
        }
    }

    private static class SleepingBeautyThread extends Thread {
        public void run() {
            setName(getClass().getSimpleName());

            int i = 65;
            while (true) {  // thread will be running, even after calling interrupt() and receiving InterruptedException.
                try {
                    System.out.println(getName() + " is running. Char is: " + (char)i);
                    i++;
                    sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(getName() + " sleep interrupted. Message: " + e.getMessage());
                    e.printStackTrace();
                    //return //returning from here will stop the thread.
                }
            }
        }
    }

    public static void main(String[] args) {
        CorrectorThread correctorThread = new CorrectorThread();
        correctorThread.start();
        correctorThread.interrupt();  // doesn't stop thread. Just asks politely to stop.
        System.out.println("correctorThread's state = " + correctorThread.getState());

//        System.out.println("=============");

        SleepingBeautyThread sleepingBeautyThread = new SleepingBeautyThread();
        sleepingBeautyThread.start();
        System.out.println("sleepingBeautyThread's state = " + sleepingBeautyThread.getState());
        sleepingBeautyThread.interrupt();   //doesn't stop thread. Just asks politely to stop.
        System.out.println("sleepingBeautyThread's state = " + sleepingBeautyThread.getState());
    }
}
