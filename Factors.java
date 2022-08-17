import java.util.Scanner;
import java.lang.Math;
public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int i =1;
         System.out.println("factors of "+n);
         while(Math.abs(n)>=i){
            if (n%i==0) {
                System.out.print(i+" "); 
            }
            i++;
         }
            in.close();
    }
}
