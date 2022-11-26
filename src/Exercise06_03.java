import java.util.Scanner;

//(o_o) <-- mfw all scanner objects are tied to System.in
@SuppressWarnings("resource")
public class Exercise06_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = in.nextInt();
        
        String check = "";
        if(!isPalindrome(num)) {
            check = " not";
        }
        System.out.println(num + " is" + check + " a Palindrome");
    }

    public static int reverse(int number) {
        int reverse = 0;
        int numLength = Integer.toString(number).length();
        for(int i = 0; i < numLength; i++) {
            reverse += ((int) ((number / Math.pow(10,i)) % 10) * Math.pow(10, numLength - (i+1)));
        }
        return reverse;
    }

    public static boolean isPalindrome(int number) {
        return (number == reverse(number) ? true : false);
    }
}