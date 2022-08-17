import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rem = 0;
        int sum = 0;
        while (n > 0) {
            rem = n % 10;
            sum += rem;
            n /= 10;

        }
        System.out.println(sum);
        in.close();
    }
}
