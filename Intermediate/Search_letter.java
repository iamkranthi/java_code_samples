

import java.util.Scanner;

public class Search_letter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "Kranthi";
        char target = 'a';
        System.out.println(search(name, target));
        System.out.println("");
        in.close();

    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }

        }

        return false;
    }

}
