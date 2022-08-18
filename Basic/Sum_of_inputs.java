import java.util.Scanner;
public class Sum_of_inputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.println();
         int sum =0;
         while(true){
            int num=in.nextInt();
            if(num==0){
                break;
            }
            else{
                sum+=num;
            }
         }
         System.out.println(sum+" is sum of all digits");
            in.close();
    }
}
