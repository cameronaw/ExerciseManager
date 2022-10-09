import java.util.Arrays;

public class Exercise02_18 {
    public static void main(String[] args) {
        int a[][] = {{0, 0}, {1, 4}, {2, 7}, {3, 9}, {4, 11}};
        int b[][] = {{2, 1}, {4, 2}, {6, 3}, {10, 5}, {12, 7}};

        double midpoint[][] = new double[a.length][2];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < 2; j++) {
                midpoint[i][j] = (a[i][j] + b[i][j]) / 2.0;
            }
        }

        System.out.println("a: " + Arrays.deepToString(a) + "\nb: " + Arrays.deepToString(b) + "\nMiddle Point: " + Arrays.deepToString(midpoint));
    }
}
