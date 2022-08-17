import java.util.Scanner;
public class Largest_among_inputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int large=0;
        while(true){
            int num = in.nextInt();
            if(num==0){
                break;
            }
            else if(num>large){
                large=num;
            }
        }
         System.out.println(large+" is Largest number");

            in.close();
    }
}
