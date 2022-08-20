import java.util.Scanner;
public class Sum_method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int n1=in.nextInt();
        System.out.println("enter another number");
        int n2=in.nextInt();
        System.out.println(sum(n1,n2)+" is sum of two numbers");
         System.out.println();
            in.close();
    }

 static int sum(int a,int b) {
        return a+b;
    }
}
