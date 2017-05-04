package zhenya.workshop_9;

import java.util.Random;

public class BrandsSort {

    private static final String[] brands = {"Toyota", "Citroen", "Mercedes", "BMW", "Mini", "Ford", "Nissan", "Audi"};
    private static final int RANGE = 8;

    public static void main(String[] args) {

        String[] generateRandomBrands = generateRandomBrands(RANGE);
        System.out.println("As it is: ");
        for (String brand : generateRandomBrands)
            System.out.println(brand);

        String[] sortedBrands = sortBrands(generateRandomBrands);
        System.out.println("\nSorted: ");
        for (String brand : sortedBrands)
            System.out.println(brand);
    }

    private static String[] generateRandomBrands(int range) {
        String[] generatedBrands = new String[range];
        int idx;

        for (int i = 0; i < range; i++) {
            idx = new Random().nextInt(range);
            generatedBrands[i] = (brands[idx]);
        }
        return generatedBrands;
    }

    private static String[] sortBrands(String[] brands) {
        String[] sortedBrands = brands;

        boolean flag = true;
        String temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedBrands.length - 1; i++) {
                if (sortedBrands[i].compareTo(sortedBrands[i + 1]) > 0) {
                    temp = sortedBrands[i];
                    sortedBrands[i] = sortedBrands[i + 1];
                    sortedBrands[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedBrands;
    }
}
