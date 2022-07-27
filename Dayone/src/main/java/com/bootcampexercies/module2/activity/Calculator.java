package com.bootcampexercies.module2.activity;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int num1,num2,total;
        double avg;
        int mul;
        double sub;
        float divide;

        System.out.println("Enter 2 number");

        num1=input.nextInt();

        num2=input.nextInt();

        total=sum(num1,num2);

        avg=average(num1,num2);
        mul=multy(num1,num2);
        sub=sub(num1,num2);
        divide=divide(num1,num2);
        display(total,avg,mul,sub,divide);

    }

    public static int sum(int num1,int num2)

    {

        return num1+num2;

    }
    public static int sub(int num1,int num2)

    {

        return num1-num2;

    }

    public static double average(int num1,int num2)

    {

        return sum(num1,num2)/2;

    }
    public static int multy(int num1,int num2)

    {

        return num1*num2;

    }
    private static int divide(int num1, int num2) {
        int divValue = 0;
        if (num1 == 0 && num2 == 0) {
            System.out.println("Dividing 0 with 0 is impossible");
        } else if (num1 == 0) {
            System.out.println("Division by 0 is impossible");

        } else {
            divValue = num1 / num2;
        }
        return divValue;
    }

    public static void display(int sum,double average,int mul,double sub,float divide)

    {

        System.out.println("The sum  is:"+sum);
        System.out.println("The average  is:"+average);
        System.out.println("The multply  is:"+mul);
        System.out.println("The subtract  is:"+sub);
        System.out.println("The divide  is:"+divide);

    }

}
