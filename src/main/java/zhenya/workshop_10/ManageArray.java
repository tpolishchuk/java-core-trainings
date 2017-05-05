package zhenya.workshop_10;

import java.util.ArrayList;
import java.util.Collections;

public class ManageArray {

    protected static ArrayList<Integer> generateArrayList(int size, int range) {
        ArrayList<Integer> generatedArrayList = new ArrayList<Integer>(size);

        for (int i = 0; i < size; i++) {
            generatedArrayList.add(i, (int) (Math.random() * range + 1));
        }
        return generatedArrayList;
    }

    protected static ArrayList<Integer> generateArrayList(int size) {
        ArrayList<Integer> generatedArrayList = generateArrayList(size, 100);

        return generatedArrayList;
    }

    protected static ArrayList<Integer> chooseEvenMembers(ArrayList<Integer> initialArray) {
        ArrayList<Integer> evenMembers = new ArrayList<Integer>();

        for (int i = 0; i < initialArray.size(); i++) {
            if (isEven(initialArray.get(i))) {
                evenMembers.add(initialArray.get(i));
            }
        }
        return evenMembers;
    }

    protected static ArrayList<Integer> chooseOddMembers(ArrayList<Integer> initialArray) {
        ArrayList<Integer> oddMembers = new ArrayList<Integer>();

        for (int i = 0; i < initialArray.size(); i++) {
            if (!isEven(initialArray.get(i))) {
                oddMembers.add(initialArray.get(i));
            }
        }
        return oddMembers;
    }

    protected static boolean isEven(int value) {
        boolean even;

        if (value % 2 == 0) {
            even = true;
        }
        else {
            even = false;
        }
        return even;
    }

    protected static ArrayList<Integer> generateFibonacciArray(int size) {
        ArrayList<Integer> array = new ArrayList<Integer>(size);

        array.add(0, 0);
        array.add(1, 1);

        for (int i = 2; i < 12; i++) {
            array.add(i, array.get(i - 2) + array.get(i - 1));
        }
        return array;
    }

    protected static int countOccurrences(ArrayList<Integer> arrayToCount, ArrayList<Integer> arraySource) {

        int numberFound = 0;

        for (int i = 0; i < arrayToCount.size(); i++) {
            if (arraySource.contains(arrayToCount.get(i))) {
                numberFound = numberFound + 1;
            }
        }
        return numberFound;
    }

    protected static void getOccurrences(ArrayList<Integer> arrayToCount, ArrayList<Integer> arraySource) {

        for (int i = 0; i < arrayToCount.size(); i++) {
            if (arraySource.contains(arrayToCount.get(i))) {
                int occurrences = Collections.frequency(arraySource, arrayToCount.get(i));
                if (occurrences == 1) {
                    System.out.println(arrayToCount.get(i) + " - found 1 time");
                }
                else {
                    System.out.println(arrayToCount.get(i) + " - found " + occurrences + " times");
                }
            }
        }
    }
}
