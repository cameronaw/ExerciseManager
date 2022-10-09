import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("resource")
public class Exercise02_11 {
    public static void main(String[] args) {
        //Input version of exercise 01_11
        Scanner in = new Scanner(System.in);
        int seconds = 365 * 24 * 60 * 60;
        double births = seconds / 7;
        double deaths = seconds / 13;
        double immigrants = seconds / 45;
        int population = 312032486;

        System.out.print("Enter the number of years: ");
        int inYears = in.nextInt();

        ArrayList<String> populationArray = calculateGrowth(inYears, births, deaths, immigrants, population);
        System.out.println("The population in " + inYears + " years is " + populationArray.get(inYears));

        in.nextLine();
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