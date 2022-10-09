import java.util.Scanner;

public class Exercise05_04 {
    public static void main(String[] args, Scanner in) {
        System.out.printf("%-10s%-10s\n", "Inches", "Centimeters");
        for(int i = 0; i < 10; i++) {
            System.out.printf("%-10d%-10.2f\n", (i + 1), ((i + 1) * 2.54));
        }
    }
}