import java.util.Scanner;

public class Exercise03_02 {
    public static void main(String[] args) {
        AdditionQuiz aq = new AdditionQuiz();
        aq.main(args);
    }
}

@SuppressWarnings("resource")
class AdditionQuiz {
    public void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 10 % 10);
        int number3 = (int)(System.currentTimeMillis() / 100 % 10);
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is " + number1 + " x " + number2 + " x " + number3 + "? ");
        int answer = input.nextInt();
        
        System.out.println(number1 + " x " + number2 + " x " + number3 + " = " + answer + " is " + (number1 * number2 * number3 == answer));
    }
}
