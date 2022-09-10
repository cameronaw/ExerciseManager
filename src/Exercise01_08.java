import java.util.Scanner;

public class Exercise01_08 {
    public static void main(String[] args, Scanner in) {
        double radius = 6.5;
        double PI = 3.14159;
        double perimeter = 2 * radius * PI;
        double area = radius * radius * PI;

        System.out.println("Perimeter: " + Math.round(perimeter * 1000) / 1000.0 + "\nArea: " + Math.round(area * 1000) / 1000.0);
    }
}
