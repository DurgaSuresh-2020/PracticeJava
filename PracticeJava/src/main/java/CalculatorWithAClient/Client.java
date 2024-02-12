package main.java.CalculatorWithAClient;

import java.util.Scanner;


public class Client  {

    static BasicCalculator object = new BasicCalculator();

    public static void main(String[] args)
    {
        double result = 0;

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1 = scanner1.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        double number2 = scanner2.nextDouble();


        System.out.println("Addition :" + object.add(number1,number2));
        System.out.println("Subtraction :" + object.sub(number1,number2));
        System.out.println("Multiplication :" + object.mul(number1,number2));
        System.out.println("Division :" + object.div(number1,number2));
    }

}