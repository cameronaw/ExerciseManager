import java.util.Scanner;

@SuppressWarnings("resource")
public class Exercise02_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double pounds = in.nextDouble();
        System.out.print("enter height in inches: ");
        double inches = in.nextDouble();

        //take the weight in kilograms and divide by the square of heights in meters
        //one pound = 0.45359237 kilos
        //one inch = 0.0254 meters

        double kilograms = pounds * 0.45359237;
        double meters = inches * 0.0254;

        double BMI = kilograms / (meters * meters);
        System.out.println("BMI is " + Math.round(BMI * 10000) / 10000.0);

        in.nextLine();
    }
}
