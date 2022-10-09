public class Exercise01_10 {
    public static void main(String[] args) {
        int minutes = 50;
        int seconds = 30;
        int time = minutes * 60 + seconds;
        int distance = 15;
        System.out.println("A runner runs " + distance + " kilometers in " + minutes + " minutes and " + seconds + " seconds\nAverage speed of runner: " + runnerSpeed(distance, time) + " miles/hour");
    }

    public static double runnerSpeed(int distance, int time) {
        double miles = distance / 1.6;
        return Math.round(miles / (time / 3600.0) * 100) / 100.0;
    }
}
