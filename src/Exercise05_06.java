public class Exercise05_06 {
    public static void main(String[] args) {
        //1 ping = 3.305 sq. meters
        System.out.printf("%-12s%12s%3s|%3s%-12s%12s\n", "Ping", "Square meter", "", "", "Square Meter", "Ping");
        for(int i = 0; i <= 14; i++) {
            int ping1 = (i * 5) + 10;
            double sqmeter1 = ping1 * 3.305;
            int sqmeter2 = (i * 5) + 30;
            double ping2 = sqmeter2 / 3.305;
            System.out.printf("%-12d%12.3f%3s|%3s%-12d%12.3f\n", ping1, sqmeter1, "", "", sqmeter2, ping2);
        }
    }
}