import java.util.Scanner;

public class Even_odd_method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int a = in.nextInt();
       if (check(a)) {
        System.out.println(a+" is even number");
       }
       else
       System.out.println(a+" is odd number");
        in.close();
    }

    static boolean check(int c) {
    
        if (c % 2 == 0) {
            return true;
        } else

            return false;
    }
}
