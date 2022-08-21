import java.util.Arrays;
import java.util.Scanner;

public class Concentration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = in.nextInt();// length
        int[] num = new int[n];// array initialization
        System.out.println("Enter elements of array");
        for (int i = 0; i < num.length; i++) {// input of array
            num[i] = in.nextInt();
        }
        int[] ans = new int[2 * n];// doubled its size
        for (int i = 0; i < num.length; i++) {
            ans[i] = ans[i + n] = num[i];
        }

        System.out.println(Arrays.toString(ans));
        in.close();
    }
}
