import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float num1 = in.nextFloat();
        float num2 = in.nextFloat();
        char ch = in.next().trim().charAt(0);
        if (ch == '+') {
            System.out.println(num1 + num2);
        } else if (ch == '-') {
            System.out.println(num1 - num2);
        } else if (ch == '*') {
            System.out.println(num1 * num2);
        } else if (ch == '/') {
            System.out.println(num1 / num2);
        } else if (ch == '%') {
            System.out.println(num1 % num2);
        }
        in.close();
    }
}
