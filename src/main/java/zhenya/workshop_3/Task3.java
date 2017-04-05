package zhenya.workshop_3;

import org.apache.commons.lang.math.RandomUtils;


public class Task3 {

    private static final int luckyNumber = 10;

    public static void main(String[] args) {
        playLottery(1, 5);
        playLottery(100, 60);
        playLottery(-1, 600);
    }

    private static void playLottery(int maximumIntForRandomGenerator, int durationInSeconds) {
        if (maximumIntForRandomGenerator < 0) {
            System.out.println(
                    "Cannot generate integers from 0 to your value. Please, define positive integer maximum value for generator");
        }
        else {
            boolean won = false;
            long startTime = System.currentTimeMillis(); //fetch starting time
            int generatedNumber;

            while ((System.currentTimeMillis() - startTime) < (durationInSeconds * 1000)) {
                generatedNumber = RandomUtils.nextInt(maximumIntForRandomGenerator);
                if (generatedNumber == luckyNumber) {
                    won = true;
                    System.out.println("You won with number " + luckyNumber);
                    break;
                }
            }
            if (!won) {
                System.out.println("Your game was not successful, try again");
            }
        }
    }
}
