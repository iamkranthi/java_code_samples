
public class Search_minimum {
    public static void main(String[] args) {

        int[] arr = { 6, 8, 9, 10, 4, 6, 89, 67 };

        System.out.println(max(arr));
        System.out.println(min(arr));

    }

    private static int min(int[] arr) {
        int min = arr[0];
        for (int j = 1; j < arr.length; j++) {

            if (arr[j] < min) {
                min = arr[j];
            }
        }
        return min;
    }

    private static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < 5; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

}
