import java.util.Scanner;
public class Perfect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int i =1,sum=0;
        while (i<n) {
            if(n%i==0){
               
                sum+=i;
                
            }
            ++i;       
        }
        if(n==sum){
         System.out.println(sum+" is a perfect number");
        }
        else
        System.out.println(n+" is not a perfect number");
            in.close();
    }
}
