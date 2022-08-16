import java.util.Scanner;
public class Sp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int principle=in.nextInt();
        int time=in.nextInt();
        float rate=in.nextFloat();
        float sp = (principle*time*rate)/100;
         System.out.println(sp);
            in.close();
    }
}
