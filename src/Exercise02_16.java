import java.util.Scanner;

@SuppressWarnings("resource")
public class Exercise02_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the side: ");
        double side = in.nextDouble();

        double area = 3 * Math.pow(3, 0.5) / 2 * side * side;
        System.out.println("The area of the hexagon is " + Math.round(area * 10000) / 10000.0);
    }
}
