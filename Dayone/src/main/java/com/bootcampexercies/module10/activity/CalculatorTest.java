package com.bootcampexercies.module10.activity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    public CalculatorTest() {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd_int_int() {
        System.out.println("2 integers addition test 1");
        int value1 = 7;
        int value2 = 3;
        Calculator calculator = new Calculator();
        int expResult = 10;
        int result = calculator.add(value1, value2);
        assertEquals(expResult, result);

        System.out.println("2 integers addition test 2");
        value1 = 18;
        value2 = 17;
        expResult = 35;
        result = calculator.add(value1, value2);
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd_double() {
        System.out.println("3 doubles addition test 1");
        double value1 = 7.2;
        double value2 = 4.3;
        double value3 = 8.9;
        Calculator instance = new Calculator();
        double expResult = 20.4;
        double result = instance.add(value1, value2, value3);
        assertEquals(expResult, result, 0.0);

        System.out.println("3 doubles addition test 2");
        value1 = 77.4;
        value2 = 22.3;
        value3 = 1.6;
        instance = new Calculator();
        expResult = 101.3;
        result = instance.add(value1, value2, value3);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of subtract method, of class Calculator.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract test # 1");
        int value1 = 19;
        int value2 = 13;
        Calculator instance = new Calculator();
        int expResult = 6;
        int result = instance.subtract(value1, value2);
        assertEquals(expResult, result);

        System.out.println("subtract test # 2");
        value1 = 100;
        value2 = 22;
        instance = new Calculator();
        expResult = 78;
        result = instance.subtract(value1, value2);
        assertEquals(expResult, result);

    }

    /**
     * Test of divide method, of class Calculator.
     */
    @Test
    public void testDivide() {
        System.out.println("divide test 1");
        double numerator = 16.0;
        double denominator = 2.0;
        Calculator instance = new Calculator();
        double expResult = 8.0;
        double result = instance.divide(numerator, denominator);
        assertEquals(expResult, result, 0.0);

        System.out.println("divide test 2");
        numerator = 10.0;
        denominator = 0.0;
        instance = new Calculator();
        expResult = 0.0;
        result = instance.divide(numerator, denominator);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() throws MultiplicationCustomException {
        System.out.println("multiply test 1");
        double value1 = 5.2;
        double value2 = 3.6;
        Calculator instance = new Calculator();
        double expResult = 18.72;
        double result = instance.multiply(value1, value2);
        assertEquals(expResult, result, 0.0);

        System.out.println("multiply test 2");
        value1 = 13.0;
        value2 = 8.4;
        instance = new Calculator();
        expResult = 109.2;
        result = instance.multiply(value1, value2);
        assertEquals(expResult, result, 0.0);

    }

}

