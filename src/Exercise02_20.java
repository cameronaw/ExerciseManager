import java.util.Scanner;

@SuppressWarnings("resource")
public class Exercise02_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = in.nextDouble();
        double rate = in.nextDouble();

        double interest = balance * (rate / 1200);
        System.out.println("The interest is " + Math.round(interest * 100000) / 100000.0);
    }
}