import java.util.Scanner;

@SuppressWarnings("resource")
public class Exercise05_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0;
        do {
            System.out.print("Enter your score: ");
            input = in.nextInt();
            if(input >= 60) {
                System.out.println("You pass the exam");
            } else if (input >= 0) {
                System.out.println("You don't pass the exam");
            }
        } while(input != -1);
    }
}
