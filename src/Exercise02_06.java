import java.util.Scanner;

public class Exercise02_06 {
    public static void main(String[] args, Scanner in) {
        boolean boot = true;
        while(boot) {
            System.out.print("Enter a number between 0 and 1000: ");
            int input = in.nextInt();
            if(input >= 0 && input <= 1000) {
                int total = 1;
                for(int i = input; i > 0; i/=10) {
                    total *= input % 10;
                }
                System.out.println("The multiplication of all digits in " + input + " is " + total);
                boot = false;
            } else {
                System.out.println(input + " is not a number between 0 and 1000\n");
            }
        }
    }
}
