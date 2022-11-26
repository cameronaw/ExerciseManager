import java.util.Scanner;

//(o_o) <-- mfw all scanner objects are tied to System.in
@SuppressWarnings("resource")
public class Exercise05_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int studentsNum = in.nextInt();

        String[] studentNames = {"", ""};
        int[] studentScores = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        System.out.println("Enter the name and score of each student");
        for(int i = 0; i < studentsNum; i++) {
            String currentName = in.next();
            int currentScore = in.nextInt();
            if(studentScores[0] > currentScore) {
                studentScores[1] = studentScores[0];
                studentNames[1] = studentNames[0];
                
                studentScores[0] = currentScore;
                studentNames[0] = currentName;
            } else if(studentScores[1] > currentScore) {
                studentScores[1] = currentScore;
                studentNames[1] = currentName;
            }
        }

        System.out.println("Student with lowest score: " + studentNames[0] + "\nStudent with second-lowest score: " + studentNames[1]);
    }
}