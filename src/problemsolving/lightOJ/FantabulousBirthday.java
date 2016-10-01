package problemsolving.lightoj;

import java.util.Scanner;

/**
 * Created by minhazur on 9/7/16.
 */
public class FantabulousBirthday {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();

        for (int tc = 1; tc <= cases; tc++) {


            long second = scanner.nextLong();
            double maxRoot = Math.sqrt(second);

            if (maxRoot > Math.floor(maxRoot)) {
                maxRoot += 1;
            }

            long nearestMaxRoot = (int) maxRoot;
            long nearestMinRoot = nearestMaxRoot - 1;

            long endSecond = (nearestMaxRoot * nearestMaxRoot);
            long startSecond = (nearestMinRoot * nearestMinRoot) + 1;
            long middleSecond = (startSecond + endSecond) / 2;

//            System.out.println(endSecond + " " + middleSecond);


            long column;
            long row;

            if (endSecond % 2 == 0) {
                if (second > middleSecond) {
                    column = nearestMaxRoot;
                    row = column - (second - middleSecond);

                } else {
                    row = nearestMaxRoot;
                    column = row - (middleSecond - second);
                }

            } else {
                if (second > middleSecond) {
                    row = nearestMaxRoot;
                    column = row - (second - middleSecond);

                } else {
                    column = nearestMaxRoot;
                    row = column - (middleSecond - second);
                }
            }


            System.out.println("Case " + tc + ": " + column + " " + row);

        }
    }
}
