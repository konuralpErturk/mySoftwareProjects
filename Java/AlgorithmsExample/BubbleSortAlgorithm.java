package com.example;

import java.util.Random;

public class BubbleSortAlgorithm {
    public static void main(String[] args)
     {
        Random rand = new Random();
        int[] numbers = new int[10];
        
        for(int i=0; i<numbers.length; i++)
        {
            numbers[i] = rand.nextInt(100000);
        }

        System.out.println("Before: ");
        printArray(numbers);

        boolean swappedSomething = true;

        while(swappedSomething)
        {
            swappedSomething = false;

            for(int i=0; i<numbers.length -1;i++)
            {
                if(numbers[i] > numbers[i+1])
                {
                    swappedSomething = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                }
            }
        }
        System.out.println("After: ");
        printArray(numbers);
    }

    private static void printArray(int[] numbers) {
        for (int i : numbers) {
            System.out.println(i); 
        }
    }
}
 