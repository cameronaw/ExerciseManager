import java.util.Scanner;

public class Exercise03_05 {
    static final String[] WEEK = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int day = in.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int futureDay = (in.nextInt() + day) % 7;

        System.out.println("Today is " + WEEK[day] + " and the future day is " + WEEK[futureDay]);
        

        in.nextLine(); // use when scanner is used
    }
}
