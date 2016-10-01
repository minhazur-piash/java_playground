package problemsolving.hackerearth;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by minhazur on 2/24/16.
 */
public class MonkTask {

    public static void main(String[] args) {
        int numberOfProcess;
        int idealOrdering = 0;
        int timeTaken = 0;

        Queue<Integer> callingOrder = new LinkedList<>();
        int[] idealOrder = new int[1];

        Scanner input = new Scanner(System.in);
        while (true) {

            numberOfProcess = input.nextInt();
            idealOrder = new int[numberOfProcess];

            for (int i = 1; i <= numberOfProcess; i++) {
                callingOrder.offer(input.nextInt());
            }

            for (int i = 0; i < numberOfProcess; i++) {
                idealOrder[i] = input.nextInt();
            }

            while (!callingOrder.isEmpty()) {
                int order = callingOrder.poll();

                if (order == idealOrder[idealOrdering]) {
                    timeTaken++;
                    idealOrdering++;

                } else {
                    callingOrder.offer(order);
                    timeTaken++;
                }
            }

            System.out.println("time taken: " + timeTaken);

            idealOrdering = 0;
            timeTaken = 0;
        }
    }
}
