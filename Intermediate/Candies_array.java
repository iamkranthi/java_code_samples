import java.util.Scanner;

public class Candies_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter array length");
        int n = in.nextInt();
        System.out.println("enter array elements");
        int[] candies = new int[n];
        for (int i = 0; i < candies.length; i++) {
            candies[i]=in.nextInt();
            
        }
        System.out.println("enter array elements");
        int extraCandies = in.nextInt();

        int max_value = Integer.MAX_VALUE;

        int[] max = new int[candies.length];
        String[] res = new String[candies.length];
        for (int i = 0; i < candies.length; i++) {

            max[i] = candies[i] + extraCandies;
            if (max[i] >= max_value) {
                res[i] = "true";
            } else
                res[i] = "false";

        }
        System.out.println(res);
        in.close();
    }
}
