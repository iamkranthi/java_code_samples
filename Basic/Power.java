import java.util.Scanner;
import java.lang.Math;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base and exponent values");
        int b = in.nextInt();
        int e = in.nextInt();
        int pow = (int)Math.pow(b, e);
         System.out.println(pow);
            in.close();
    }
}
