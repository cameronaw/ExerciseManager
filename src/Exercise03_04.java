import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise03_04 {
    //me when the switch statement too long (O n O') !! array time
    static final String[] output = {"Janurary", "Feburary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public static void main(String[] args, Scanner in) {
        Random r = new Random();
        int month = r.nextInt(11);

        System.out.println("List of months: " + Arrays.toString(output));
        System.out.println("Current month: " + output[month]);
    }
}
