import java.util.Scanner;

public class Exercise02_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter miles: ");
        int miles = in.nextInt();
        System.out.println(miles + " miles is " + Math.round(miles * 1.6 * 100) / 100.0 + " kilometers");
        in.close();
    }
}
