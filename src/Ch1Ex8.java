import java.util.Scanner;

public class Ch1Ex8 {
    public static void main(String[] args, Scanner in) {
        double radius = 6.5;
        double PI = 3.14159;
        double perimeter = 2 * radius * PI;
        double area = radius * radius * PI;

        System.out.println("Perimeter: " + perimeter + "\nArea: " + area);
    }
}
