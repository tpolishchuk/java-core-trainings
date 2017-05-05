package zhenya.workshop_10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task4 {

    private static final int SIZE = 50;
    private static final int RANGE = 25;

    public static void main(String[] args) {
        ManageArray manageArray = new ManageArray();

        ArrayList<Integer> generatedArrayList = manageArray.generateArrayList(SIZE, RANGE);

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < generatedArrayList.size(); i++) {
            set.add(generatedArrayList.get(i));
        }

        System.out.println("Initial array: " + generatedArrayList);

        System.out.println("Array without duplicates: " + set);
    }
}
