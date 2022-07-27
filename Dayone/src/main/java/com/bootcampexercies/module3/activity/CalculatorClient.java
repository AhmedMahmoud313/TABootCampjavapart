package com.bootcampexercies.module3.activity;

public class CalculatorClient {
    public static void main(String[] args) {


        Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_BASIC);

        System.out.println("*** Calculations will be performed using "+normalCalc.getCalculatorType()+ " calculator ***");


        int result = normalCalc.add(1, 2);
        System.out.println("1) Add result is " + result);



        int[] mul = {1, 2, 3};
        //TODO Complete the code: result should be equal to the normalCalc multiply function and int array mul should be multiplied.
        System.out.println("2) Multiplication result is " + result);



        float divided = normalCalc.divide(20,2);
        System.out.println("Result - 20 % 2 = "+divided);



        int subtract = normalCalc.subtract(10, 2);
        System.out.println("Result 10 - 2 = "+subtract);

    }
}
