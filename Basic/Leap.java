import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if ((year % 4) == 0) {
            System.out.println(year + " is a leap year");
        }
        else
        System.out.println(year+" It is not Leap year");
        in.close();
    }

}
