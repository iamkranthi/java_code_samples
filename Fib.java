import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int i = 1;
        int b = 1;
        int temp = 0;
        while (i <= n) {
            System.out.print(" "+a+" ");
            temp = a + b;
            a = b;
            b = temp;
            i += 1;

        }

        in.close();
    }
}
