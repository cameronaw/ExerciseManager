import java.util.Scanner;

public class Exercise02_05 {
    public static void main(String[] args, Scanner in) {
        System.out.println("Enter the subtotal and a gratuity rate: ");
        double subtotal = in.nextDouble();
        double gratuityRate = in.nextDouble();
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}

