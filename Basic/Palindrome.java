import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1 for palindrome string");
        System.out.println("enter 2 for palindrome number");
        int choice = in.nextInt();
        // *palindrome string */
        if (choice == 1) {
            System.out.println("enter a word to check whether it is palindrome or not");
            String s = in.nextLine();
            String rs = "";
            int i = s.length() - 1;
            while (i >= 0) {
                rs = rs + s.charAt(i);
                i -= 1;
            }
            if (s.toLowerCase().equals(rs.toLowerCase())) {
                System.out.println(s + " is palindorme");

            } else
                System.out.println(s + " is not a palindorme");
            // *palindrome number */
        } else if (choice == 2) {
            System.out.println("enter a number to check whether it is palindrome or not");
            int num = in.nextInt();//
            int temp = num;

            int rem = 0;//
            int sum = 0;//
            while (num > 0) {
                rem = num % 10;
                sum = (sum * 10) + rem;
                num /= 10;
            }
            if (temp == sum) {
                System.out.println(temp+" is a palindrome number");
            } else
                System.out.println(temp+" is not a palindrome number");

        }
        in.close();
    }
}
