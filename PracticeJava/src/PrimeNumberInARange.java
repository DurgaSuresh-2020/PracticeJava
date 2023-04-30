import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class PrimeNumberInARange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int min = scanner.nextInt();
        System.out.print("Enter the higher limit: ");
        int max = scanner.nextInt();
        int countPrimeNumbers = 0;
        List<Integer> prime = new ArrayList<>();


        for (int i = min; i <= max; i++)
        {
            boolean isPrime=true;
            if(i<2)
            {
                isPrime=false;
            }
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                prime.add(i);
                countPrimeNumbers++;
            }
        }

        System.out.println("List of Prime numbers between "+min + "and "+max+" is : " + prime.removeAll(Arrays.asList(0)));
        System.out.println("Number of Prime numbers between "+min + "and "+max+" is : " + countPrimeNumbers);
    }
}