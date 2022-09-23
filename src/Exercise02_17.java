import java.util.Scanner;

public class Exercise02_17 {
    public static void main(String[] args, Scanner in) {
        /* to calculate coldness using temperature and wind speed:
         * t(we) = 365.74 + 0.6215t(a) - 35.75v^0.16 + 0.4275t(a)^0.16
         * t(a) = outside temperature measure in F*
         * t(we) = wind-chill temperature
         * if(wind speed < 2mph || temperature < -58F* || temperature > 41F*) return false;
         */

        double temperature;
        double windspeed;
        
        do {
            System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
            temperature = in.nextDouble();
        } while (temperature <= -58 || temperature >= 41);
        do {
            System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
            windspeed = in.nextDouble();
        } while (windspeed < 2);

        double windchill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windspeed, 0.16) + 0.4275 * temperature * Math.pow(windspeed, 0.16);
        System.out.println("The wind chill index is " + Math.round(windchill * 100000) / 100000.0);

        in.nextLine();
    }
}
