import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Type the number who corresponding to x:");
        double x = sc.nextDouble();
        System.out.print("Type the number who corresponding to y:");
        double y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origin");
        }
        else if (x == 0.0) {
            System.out.println("Axis Y");
        }
        else if (y == 0.0) {
            System.out.println("Axis X");
        }
        else if (x > 0.0 && y > 0.0) {
            System.out.println("Quadrant 1");
        }
        else if (x < 0.0 && y > 0.0) {
            System.out.println("Quadrant 2");
        }
        else if (x < 0.0 && y < 0.0) {
            System.out.println("Quadrant 3");
        }
        else {
            System.out.println("Quadrant 4");
        }

        sc.close();
    }
}