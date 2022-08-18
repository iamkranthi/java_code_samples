import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int temp = 1;
        for (int i = 1; i <= 10; i += 1) {
            temp = num * i;
            System.out.println(num + "*" + i + "=" + temp);
        }

        in.close();
    }
}
