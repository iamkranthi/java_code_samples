import java.util.Scanner;

public class Natrual_numbers_method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n natrual number");
        int n = in.nextInt();
        System.out.println("Sum of natrual numbers upto "+n+" is: " + natrual_numbers_sum(n) + " ");
        in.close();
    }

    static int natrual_numbers_sum(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            sum += i;
        }
        return sum;
    }
}
