import java.util.Arrays;
import java.util.Scanner;


public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number limit for fibonacci: ");
        int size = scanner.nextInt();
        int[] fibonacci = new int[size];
        fibonacci[0]=0;
        fibonacci[1]=1;

        for (int i = 2; i < size; i++) {
            fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
        }

        Arrays.stream(fibonacci).forEach(n -> System.out.println(n));

    }
}