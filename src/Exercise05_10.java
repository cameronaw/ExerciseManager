public class Exercise05_10 {
    public static void main(String[] args) {
        String numsList = "";
        for(int i = 100; i <= 1000; i++) {
            if(i % 3 == 0 || i % 4 == 0) {
                numsList += i + " ";
            }
        }
        System.out.println(numsList);
    }
}