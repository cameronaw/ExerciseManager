public class Exercise06_01 {
    public static void main(String[] args) {
        final int TOTAL = 100;
        String output = "";
        for(int i = 0; i < TOTAL; i++) {
            output += String.format("%7d", getPentagonalNumber(i + 1));
            if((i + 1) % 10 == 0) {
                output += "\n";
            }
        }

        System.out.println(output);
    }

    public static int getPentagonalNumber(int n) {
        return n*(3*n - 1) / 2;
    }
}