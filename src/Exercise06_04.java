import java.util.Scanner;

//(o_o) <-- mfw all scanner objects are tied to System.in
@SuppressWarnings("resource")
public class Exercise06_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        reverse(in.nextInt());
    }
    
    public static void reverse(int number) {
        int reverse = 0;
        int numLength = Integer.toString(number).length();
        for(int i = 0; i < numLength; i++) {
            reverse += ((int) ((number / Math.pow(10,i)) % 10) * Math.pow(10, numLength - (i+1)));
        }
        System.out.println("Reversed integer: " + reverse);
    }
}