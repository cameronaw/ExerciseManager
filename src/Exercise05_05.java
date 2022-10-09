public class Exercise05_05 {
    public static void main(String[] args) {
        System.out.printf("%-10s%10s%3s|%3s%-10s%10s\n", "Celsius", "Fahrenheit", "", "", "Fahrenheit", "Celisus");
        for(int i = 0; i <= 50; i++) {
            int Celsius1 = i * 2;
            double Fahrenheit1 = Celsius1 * 9 / 5.0 + 32;
            int Fahrenheit2 = 20 + (i * 5);
            double Celsius2 = (Fahrenheit2 - 32) * 5 / 9.0;
            System.out.printf("%-10d%10.3f%3s|%3s%-10d%10.3f\n", Celsius1, Fahrenheit1, "", "", Fahrenheit2, Celsius2);
        }
    }
}