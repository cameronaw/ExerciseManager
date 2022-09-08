import java.util.Scanner;

public class Ch1Ex7 {
    public static void main(String[] args, Scanner in) {
        double pi = 0;
        for(double i = 1; i <= 11; i+=2) {
            pi = (i % 4) == 1 ? pi + (1/i) : pi - (1/i);
        }
        System.out.println("PI with an accuracy of roughly " + Math.floor((1 - 1.0/11) * 10000) / 100 + "%:\t" + pi*4);

        pi = 0;
        for(double i = 1; i <= 13; i+=2) {
            pi = (i % 4) == 1 ? pi + (1/i) : pi - (1/i);
        }
        System.out.println("PI with an accuracy of roughly " + Math.floor((1 - 1.0/13) * 10000) / 100 + "%:\t" + pi*4);

        pi = 0;
        for(double i = 1; i <= 99; i+=2) {
            pi = (i % 4) == 1 ? pi + (1/i) : pi - (1/i);
        }
        System.out.println("PI with an accuracy of roughly " + Math.floor((1 - 1.0/99) * 10000) / 100 + "%:\t" + pi*4);
    }
}
