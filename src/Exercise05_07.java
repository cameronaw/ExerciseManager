public class Exercise05_07 {
    public static void main(String[] args) {
        //tuition from years 0-9
        System.out.printf("%-8s%6s\n", "Year", "Tuition");
        final int START_TUITION = 10000;
        for(int i = 0; i < 10; i++) {
            int tuition = (int) (START_TUITION + i * 0.06 * START_TUITION);
            System.out.printf("%-8s$%,6d\n", i + 1, tuition);
        }
        //total tuition 4 years afterc
        int totalTuition = 0;
        for(int i = 0; i < 4; i++) {
            totalTuition += (int) (START_TUITION + (i + 10) * 0.06 * START_TUITION);
        }
        System.out.println("Total (Years 11-14): " + String.format("$%,d", totalTuition));
    }
}