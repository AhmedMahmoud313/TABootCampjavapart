package com.bootcampexercies.module2.activity;

public class FindInArray {
    static int arr[] = {1,3,5,7,9,10};
    static int largest()
    {
        int i;
        int max = arr[0];
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    public static void main(String[] args)
    {
        System.out.println("Largest array is " + largest());
    }
}
