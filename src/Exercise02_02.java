import java.util.Scanner;

@SuppressWarnings("resource")
public class Exercise02_02 {
    public static void main(String[] args) {
        //lol the book is wrong
        Scanner in = new Scanner(System.in);
        System.out.print("Enter lenght of the sides and height of the Equilateral triangle: ");
        double sides = in.nextDouble();
        double area = (Math.pow(3, 0.5) / 4.0) * (Math.pow(sides, 2));
        System.out.println("The area is " + Math.round(area * 1000) / 1000.0);
        double volume = area * sides;
        System.out.println("The volume of the Triangular prism is " + Math.round(volume * 1000) / 1000.0);
    }
}
