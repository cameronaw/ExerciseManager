import java.util.Scanner;

@SuppressWarnings("resource")
public class Exercise02_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();

        System.out.print("enter x2 and y2: ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        System.out.println("The distance between the two points is " + distance);

        in.nextLine();
    }
}
