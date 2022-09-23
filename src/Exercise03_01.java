import java.util.Scanner;

public class Exercise03_01 {
    public static void main(String[] args, Scanner in) {
        System.out.print("Enter a, b, c: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double discriminant = b * b - 4 * a * c;
        if(discriminant > 0) {
            double root1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
            double root2 = (-b - Math.pow(discriminant, 0.5)) / 2 * a;
            System.out.println("The equation has two roots " + Math.round(root1 * 10000000) / 10000000.0 + " " + Math.round(root2 * 10000000) / 10000000.0);
        } else if(discriminant == 0) {
            double root = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
            System.out.println("The equation has one root " + Math.round(root * 10000000) / 10000000.0);
        } else {
            System.out.println("The equation has no real roots");
        }

        in.nextLine();
    }
}
