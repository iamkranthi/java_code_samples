import java.util.Scanner;
public class List_of_p_n_numbers {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
    
         while(true){
            int n = in.nextInt();
            if(n>0){
                System.out.println(n+" it is a positive number");
            }
            else if (n<0) {
                System.out.println(n+" it is a negative number");
            }
           if(n==0){
                System.out.println(n+" it is a non positive &non negatave number");
                break;
            }
           in.close();
        }
        
          
    }
}