import java.util.Scanner;

public class Exercise02_19 {
    public static void main(String[] args, Scanner in) {
        System.out.print("Enter the coordinates of three points separated by spaces like \"x1 y1 x2 y2 x3 y3\": ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();

        double side1 = calcSide(x1, y1, x2, y2);
        double side2 = calcSide(x2, y2, x3, y3);
        double side3 = calcSide(x3, y3, x1, y1);

        double sides = (side1 + side2 + side3) / 2;
        double area = Math.pow(sides * (sides - side1) * (sides - side2) * (sides - side3), 0.5);

        System.out.println("The are of the triangle is " + Math.round(area * 10) / 10.0);

        in.nextLine(); // use when scanner is used
    }

    public static double calcSide(double x1, double y1, double x2, double y2) {
        return Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
    }
}
