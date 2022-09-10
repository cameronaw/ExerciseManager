import java.util.Scanner;

public class Exercise01_12 {
    public static void main(String[] args, Scanner in) {
        int hours = 1;
        int minutes = 50;
        int seconds = 30;
        int time = hours * 60 * 60 + minutes * 60 + seconds;
        int distance = 15;
        System.out.println("A runner runs " + distance + " miles in " + hours + " hour, " + minutes + " minutes, and " + seconds + " seconds\nAverage speed of runner: " + runnerSpeed(distance, time) + " kilometers/hour");
    }

    public static double runnerSpeed(int distance, int time) {
        double kilometers = distance * 1.6;
        return Math.round(kilometers / (time / 3600.0) * 100) / 100.0;
    }
}