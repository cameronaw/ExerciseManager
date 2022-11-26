import java.util.Scanner;

//(o_o) <-- mfw all scanner objects are tied to System.in
@SuppressWarnings("resource")
public class Exercise06_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many lines? ");
        displayPattern(in.nextInt());
    }

    public static void displayPattern(int n) {
        String pattern = "";
        for(int i = 0; i < n; i++) {
            for(int j = 1; j < i + 2; j++) {
                pattern += j + " ";
            }
            pattern += "\n";
        }
        System.out.println(pattern);
    }
}