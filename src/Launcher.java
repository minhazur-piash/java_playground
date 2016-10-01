import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/**
 * Created by Frenclub on 7/29/15.
 */
public class Launcher {
    String name;
    int v[] = {10, 20, 40, 55, 60, 69, 100};


    public static void main(String[] args) {
        Launcher launcher = new Launcher();

        Integer[] sols = {1, 2, 3};

        System.out.print(Arrays.asList(sols).contains(1));

        Thread thread = new Thread();
        launcher.recFind(1, 0, launcher.v.length - 1);
    }

    int recFind(double searchKey, int lowerBound, int upperBound) {
        System.out.println("lower bound: " + lowerBound + " upper bound: " + upperBound);
        int curIn;
        curIn = (lowerBound + upperBound) / 2;
        if (v[curIn] == searchKey)
            return curIn;               //found it
        else if (lowerBound > upperBound)
            return -1;
        else {
            if (v[curIn] < searchKey)
                return recFind(searchKey, curIn + 1, upperBound);
            else                        //it’s in lower half
                return recFind(searchKey, lowerBound, curIn - 1);
        }  //end else divide range
    }  //end recFind()


    static int find(double searchKey) {
        int[] v = {1, 2, 3, 4, 5, 9, 12};
        int lowerBound = 0;
        int upperBound = v.length - 1;
        int curIn;
        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            System.out.println("Current index: " + curIn);
            if (v[curIn] == searchKey)
                return curIn;              //found it
            else if (lowerBound > upperBound)
                return -1;             //can’t find it
            else                          //divide range
            {
                if (v[curIn] < searchKey)
                    lowerBound = curIn + 1; //it’s in upper half
                else
                    upperBound = curIn - 1; //it’s in lower half
            }  //end else divide range
        } //end while
    }  //end find()


    public static String getMD5(String s) {

        try {

            // Create MD5 Hash
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update("minhaz".getBytes());
            byte messageDigest[] = digest.digest();

            // Create Hex String
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < messageDigest.length; i++) {
                String hex = Integer.toHexString(0xFF & messageDigest[i]);
                if (hex.length() == 1)
                    hexString.append('0');
                hexString.append(hex);
            }
            System.out.println(hexString.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }


    public static String Encrypt(String s) {
        try {

            // Create MD5 Hash
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(s.getBytes());
            byte messageDigest[] = digest.digest();

            // Create Hex String
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < messageDigest.length; i++)
                hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";

    }

    private static Map<String, Object> getStringObjectMap() {
        Map<String, Object> stringObjectHashMap = new HashMap<>(100);

        stringObjectHashMap.put("1", new Object());

        stringObjectHashMap.put("3", new Object());
        stringObjectHashMap.put("4", new Object());
        return stringObjectHashMap;
    }

    private static String getTimeDifferenceFromNowInFormat(long createdTime) {

        long currentTime = getCurrentSystemTime();
        long timeDiffInMillis = currentTime - createdTime;

        long secondDif = timeDiffInMillis / 1000;

        long minDif = secondDif / 60;

        if (minDif < 1) {
            return "just now";
        } else if (minDif < 60) {
            return minDif + " mins ago";
        }

        long hourDiff = minDif / 60;
        if (hourDiff < 2) {
            return hourDiff + "  ago";
        } else if (hourDiff < 24) {
            return hourDiff + " hours ago";
        }

        long dayDiff = hourDiff / 24;
        if (dayDiff < 2) {
            return dayDiff + " day ago";

        } else if (dayDiff < 30) {
            return dayDiff + " days ago";

        } else if (dayDiff < 365) {
            long montDif = dayDiff / 30;
            return montDif + " months ago";

        } else if (dayDiff > 365) {
            return "1 year ago";
        }

        return "just now";
    }

    public static long getCurrentSystemTime() {
        return System.currentTimeMillis();
    }


    private static List<String> getSelectedCountries() {
        List<String> countries = new ArrayList<String>();
        countries.add("Bangladesh");
        countries.add("Bangladesh");
        countries.add("Bangladesh");
        countries.add("Bangladesh");
        countries.add("Bangladesh");

        return countries;
    }

    private static void threadingTestDrive() {
        TestSync job = new TestSync();

        Thread alpha = new Thread(job);
        alpha.setName("ALPHA");

        Thread beta = new Thread(job);
        beta.setName("BETA");

        alpha.start();
        System.out.println("is running: " + job.isRunning());

        beta.start();
        System.out.println("is running: " + job.isRunning());
    }

    private static void geometricProgressionTestDrive() {
        for (int i = 1; i < 10; i++) {
            int val = (int) (2 * Math.pow(2, i));
            System.out.println(val + " ");
        }
    }

    private static void outputTracing() {
        String emailsInCsv = "m@m.com,m@m.com,m@m.com,m@m.com,m@m.com,m@m.com,";
        String[] emails = emailsInCsv.split(",");

        for (int i = 0; i < emails.length; i++) {
            System.out.print(emails[i] + " ");
        }
        System.out.println();
        showOutput();

        String input, output;

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter anything even \\");
        input = reader.next();
        output = input;
        System.out.println(" input is " + input + " output is " + output);
    }

    static void showOutput() {
        int y = 7;
        for (int x = 1; x < 8; x++) {
            y++;
            if (x > 4) {
                System.out.print(++y + " ");
            }
            if (y > 14) {
                System.out.println(" x = " + x);
                break;
            }
        }
        System.out.println(1 + 2 + " = " + 1 + 2);
    }
}



