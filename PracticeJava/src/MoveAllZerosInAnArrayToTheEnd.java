import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MoveAllZerosInAnArrayToTheEnd {
    public static void main(String[] args) {
        int countZeros = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        List<Integer> nonZeroNums = new ArrayList<>();

        for (int n : nums) {
            if (n == 0) {
                countZeros = countZeros + 1;
            } else {
                nonZeroNums.add(n);
            }
        }
        if (countZeros > 0) {
            for (int i = 0; i < countZeros; i++) {
                nonZeroNums.add(0);
            }
        }
        System.out.println(nonZeroNums);
    }
}