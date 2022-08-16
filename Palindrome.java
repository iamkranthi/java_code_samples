import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String rs = "";
        int i = s.length() - 1;
        while (i >= 0) {
            rs = rs + s.charAt(i);
            i-=1;
        }
        if (s.toLowerCase().equals(rs.toLowerCase())) {
            System.out.println(s + " is palindorme");

        } else
            System.out.println(s + " is not a palindorme");
        in.close();
    }
}
