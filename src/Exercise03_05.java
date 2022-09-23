import java.util.Scanner;

public class Exercise03_05 {
    static final String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public static void main(String[] args, Scanner in) {
        System.out.print("Enter today's day: ");
        int day = in.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int futureDay = (in.nextInt() + day) % 7;

        System.out.println("Today is " + week[day] + " and the future day is " + week[futureDay]);
        

        in.nextLine(); // use when scanner is used
    }
}
