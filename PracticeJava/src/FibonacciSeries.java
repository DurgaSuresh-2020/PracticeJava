import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class FibonnaciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number limit for fibonnaci: ");
        int size = scanner.nextInt();
        int[] fibonnaci = new int[size];
        fibonnaci[0]=0;
        fibonnaci[1]=1;

        for (int i = 2; i < size; i++) {
            fibonnaci[i] = fibonnaci[i-1]+fibonnaci[i-2];
        }

        Arrays.stream(fibonnaci).forEach(n -> System.out.println(n));

    }
}