import java.util.Scanner;

public class Exercise01_09 {
    public static void main(String[] args, Scanner in) {
        double w = 5.3;
        double h = 8.6;
        double area = w * h;
        double perimeter = 2 * (w + h);

        System.out.println("Area: " + area + "\nPerimeter: " + Math.round(perimeter * 1000) / 1000.0);
    }
}
