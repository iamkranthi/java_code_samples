import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int m = num1;
        int n = num2;
        while (m != n) {
            if (m > n) {
                m = m - n;
            } else {
                n = n - m;
            }
        }
        int x = (num1 * num2) / m;

        System.out.println("Hcf:" +m+" Lcm:"+x);
        in.close();
    }
}