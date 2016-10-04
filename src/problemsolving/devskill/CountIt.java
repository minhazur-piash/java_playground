package problemsolving.devskill;

import javax.xml.stream.events.Characters;
import java.util.*;

/**
 * Created by minhazur on 10/2/16.
 */
public class CountIt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        for (int tc = 1; tc <= cases; tc++) {
            String input = scanner.next();
            char[] chars = input.toCharArray();


            for(int i = 1; i < chars.length; i++) {
                char c = chars[i];
                int j = i;

                while (j > 0 && c < chars[j - 1]) {
                    chars[j] = chars[j - 1];
                    j--;
                }

                chars[j] = c;
            }

            input = new String(chars);

//            SortedMap<String, Integer> results = new TreeMap<>();

            System.out.println("Case " + tc + ":");
            while (!input.isEmpty()) {
                char ch = input.charAt(0);
                String alteredInput = input.replaceAll(Character.toString(ch), "");
                int count = input.length() - alteredInput.length();
                input = alteredInput;

//                results.put(Character.toString(ch), count);

                System.out.println(Character.toString(ch) + " " + count);
            }

         /*   for (Map.Entry<String, Integer> entry : results.entrySet()) {
                System.out.println(entry.getKey() + " " + results.get(entry.getKey()));
            }*/

        }

    }
}
