import java.util.Scanner;

public class Exercise01_04 {
    public static void main(String[] args, Scanner in) {
        for(int i = 1; i <= 4; i++) {
            System.out.print("a^" + i + "\n");
            for(int j = 1; j <= 4; j++) {
                System.out.print((int) Math.pow(j, i) + "\n");
            }
        }
    }
}
