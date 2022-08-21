import java.util.Scanner;
public class Circle {
    static float pi =3.14f;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.println("Enter radius of the circle");
         float r=in.nextFloat();
         System.out.println("Area of circle is "+area(r));
         System.out.println("Circumference of circle is "+circumference(r));
            in.close();
    }

    static Float area(float a) {
       float area1=(a*pi)*a;
       return area1;
    }

  static Float circumference(float c) {
    float circumference1=(2*pi)*c;
        return circumference1;
    }
}
