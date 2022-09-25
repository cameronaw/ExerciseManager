import java.util.Scanner;

public class Exercise03_07 {
    public static void main(String[] args, Scanner in) {
        ComputeChange2 cc2 = new ComputeChange2();
        cc2.main(args);
    }
}

@SuppressWarnings("resource")
class ComputeChange2 {
    public void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //why cant I use object )):::!!!!!
        System.out.print("Enter an amount in int, for example 1156 ($11.56): ");
        int amount = input.nextInt();
        int remainingAmount = amount;

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount %= 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;

        int numberOfPennies = remainingAmount;

        String output = "Your amount " + amount + " consists of";
        if(numberOfOneDollars != 0) {
            output += "\n\t" + numberOfOneDollars + " dollar";
            if(numberOfOneDollars != 1) {
                output += "s";
            }
        }
        if(numberOfQuarters != 0) {
            output += "\n\t" + numberOfQuarters + " quarter";
            if(numberOfQuarters != 1) {
                output += "s";
            }
        }
        if(numberOfDimes != 0) {
            output += "\n\t" + numberOfDimes + " dime";
            if(numberOfOneDollars != 1) {
                output += "s";
            }
        }
        if(numberOfNickels != 0) {
            output += "\n\t" + numberOfNickels + " nickle";
            if(numberOfOneDollars != 1) {
                output += "s";
            }
        }
        if(numberOfPennies != 0) {
            output += "\n\t" + numberOfPennies + " penn";
            if(numberOfOneDollars != 1) {
                output += "y";
            } else {
                output += "ies";
            }
        }

        System.out.println(output);
    }
}