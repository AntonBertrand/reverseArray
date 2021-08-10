package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        printArray(sortIntegers(getIntegers(5)));

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        Scanner scanner = new Scanner((System.in));
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

        int[] sortedArray = new int[array.length];
        int j = 0;

        for(int i = array.length-1; i >= 0; i--) {
            sortedArray[j] = array[i];
            j++;
        }
        return sortedArray;
    }



}
