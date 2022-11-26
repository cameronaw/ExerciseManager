import java.util.Scanner;

//(o_o) <-- mfw all scanner objects are tied to System.in
@SuppressWarnings("resource")
public class Exercise06_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        System.out.println("Sum of input's digits: " + sumDigits(in.nextInt()));
    }

    public static int sumDigits(long n) {
        int sum = 0;
        for(int i = 0; i < Long.toString(n).length(); i++) {
            sum += ((int) n / Math.pow(10,i)) % 10;
        }
        return sum;
    }
}