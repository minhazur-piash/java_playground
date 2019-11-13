package reactive;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

public class Launcher {
    public static void main(String[] args) {
        Observable<String> stringsObservable = Observable.just("Mango", "Jackfruit", "Apple");
        // System.out::println is equal to (x) -> { System.out.println(x); }
        stringsObservable.subscribe(System.out::println);

        stringsObservable.map(String::length)
                .subscribe(System.out::println);

        testTimerObservable();
    }

    private static void testTimerObservable() {
        Observable<Long> secondIntervalObservable = Observable.interval(1, TimeUnit.SECONDS);
        secondIntervalObservable.subscribe(s -> {
            System.out.println(s);
        });
        /* Hold main thread for 5 seconds so Observable above has chance to fire */
        sleep(5000);
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
