package problemsolving;

import java.util.Scanner;

/**
 * Created by minhazur on 9/10/16.
 */

public class Brush {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tc = scanner.nextInt();

        for (int i = 1; i <= tc; i++) {
            int noOfStudents = scanner.nextInt();
            int sumOfDustUnit = 0;

            for( int j = 0; j < noOfStudents; j++) {
                int dustUnit = scanner.nextInt();

                if (dustUnit > 0) {
                    sumOfDustUnit += dustUnit;
                }
            }

            System.out.println("Case " + i + ": " + sumOfDustUnit );
        }
    }
}
