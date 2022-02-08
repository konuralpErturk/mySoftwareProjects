package com.example;

import java.util.Random;

public class QuickSortAlgorithm 
{
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[5];

        for(int i=0; i< numbers.length; i++)
        {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before");
        printArray(numbers);

        quickSortAlgorithm(numbers);

        System.out.println("After");
        printArray(numbers);
    }

    private static void quickSortAlgorithm(int[] numbers) 
    {
        quickSortAlgorithm(numbers, 0, numbers.length -1);
    }

    private static void quickSortAlgorithm(int[] numbers, int lowIndex, int highIndex) 
    {
        if(lowIndex >= highIndex)
        {
            return;
        }

        int pivot = numbers[highIndex];  
        
        int leftPointer = partition(numbers, lowIndex, highIndex, pivot);

        quickSortAlgorithm(numbers, lowIndex, leftPointer -1);
        
        quickSortAlgorithm(numbers, leftPointer +1, highIndex);
    }

    private static int partition(int[] numbers, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer)
        {
            while(numbers[leftPointer] <= pivot && leftPointer < rightPointer)
            {
                leftPointer++;
            }
            while(numbers[rightPointer] >= pivot && leftPointer < rightPointer)
            {
                rightPointer--;
            }

            swap(numbers, leftPointer, rightPointer);
        }

        swap(numbers, leftPointer, highIndex);
        return leftPointer;
    }

    private static void swap(int[] numbers, int index1, int index2)
    {
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }

    private static void printArray(int[] numbers) {
        for (int i : numbers) {
            System.out.println(i); 
        }
    }
}