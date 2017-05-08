package zhenya.workshop_10;

import java.util.ArrayList;

public class Task1 {

    private static final int RANGE = 10;

    public static void main(String[] args) {
        int[] initialArray = generateArray(RANGE);

        System.out.println("Converted array " + convertArray(initialArray));
    }

    private static int[] generateArray(int range) {
        int[] generatedArray = new int[range];

        for (int i = 0; i < range; i++) {
            generatedArray[i] = (int) (Math.random() * 100 + 1);
        }

        return generatedArray;
    }

    private static ArrayList<Integer> convertArray(int[] initialArray) {
        ArrayList<Integer> convertedArray = new ArrayList<>();

        for (int i = 0; i < initialArray.length; i++) {
            convertedArray.add(i, initialArray[i]);
        }
        return convertedArray;
    }
}
