import java.util.Scanner;

public class Permutation_combinations {
    static int factorial(int n) {
        int fact = 1, i = 1;
        while (i <= n) {
            fact *= i;
            i++;

        }
        return fact;
    }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int r = in.nextInt();
            int p = factorial(n)/(factorial(n-r));
            int c= factorial(n)/(factorial(r)*factorial(n-r));
            System.out.println(p);
            System.out.println(c);

            System.out.println();
            in.close();
        }
    
}
