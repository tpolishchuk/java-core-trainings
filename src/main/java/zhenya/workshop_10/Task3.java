package zhenya.workshop_10;

import java.util.ArrayList;

public class Task3 {

    private static final int SIZE = 50;

    public static void main(String[] args) {
        ManageArray manageArray = new ManageArray();

        ArrayList<Integer> generatedArrayList = manageArray.generateArrayList(SIZE);

        for (int i = 0; i < generatedArrayList.size(); i++) {
            if (manageArray.isEven(generatedArrayList.get(i))) {
                generatedArrayList.remove(i);
            }
        }
        System.out.println("Generated array without even members: " + generatedArrayList);
    }
}
