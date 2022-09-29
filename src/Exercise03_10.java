import java.util.Scanner;

public class Exercise03_10 {
    public static void main(String[] args, Scanner in) {
        SubtractionQuiz sq = new SubtractionQuiz();
        sq.main(args);
    }
}

@SuppressWarnings("resource") // use to silence stupid scanner leak
class SubtractionQuiz {
    public void main(String[] args) {
        int number1 = (int)(Math.random() * 1000);
        int number2 = (int)(Math.random() * 1000);

        if(number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.print("what is " + number1 + " x " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if(number1 * number2 == answer) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Your answer is wrong.\n" + number1 + " x " + number2 + " should be " + (number1 * number2));
        }
    }
}