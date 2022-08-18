import java.util.Scanner;
public class Product_method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int n1=in.nextInt();
        System.out.println("enter another number");
        int n2=in.nextInt();
        System.out.println(product(n1,n2)+" is product of two numbers");
         System.out.println();
            in.close();
    }

 static int product(int a,int b) {
        return a*b;
    }
}
