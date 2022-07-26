package com.bootcampexercies.module2.activity;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int y = 11; y < 20; ++y) {
            for (int x = 11; x < 20; ++x) {
                System.out.printf("%4d", y*x);
            }
            System.out.println();
        }
    }
}
