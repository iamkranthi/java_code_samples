import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number ");
        int n = in.nextInt(), p = 0;
        for (int i = 2; (i*i) < n; i++) {
            p = n %i;
        }
        if (p == 0) {
            System.out.println(n + " is not a prime number");
        } else {
            System.out.println(n + " is prime number");
        }
       
        in.close();
    }
}
