import java.util.Scanner;

@SuppressWarnings("resource")
public class Exercise03_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String isbn = in.next();
        int isbnCalc = 0;
        
        //lovely
        for(int i = 0; i < isbn.length(); i++) {
            isbnCalc += Character.getNumericValue(isbn.charAt(i)) % 10 * (i+1);
        }
        String isbn10 = isbnCalc % 11 == 10 ? "X" : Integer.toString(isbnCalc % 11);

        System.out.println("The ISBN-10 number is " + isbn + "" + isbn10);
        in.nextLine(); // use when scanner is used
    }
}