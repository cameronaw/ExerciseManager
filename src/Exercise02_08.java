import java.util.Scanner;

@SuppressWarnings("resource")
public class Exercise02_08 {
    public static void main(String[] args) {
        //obtain hours:minutes:seconds in current time zone relative to GMT
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int timezone = in.nextInt();
        long totalSeconds = System.currentTimeMillis() / 1000;
        long currentSecond = totalSeconds % 60;
        long currentMinute = totalSeconds / 60 % 60;
        long currentHour = (totalSeconds / 60 / 60 + timezone) % 24;
        System.out.println("The current time is " + String.format("%02d", currentHour) + ":" + String.format("%02d", currentMinute) + ":" + String.format("%02d", currentSecond));
    }
}
