import java.util.Random;
import java.util.Scanner;

public class Exercise05_02 {
    public static void main(String[] args) {
        SubtractionQuizLoop sql = new SubtractionQuizLoop();
        sql.main(args);
    }
}

@SuppressWarnings("resource")
class SubtractionQuizLoop {
    public void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 10;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";
        Scanner input = new Scanner(System.in);
        Random ran = new Random();

        while(count < NUMBER_OF_QUESTIONS) {
            // 1. Generate two random single-digit integers
            int number1 = ran.nextInt(11) + 1;
            int number2 = ran.nextInt(11) + 1;

            // 2. If number1 < number2, swap number1 with number2
            if(number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            // 3. Prompt the student to answer "What is number1 - number2?"
            System.out.print("What is " + number1 + " x " + number2 + "? ");
            int answer = input.nextInt();

            // 4. Grade the answer and display the result
            if(number1 * number2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong.\n" + number1 + " x " + number2 + " should be " + (number1 * number2));
            }

            //Increase the question count
            count++;
            output += "\n" + number1 + "x" + number2 + "=" + answer + ((number1 * number2 == answer) ? " correct" : " wrong");
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
    }
}
