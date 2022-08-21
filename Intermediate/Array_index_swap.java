

import java.util.Arrays;
import java.util.Scanner;

public class Array_index_swap {
    public static void main(String[] args) {
        System.out.println("Enter array elements");
        Scanner in = new Scanner(System.in);
        int[] arr_sawp = new int[5];
        for (int i = 0; i < arr_sawp.length - 1; i++) {
            arr_sawp[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr_sawp));
        array_index_swap(arr_sawp, 0, 4);
        System.out.println(Arrays.toString(arr_sawp));
        in.close();
    }

    static void array_index_swap(int[] arr_sawp, int i, int j) {
        int temp = arr_sawp[i];
        arr_sawp[i] = arr_sawp[j];
        arr_sawp[j] = temp;
    }

}
