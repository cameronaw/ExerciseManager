public class Exercise06_08 {
    public static void main(String[] args) {
        System.out.printf("%-10s%10s%10s|%10s%10s%10s\n", "Miles", "Kilometers", "", "", "Kilometers", "Miles");
        for(int i = 0; i < 10; i++) {
            System.out.printf("%-10d%10.3f%10s|%10s%-10d%10.3f\n", i + 1, mileToKilometer(i + 1), "", "", (i*5) + 20, kilometerToMile((i*5) + 20));
        }
    }

    public static double mileToKilometer(double mile) {
        return mile * 1.6;
    }

    public static double kilometerToMile(double kilometer) {
        return kilometer / 1.6;
    }
}