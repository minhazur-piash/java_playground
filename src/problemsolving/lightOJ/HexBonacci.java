package problemsolving.lightoj;

import java.util.Scanner;

/**
 * Created by minhazur on 9/6/16.
 */

public class HexBonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();

        for (int tc = 1; tc <= cases; tc++) {

            long[] sum = new long[10005];
            int n;

            for (int i = 0; i < 6; i++) {
                sum[i] = scanner.nextInt();
            }

            n = scanner.nextInt();

            for (int i = 6; i <= n; i++) {
                sum[i] = (sum[i - 1] + sum[i - 2] + sum[i - 3] + sum[i - 4] + sum[i - 5] + sum[i - 6]) % 10000007;
            }

            System.out.println("Case " + tc + ": " + (sum[n] % 10000007));
        }


    }
}
