package com.minhaz.java.java8;

import java.util.concurrent.Callable;

public class Experiment {
    public static void main(String[] args) {

        Runnable runnable = () -> {
            System.out.println("runnable running");
        };

        // Experiment::isOrthogonal is equal to () -> { Experiment.isOrthogonal(); }
        Thread t = new Thread(Experiment::isOrthogonal);
        t.start();

    }

    public static boolean isOrthogonal() {
        System.out.println("isOrthogonal called");
        return false;
    }
}

interface FunctionalInterface {
    String toString();
}
