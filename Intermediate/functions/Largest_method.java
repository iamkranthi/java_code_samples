import java.util.Scanner;

public class Largest_method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1st number");
        int a = in.nextInt();
        System.out.println("enter 2nd number");
        int b = in.nextInt();
        System.out.println("enter 3rd number");
        int c = in.nextInt();
        int large = maximum(a, b, c);
        int small = minimum(a,b,c);
        System.out.println(large+" is largest among three numbers and "+small+" is smallest among three numbers");
        in.close();
    }

    static int maximum(int a, int b, int c) {
        int max = Math.max(a, Math.max(c, b));

        return max;
    }
    static int minimum(int a, int b, int c){
      int min =Math.min(a,Math.min(c, b) );
        return min;
    }
}
