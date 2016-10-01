package problemsolving.hackerearth;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by minhazur on 2/24/16.
 */
public class MonkLoveFood {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int queriesCount;
        queriesCount = input.nextInt();

        Stack<Integer> preparedItems = new Stack<>();

        for (int i = 1; i <= queriesCount; i++) {
            int query = input.nextInt();

            if (query == 1) {
                String toShow = preparedItems.isEmpty() ? "No Food" : preparedItems.pop().toString();
                System.out.println(toShow);

            } else if (query == 2) {
                preparedItems.push(input.nextInt());
            }
        }

    }
}
