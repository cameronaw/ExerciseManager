import java.util.Scanner;

@SuppressWarnings("resource")
public class Exercise02_13 {
    static double interest = 0.0375/12;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the monthly saving amount: ");
        double saving = in.nextDouble();

        //loop will be implemented in 5.30 just ignore spaghetti code for now
        double savingMonth = saving * (1 + interest);
        System.out.println("After the first month, the account value is " + savingMonth);

        savingMonth = (savingMonth + saving) * (1 + interest);
        System.out.println("After the second month, the account value is " + savingMonth);

        savingMonth = (savingMonth + saving) * (1 + interest);
        System.out.println("After the third month, the account value is " + savingMonth);

        savingMonth = (savingMonth + saving) * (1 + interest);
        savingMonth = (savingMonth + saving) * (1 + interest);
        savingMonth = (savingMonth + saving) * (1 + interest);
        System.out.println("After the sixth month, the account value is " + savingMonth);

        in.nextLine();
    }
}
