import java.util.Scanner;

public class Exercise03_06 {
    public static void main(String[] args) {
        ComputeAndInterpretBMI bmi = new ComputeAndInterpretBMI();
        bmi.main(args);
    }
}

@SuppressWarnings("resource")
class ComputeAndInterpretBMI {
    public void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter feet: ");
        double feet = input.nextDouble();

        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = (feet * 12 + inches) * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        
        String output = "BMI is " + bmi + "\n";;
        if(bmi < 18.5) {
            output += "Underweight";
        } else if(bmi < 25) {
            output += "Normal";
        } else if(bmi < 30) {
            output += "Overweight";
        } else {
            output += "Obese";
        }
        System.out.println(output);
    }
}
