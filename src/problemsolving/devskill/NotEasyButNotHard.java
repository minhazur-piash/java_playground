package problemsolving.devskill;



import java.util.Scanner;

/**
 * Created by minhazur on 10/1/16.
 */
public class NotEasyButNotHard {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        for (int tc = 1; tc <= cases; tc++) {
            long input = scanner.nextLong();
            System.out.println((input * (input + 1))/2);
        }


    }
}
