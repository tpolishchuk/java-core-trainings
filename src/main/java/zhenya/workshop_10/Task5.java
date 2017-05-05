package zhenya.workshop_10;

import java.util.ArrayList;

public class Task5 {

    public static void main(String[] args) {
        ManageArray manageArray = new ManageArray();

        ArrayList<Integer> fibonacciArray = manageArray.generateFibonacciArray(12);
        ArrayList<Integer> randomIntArray = manageArray.generateArrayList(100, 150);

        System.out.println("Fibonacci array: " + fibonacciArray);
        System.out.println("Random int array: " + randomIntArray);

        System.out.println("\nFound " + manageArray.countOccurrences(fibonacciArray, randomIntArray) + " Fibonacci numbers:");
        manageArray.getOccurrences(fibonacciArray, randomIntArray);
    }
}
