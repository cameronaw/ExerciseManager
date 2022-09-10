import java.util.Scanner;

public class Exercise01_13 {
    public static void main(String[] args, Scanner in) {
        /*  Cramer's Rule
         *  ax + by = e       ed - bf       af - ec
         *                x = -------   y = -------
         *  cx + dy = f       ad - bc       ad - bc
         *  
         *  
         *  Write a program that solve's the equations (3.4x + 50.2y = 44.5) and (2.1x + 0.55y = 5.9) displaying the value of both "x" and "y"
         *  
         */

        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;

        if(a*d - b*c != 0) {
            double x = (e*d - b*f) / (a*d - b*c);
            double y = (a*f - e*c) / (a*d - b*c);
            System.out.println("3.4x + 50.2y = 44.5\n2.1x + 0.55y = 5.9\nx = " + x + "\ny = " + y);
        } else {
            System.out.println("Iz too hawwd (O n O)'");
        }
    }
}
