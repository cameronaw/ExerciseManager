import java.util.Scanner;

public class Exercise02_10 {
    public static void main(String[] args, Scanner in) {
        System.out.print("Enter the amont of water in kilograms: ");
        double M = in.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = in.nextDouble();
        System.out.print("enter the final temperature: ");
        double finalTemperature = in.nextDouble();

        double Q = M * (finalTemperature - initialTemperature) * 4184;
        System.out.println("The energy needed is " + Math.round(Q * 10) / 10.0);
    }
}
