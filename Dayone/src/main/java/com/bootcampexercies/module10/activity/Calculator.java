package com.bootcampexercies.module10.activity;

public class Calculator {

    public int add(int value1, int value2) {
        int result = value1 + value2;
        return result;
    }

    public double add(double value1, double value2, double value3) {
        double result = value1+ value2+ value3;
        return result;
    }

    public int subtract( int value1, int value2) {
        int result = value1 - value2;
        return result;
    }

    public double divide(double numerator, double denominator) {
        double result = 0.0;
        try {
            result = numerator/denominator;
            return result;
        }
        catch(ArithmeticException e) {
            System.out.println("Exception! Division by zero not possible");
        }
        return result;
    }

    public double multiply(double value1, double value2) throws MultiplicationCustomException{
        double result = 0.0;
        if (value1 == 0 || value2 == 0)
        {
            throw new MultiplicationCustomException("Exception! Multiplication with 0 not allowed");
        }
        result = value1 * value2;
        return result;

    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
}

class MultiplicationCustomException  extends Exception
{
    public MultiplicationCustomException (String str)
    {
        super(str);

    }
}







