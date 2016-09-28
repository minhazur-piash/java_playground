package problemsolving;

import java.util.Scanner;

/**
 * Created by minhazur on 9/4/16.
 */
class GreetingFromLightOJ { //TODO: need to change class name to Main before submitting

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        //input.nextLine();

        for (int i = 1; i <= cases; i++) {

            int pr1 = input.nextInt();
            int pr2 = input.nextInt();

            int sumOfProblems = pr1 + pr2;
            System.out.println("Case " + i + ": " + sumOfProblems);
        }
    }
}
