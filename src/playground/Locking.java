package playground;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minhazur on 10/6/16.
 */
public class Locking {
    public static void main(String[] args) {

        Adder adder = new Adder();
        adder.add(1);
        adder.add(2);
        adder.add(3);
        adder.add(4);


        new Thread(new Runnable() {
            int i = 1;
            @Override
            public void run() {
                while (true) {
                    adder.add(i++);
                }
            }
        }).start();

//        adder.removeLast();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    adder.removeLast();

                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        adder.show();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }).start();


    }


}


class Adder {
    List<Integer> items = new ArrayList<>();

    public synchronized void add(Integer integer) {
        System.out.println("adding");
        items.add(integer);

        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void removeLast() {
        System.out.println("removing");
//        items.remove(items.size() - 1);
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void show() throws InterruptedException {
//        Iterator<Integer> iterator = items.iterator();
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }

        System.out.println("showing");
        Thread.sleep(500);
    }
}