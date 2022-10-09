import java.util.Scanner;

@SuppressWarnings("resource")
public class Exercise02_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investment = in.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double rate = in.nextDouble();
        System.out.print("Enter number of years: ");
        int years = in.nextInt();

        double futureInvestment = investment * Math.pow(1 + rate / 1200, years*12);
        System.out.println("Future value is $" + Math.round(futureInvestment * 100) / 100.0);

        in.nextLine(); // use when scanner is used
    }
}
