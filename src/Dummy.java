import java.util.Scanner;

/**
 * Created by minhazur on 5/17/16.
 */
public class Dummy {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int cn = 0, cp = 0, s = 0;
        System.out.println("Enter number, the input ends if it is 0: ");
        int uIn = i.nextInt();
        while (uIn != 0){
            if(uIn < 0){
                cn++;s += uIn;
                System.out.println("Enter number, the input ends if it is 0: ");
                uIn=i.nextInt();
            } if(uIn > 0){
                cp++; s += uIn;
                System.out.println("Enter number, the input ends if it is 0: ");
                uIn = i.nextInt();
            }
        }
        System.out.println("tol" + s);
        float average = s / (cp + cn);
        System.out.println("avg is" + average);
    }

}
