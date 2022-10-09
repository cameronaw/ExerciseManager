import java.util.Scanner;

@SuppressWarnings("resource")
public class Exercise02_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double distance = in.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double mpg = in.nextDouble();
        System.out.print("Enter price per gallon: ");
        double ppg = in.nextDouble();

        double drivingCost = distance / mpg * ppg;
        System.out.println("The cost of driving is $" + Math.round(drivingCost * 100) / 100.0);
    }
}
