import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      int num=in.nextInt();
        int i=1,fact=1;
        while(num>0){
            fact*=num;
            num=num-i;
        }
         System.out.println(fact);
            in.close();
    }
}
