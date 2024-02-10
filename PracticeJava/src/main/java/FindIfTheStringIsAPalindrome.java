package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FindIfTheStringIsAPalindrome {
    public static void main(String[] args) {
        int countZeros = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = scanner.next();
        String reversedWord = new String();

        for(int i=word.length()-1;i>=0;i--){
            reversedWord+=word.charAt(i);
        }
        String message = (word.toLowerCase().equals(reversedWord.toLowerCase())) ? "It's a palindrome."
                : "It's not a palindrome.";
        System.out.println(message);
    }
}