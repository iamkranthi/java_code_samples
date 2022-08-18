import java.util.Scanner;
public class Batting_average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter runs,matches,not-out");
        int runs=in.nextInt();
        int matches=in.nextInt();
        int no =in.nextInt();
        int batting_average = runs/(matches-no);
         System.out.println(batting_average+" is batting average");
            in.close();
    }
}
