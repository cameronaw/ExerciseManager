import java.util.Arrays;
import java.util.Scanner;

public class Exercise03_08 {
    public static void main(String[] args, Scanner in) {
        
        System.out.print("Enter three integers: ");
        int[] numArray = {in.nextInt(), in.nextInt(), in.nextInt()};
        
        sort(numArray);
        System.out.println("Your integers in increasing order: " + Arrays.toString(numArray));

        in.nextLine(); // use when scanner is used
    }

    //bruh ima just use insertion sort lol
    private static void sort(int[] input) {
        for(int i = 1; i < input.length; i++) {
            int temp = input[i];
            int j = i - 1;
            while(j >= 0 && input[j] > temp) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = temp;
        }
    }
}
