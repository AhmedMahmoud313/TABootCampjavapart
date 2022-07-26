package com.bootcampexercies.module2.activity;

public class PrintNumWithWhile {
    public static void main(String args[]) {
        int num = 100;
        System.out.print("Odd Numbers from 1 to "+num+" are: ");
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
