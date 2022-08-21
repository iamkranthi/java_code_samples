import java.util.Scanner;

public class Factorial_method {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = factorial(n);
        System.out.println("Factorial is " + ans);
        in.close();
    }

    static int factorial(int num) {
        int fact = 1;
        if (num == 0 || num == 1) {
            return 1;
        }
        while (num > 0) {
            fact = fact * num;
            num -= 1;
        }
        return fact;
    }

}