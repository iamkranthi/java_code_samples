import java.util.Scanner;

public class Prime_method {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println("The given number is Prime");
        } else {
            System.out.println("The given number is not Prime");
        }
        sc.close();

    }

    public static Boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
