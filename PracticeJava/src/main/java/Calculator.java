import java.util.Scanner;


public class Calculator {


    public static void main(String[] args)
    {
        double result = 0;

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1 = scanner1.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        double number2 = scanner2.nextDouble();

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Enter the operation (+,-,*,/) : ");
        char operation = scanner3.next().charAt(0);

        switch(operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
        }
        
        System.out.println("The result of "+operation+" on "+number1+" and "+number2+" is "+result);
            
        }

    }

