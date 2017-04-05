package serhat.workshop_3;

import org.apache.commons.lang.math.RandomUtils;

import static java.lang.System.currentTimeMillis;

/**
 * Created by serhatgemici on 09/02/2017.
 */
public class Task3 {

    private static final int luckyNumber = 10;

    public static void main(String[] args) {
        playLottery(1, 5);
        playLottery(100, 600);
        playLottery(-1, 600);
    }

    private static void playLottery(int maximumIntForRandomGenerator, int durationInSeconds) {

        long initiationTime = System.currentTimeMillis();


        if (maximumIntForRandomGenerator < 0) {

            System.out.println("Cannot generate integers from 0 to your value. Please, define positive integer maximum value for generator");

        } else {

            long randomNumber = RandomUtils.nextInt(maximumIntForRandomGenerator);
            System.out.println("Random number is : "+ randomNumber);


            for (long i = (System.currentTimeMillis() - initiationTime); i < (durationInSeconds * 1000); i++) {

                if (luckyNumber == randomNumber) {

                    System.out.println("You won with number " + luckyNumber);

                }
            }

            if(luckyNumber!=randomNumber){

                System.out.println("Your game was not successful, try again");
            }
        }
    }
}

