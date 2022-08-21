

import java.util.Scanner;

public class Search_range {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = { 4, 5, 7, 9, 0, 6 };
        int target = 0;

        System.out.println(search(arr, target, 1, 5));
        in.close();
    }

    static int search(int[] arr, int target, int a, int b) {
        for (int i = a; i < b; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }

        }
        return -1;
    }
}
