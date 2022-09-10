import java.util.Scanner;

public class Exercise02_09 {
    public static void main(String[] args, Scanner in) {
        System.out.print("Enter v0, v1, and t: ");
        double v0 = in.nextDouble();
        double v1 = in.nextDouble();
        double t = in.nextDouble();
        double a = Math.round((v1 - v0)/t * 10000) / 10000.0;
        System.out.println("The average acceleration is " + a);
    }
}
