package com.bootcampexercies.module2.activity;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int y = 11; y <= 20; y++) {
            System.out.println("-- Table  "+y + " --");
            for (int x = 1; x <= 10; x++) {
                System.out.printf(y+"*"+x+"="+y*x);
            }
            System.out.println();
        }
    }
}
