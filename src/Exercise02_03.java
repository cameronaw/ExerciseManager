import java.util.Scanner;

@SuppressWarnings("resource")
public class Exercise02_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value for meter: ");
        double meter = in.nextDouble();
        double feet = meter * 3.2786;
        System.out.println(meter + " meters is " + feet + " feet");
    }
}
