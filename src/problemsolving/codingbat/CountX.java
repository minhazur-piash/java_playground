package problemsolving.codingbat;

/**
 * Created by minhazur on 11/2/16.
 * http://codingbat.com/prob/p170371
 */
public class CountX {

    public static void main(String[] args) {
        System.out.println(countX(""));
    }

    public static int countX(String str) {
        if (str.equals("")) {
            return 0;
        }

        return count(str.charAt(0)) + countX(str.substring(1));
    }

    public static int count(Character c) {
        if (c.equals(new Character('x'))) {
            return 1;
        }

        return 0;
    }
}
