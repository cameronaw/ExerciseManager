import java.util.Scanner;

//(o_o) <-- mfw all scanner objects are tied to System.in
@SuppressWarnings("resource")
public class Exercise06_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("The amount invested: ");
        double investment = in.nextDouble();
        System.out.print("Annual interest rate: ");
        double yearRate = in.nextDouble();
        
        System.out.printf("%-10s%10s\n", "Years", "Future Value");
        for(int i = 0; i < 30; i++) {
            System.out.printf("%-10d$%,10.2f\n", i+1, futureInvestmentValue(investment, yearRate * 0.01 / 12, i + 1));
        }
    }

    // futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate) ^ numberofYears*12
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years*12);
    }
}