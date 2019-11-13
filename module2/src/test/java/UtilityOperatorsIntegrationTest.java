import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.awaitility.Awaitility.await;
import static org.junit.Assert.assertTrue;

public class UtilityOperatorsIntegrationTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    private int emittedTotal = 0;
    private int receivedTotal = 0;
    private String result = "";

    @Test
    public void givenObservable_whenObserveOnAfterOnNext_thenEmitsEventsOnComputeScheduler() throws InterruptedException {

        Observable.range(1, 5)
                .map(i -> i * 100)
                .doOnNext(i -> {
                    emittedTotal += i;
                    System.out.println("Emitting " + i
                            + " on thread " + Thread.currentThread().getName());
                })
                .observeOn(Schedulers.computation())
                .map(i -> i * 10)
                .subscribe(i -> {
                    receivedTotal += i;
                    System.out.println("Received " + i + " on thread "
                            + Thread.currentThread().getName());
                });

        await().until(() -> {
                    assertTrue(emittedTotal == 1500);
                    assertTrue(receivedTotal == 15000);
                    return null;
                }
        );
    }

    @Test
    public void givenObservable_whenObserveOnBeforeOnNext_thenEmitsEventsOnComputeScheduler() throws InterruptedException {

        Observable.range(1, 5)
                .map(i -> i * 100)
                .observeOn(Schedulers.computation())
                .doOnNext(i -> {
                    emittedTotal += i;
                    System.out.println("Emitting " + i
                            + " on thread " + Thread.currentThread().getName());
                })
                .map(i -> i * 10)
                .subscribe(i -> {
                    receivedTotal += i;
                    System.out.println("Received " + i + " on thread "
                            + Thread.currentThread().getName());
                });

        await().until(() -> {
            assertTrue(emittedTotal == 1500);
            assertTrue(receivedTotal == 15000);
            return null;
        });
    }

    @Test
    public void givenObservable_whenSubscribeOn_thenEmitsEventsOnComputeScheduler() throws InterruptedException {

        Observable.range(1, 5)
                .map(i -> i * 100)
                .doOnNext(i -> {
                    emittedTotal += i;
                    System.out.println("Emitting " + i
                            + " on thread " + Thread.currentThread().getName());
                })
                .doOnNext( i -> {
                    System.out.println("Emitting again " + i
                            + " on thread " + Thread.currentThread().getName());
                })
                .observeOn(Schedulers.io())
                .subscribeOn(Schedulers.computation())
                .map(i -> i * 10)
                .doOnNext(i -> {
                    emittedTotal += i;
                    System.out.println("Emitting " + i
                            + " on thread " + Thread.currentThread().getName());
                })
                .subscribe(i -> {
                    receivedTotal += i;
                    System.out.println("Received " + i + " on thread "
                            + Thread.currentThread().getName());
                });

        await().until(() -> {
            assertTrue(emittedTotal == 1500);
            assertTrue(receivedTotal == 15000);
            return null;
        });
    }
}

