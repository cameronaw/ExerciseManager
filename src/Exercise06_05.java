import java.util.Scanner;

//(o_o) <-- mfw all scanner objects are tied to System.in
@SuppressWarnings("resource")
public class Exercise06_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter in three numbers: ");
        displaySortedNumbers(in.nextDouble(), in.nextDouble(), in.nextDouble());
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double[] nums = {num1, num2, num3};
        for(int i = 1; i < nums.length; i++) {
            for(int j = i; j > 0 && nums[j - 1] < nums[j]; j--) {
                double temp = nums[j-1];
                nums[j-1] = nums[j];
                nums[j] = temp;
            }
        }
        System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);
    }
}