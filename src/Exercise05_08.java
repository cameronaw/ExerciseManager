import java.util.Scanner;

//(o_o) <-- mfw all scanner objects are tied to System.in
@SuppressWarnings("resource")
public class Exercise05_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int studentsNum = in.nextInt();

        String studentName = "";
        int studentScore = 0;
        System.out.println("Enter the name and score of each student");
        for(int i = 0; i < studentsNum; i++) {
            String currentName = in.next();
            int currentScore = in.nextInt();
            if(currentScore > studentScore) {
                studentName = currentName;
                studentScore = currentScore;
            }
        }

        System.out.println("Student with highest score: " + studentName);
    }
}