import java.util.Scanner;

public class Exercise02_03 {
    public static void main(String[] args, Scanner in) {
        System.out.print("Enter a value for meter: ");
        double meter = in.nextDouble();
        double feet = meter * 3.2786;
        System.out.println(meter + " meters is " + feet + " feet");

        in.nextLine();
    }
}
