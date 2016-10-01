import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by minhazur on 6/26/16.
 */
public class MathUtils {

    static  public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public void reverseNumber(int num) {

        int input = num;

        int[] number1 = new int[100];

        int i = 0;
        while (true) {
            number1[i] = input % 10;
            input = input / 10;

            if ( input < 10) {
                i++;
                number1[i] = input;
                break;
            }

            i++;
        }

        System.out.println(Arrays.toString(number1));

    }
}
