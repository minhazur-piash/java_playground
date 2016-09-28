package problemsolving;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by minhazur on 9/24/16.
 */
public class IntegerDivisibility {

    public static void main(String[] args) {

        String example = "A";
        byte[] bytes = example.getBytes();
        System.out.println(bytes.length);


        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        for (int t = 1; t <= tc; t++) {
            int multipleOf = scanner.nextInt();
            int targetDigit = scanner.nextInt();
            int i = 1, digit = targetDigit;
            int remainder = targetDigit % multipleOf;
            while (remainder != 0) {
                remainder = ((remainder * 10) + digit) % multipleOf;
                System.out.println(remainder);
                i++;
            }

            System.out.println("Case " + t + ": " + i);
        }
    }


    public static int getLengthFromByte(String str) {
        int sum=0;
        int newLineCounter = 0;
        //String[] splitedString = string.split("\n");

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '\n'){
                newLineCounter++;
                continue;
            }
            try {
                sum += (str.charAt(i) + "").getBytes("UTF-8").length == 1 ? 1 : (str.charAt(i) + "").getBytes("UTF-8").length - 1;
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return 0;
            }
        }

        int count = str.getBytes().length;
        //return sum + ((splitedString.length -1) * 2);
        return sum + (newLineCounter * 2);

    }
}
