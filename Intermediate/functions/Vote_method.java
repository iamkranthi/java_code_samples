import java.util.Scanner;

public class Vote_method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your age");
        int age = in.nextInt();
        System.out.println("enter your name");
        String name = in.next();

        if (votecheck(age)) {
            System.out.println(name + " has " + age + " so you can vote");
        } else
            System.out.println(name + " has " + age + " so you can't vote");
        in.close();
    }

    static boolean votecheck(int vote_eligibility) {
        if (vote_eligibility >= 18) {
            return true;
        } else
            return false;
    }
}
