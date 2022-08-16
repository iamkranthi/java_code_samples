import java.util.Scanner;
import java.lang.Math;

public class Amstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.println();
         int num1=in.nextInt();
         int num2 = in.nextInt();
         for (int i = num1+1; i < num2; ++i) {
            int x = i;
            int n =0;
            while (x!=0) {
                x/=10;
                ++n;
            }
            int pow_sum=0;
            x = i;
            while (x != 0) {
                int digit = x % 10;
                pow_sum += Math.pow(digit, n);
                x /= 10;
            }
            if (pow_sum == i)
            System.out.println(i + " ");    

            
         }
            in.close();
    }
}
