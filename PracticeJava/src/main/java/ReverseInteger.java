package main.java;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseInteger {


    public static void main(String[] args){
      
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();
        String numberString = Integer.toString(number);

        int size = numberString.length();
        char[] numberArray = numberString.toCharArray();
        char[] reversedNumberArray = new char[size];
        for(int i = 0; i<size; i++){
            reversedNumberArray[i] = numberArray[size-1-i];
        }
        // Convert the reversed character array back to a string
        String reversedNumberString = new String(reversedNumberArray);
        System.out.println("Reversed number is : " + reversedNumberString);


    }
}
