import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class RxTest {
    private static Integer emittedTotal = 0;
    private static Integer receivedTotal = 0;

    public static void main(String[] args) {


//        testRandom();

        testSubscribeOnAndObserveOn();

    }

    private static void testRandom() {
        System.out.println("-------Just-----------");
        Observable<String> observable = Observable.just("Hello");
        observable.subscribe(
                System.out::println, //onNext
                Throwable::printStackTrace, //onError
                () -> System.out.println("onCompleted")  //onCompleted
        );


        System.out.println("will start");
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

        System.out.println("emittedTotal = " + emittedTotal);
    }

    private static void testSubscribeOnAndObserveOn() {
        Observable.range(1, 5)
                .map(i -> i * 100)
                .doOnNext(i -> {
                    System.out.println("Emitting " + i + " on thread " + Thread.currentThread().getName());
                })
                .doOnNext( i -> {
                    System.out.println("Emitting again " + i + " on thread " + Thread.currentThread().getName());
                })
                .observeOn(Schedulers.io())
                .subscribeOn(Schedulers.computation())
                .map(i -> i * 10)
                .doOnNext(i -> {
                    emittedTotal += i;
                    System.out.println("Emitting after subscribe on " + i + " on thread " + Thread.currentThread().getName());
                })
                .subscribe(i -> {
                    receivedTotal += i;
                    System.out.println("Received " + i + " on thread "
                            + Thread.currentThread().getName());
                });


        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
