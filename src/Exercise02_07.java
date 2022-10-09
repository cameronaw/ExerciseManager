import java.util.Scanner;

public class Exercise02_07 {
    public static void main(String[] args) {
        ShowCurrentTime sct = new ShowCurrentTime();
        sct.main(args);
    }
}

@SuppressWarnings("resource")
class ShowCurrentTime {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the number of minutes: ");
        int minutes = in.nextInt();
        int years = minutes / 60 / 24 / 365;
        int days = minutes / 60 / 24 % 365;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

        in.nextLine();
    }
}
