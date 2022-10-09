import java.util.Scanner;

public class Exercise05_03 {
    public static void main(String[] args, Scanner in) {
        /* Farenheit = Celsius * 9 / 5 + 32
         * printf format = "%-5d%-5d", celsius (i), farhenheit (i * 9 / 5 + 32)
         * skipped ch4 oopsie, just learned how printf works lol
         */
        System.out.printf("%-10s%10s\n", "Celsius", "Farenheit");
        for(int i = 0; i <= 100; i++) {
            System.out.printf("%-10d%10.1f\n", i, (i * 9 / 5.0 + 32));
        }
    }
}