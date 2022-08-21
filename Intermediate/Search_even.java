

import java.util.Arrays;
import java.util.Scanner;

public class Search_even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int ans = even_search(arr);
        System.out.println(ans);

        in.close();

    }

    static int even_search(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 0) {
                if (arr[i] % 2 == 0) {
                    sum += 1;
                }
            }
        }
        return sum;
    }

}
