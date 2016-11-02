package problemsolving.codingbat;


/**
 * Created by minhazur on 10/31/16.
 * http://codingbat.com/prob/p101409
 */

public class Count7 {
    public static void main(String[] args) {
        System.out.println(new Count7().count(878));
    }

    /**
     *
     * @param n non-negative integer n.
     * @return number of 7 found in n. Ex: 717 ==> 2
     */
    public int count7(int n) {
        if (n == 0) {
            return 0;
        }

        return count(n % 10) + count7(n / 10);
    }

    public int count(int n) {
        if (n == 7) {
            return 1;
        }

        return 0;
    }
}
