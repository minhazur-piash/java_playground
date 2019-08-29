package coursera.princeton.algorithm.permutation;

import edu.princeton.cs.algs4.StdIn;

public class Permutation {

    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);

        RandomizedQueue<String> randomizedQueue = new RandomizedQueue<>();

        while (!StdIn.isEmpty()) {
            String string = StdIn.readString();
            randomizedQueue.enqueue(string);
        }

        int i = 0;
        for (String item : randomizedQueue) {
            if (i == k) {
                break;
            }
            System.out.println(item);
            i++;
        }
    }

    /*private static void takeInputFromFileAndTest(int k) {
        RandomizedQueue<String> randomizedQueue = new RandomizedQueue<>();
        String filePath = "/Users/minhaz/Books/DSA/Algorithms_Pt-1_Coursera/queues/duplicates.txt";

        FileUtils.readFile(filePath, line -> {
            line = line.replaceAll("\\s+", " ").trim();
            System.out.println(line);
            String[] words = line.split(" ");
            System.out.println(Arrays.toString(words));
            for (String word : words) {
                randomizedQueue.enqueue(word);
            }
        });

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();

        }

        int i = 0;
        for (String item : randomizedQueue) {
            if (i == k) {
                break;
            }
            System.out.println(item);
            i++;
        }
    }*/
}
