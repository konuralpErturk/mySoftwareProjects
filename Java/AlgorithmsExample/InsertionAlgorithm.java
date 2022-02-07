package com.example;

import java.util.Random;

public class InsertionAlgorithm {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[5];

        for(int i=0; i< numbers.length; i++)
        {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("After");
        printArray(numbers);
    }

    private static void insertionSort(int[] numbersArray) 
    {
        for (int i = 1; i < numbersArray.length; i++) 
        {
            int currentValue = numbersArray[i];
            int j = i-1;
            
            while(j>=0 && numbersArray[j] > currentValue)
            {
                numbersArray[j+1] = numbersArray[j];
                j--;
            }

            numbersArray[j+1]=currentValue;
        }
    }


    private static void printArray(int[] numbers) 
    {
        for (int i : numbers) 
        {
            System.out.println(i); 
        }
    }
}
