package zhenya.workshop_10;

import java.util.ArrayList;

public class Task2 {

    private static final int SIZE = 50;

    public static void main(String[] args) {
        ManageArray manageArray = new ManageArray();
        ArrayList<Integer> generatedArrayList = manageArray.generateArrayList(SIZE);

        System.out.println("Generated array: " + generatedArrayList);

        System.out.println("Even members: " + manageArray.chooseEvenMembers(generatedArrayList));
        System.out.println("Odd members: " + manageArray.chooseOddMembers(generatedArrayList));
    }
}
