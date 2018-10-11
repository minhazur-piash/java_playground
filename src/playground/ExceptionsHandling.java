package playground;

/**
 * Created by minhazur on 10/19/16.
 */
public class ExceptionsHandling {

    public static void main(String[] args) {
        System.out.print(method3());
    }

    static void method1() {
        method2();
    }

    static void method2() {
        String str = null;
        str.toString();
    }

    static String method3() {
        String str = null;

        try {
            str.toString();
//            throw new Exception("Hello");
            return "in try";

        } catch (Exception e) {
            e.printStackTrace();
            return "in catch";
        } finally {
            return "in finally";
        }

        // return str; //Unreachable statement
    }
}
