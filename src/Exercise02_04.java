import java.util.Scanner;

@SuppressWarnings("resource")
public class Exercise02_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number in square meters: ");
        double squareMeter = in.nextDouble();
        double ping = squareMeter * 0.3025;
        System.out.println(squareMeter + " square meters is " + ping + " pings");

        in.nextLine();
    }
}
