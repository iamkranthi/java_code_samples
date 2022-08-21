import java.util.Scanner;

public class Prime_range_method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the range ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("From "+num1+" to"+ num2+" prime numbers are :");
       for (int i = num1; i < num2; i++) {
        if(primeRange(i)){
            System.out.println(i+" ");
        }
        
       }
        System.out.println();
        in.close();
    }

    static boolean primeRange(int a) {
        int i = 2;
        if (a == 0) {
            return false;
        }
        else{
        while (i < a) {
            if (a % i == 0) {
                return false;
            }
            i++;

        }
        return true;
    }

}
}
