package main.java.CalculatorWithAClient;


public class BasicCalculator {

    public double add(double number1, double number2){
        return number1+number2;
    }

    public double sub(double number1,double number2){
        return number1-number2;
    }

    public double mul(double number1,double number2){
        return number1*number2;
    }

    public double div(double number1,double number2){
        if(number2==0){
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return number1/number2;
    }

}