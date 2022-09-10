import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise01_11 {
    public static void main(String[] args, Scanner in) {
        /* RATES */
        // One birth every 7 seconds
        // One death every 13 seconds
        // One new immigrant every 45 seconds
        

        /* VARIABLES */
        //population at year 0: 312032486
        //one year = 365 days = 8760 hours = 525600 minutex = 31536000 seconds

        //births per year = 31536000 / 7 = 4500000
        //deaths per year = 31536000 / 13 = 2420000
        //immigrants per year = 31536000 / 45 = 700800


        /* TASK */
        //write a program to display population growth each year for the next 5 years
        
        int years = 5;
        int seconds = 365 * 24 * 60 * 60;
        double births = seconds / 7;
        double deaths = seconds / 13;
        double immigrants = seconds / 45;
        int population = 312032486;

        ArrayList<String> populationArray = calculateGrowth(years, births, deaths, immigrants, population);

        System.out.println("Current population: " + populationArray.get(0) + " people\nPopulation growth for the next " + years + " years:");
        for(int i = 1; i < populationArray.size(); i++) {
            System.out.println("(Year " + i + ") : " + (populationArray.get(i)) + " people");
        }
        
    }

    // i love making things complicated for no reason
    public static ArrayList<String> calculateGrowth(int years, double births, double deaths, double immigrants, int population) {
        ArrayList<String> output = new ArrayList<String>();
        DecimalFormat df = new DecimalFormat("#");
        df.setMaximumIntegerDigits(12);

        output.add(df.format(population));
        for(int i = 0; i < years; i++) {
            output.add(df.format(Double.valueOf(output.get(i)) + births - deaths + immigrants));
        }
        return output;
    }
}