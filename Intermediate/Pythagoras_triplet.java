import java.util.Scanner;

public class Pythagoras_triplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        if (pythrogroes(a, b, c)) {
            System.out.println("Inputs satisfied pytrogroes");

        } else
            System.out.println("Inputs doest satisfied pytrogroes");
        in.close();
    }

    private static boolean pythrogroes(float x, float y, float z) {
        x = (float) Math.pow(x, 2);
        y = (float) Math.pow(y, 2);
        z = (float) Math.pow(z, 2);
        if (x + y == z) {
            return true;
        } else

            return false;
    }

}
