
/* Write a method, which generates integer numbers during defined amount of seconds and detects,
      whether random integer number equals your 'lucky number'. You also should define a range of integers for generation.
        If generated number equals 'lucky number', write to console:
        "You won with number " + luckyNumber
        If during defined amount of seconds your 'lucky number' was not equal to any generated number, write to console:
        "Your game was not successful, try again"
        If range for generated integers is set as negative value, write to console:
        "Cannot generate integers from 0 to your value. Please, define positive integer maximum value for generator"
*/


package srijana.workshop_3;



import java.util.Date;
import java.util.Random;


public class Task_5 {

    private static final int luckyNumber = 7;

    public static void main(String[] args) {

        playLottery(1000, 5);
    }


    private static void playLottery(int maximumIntForRandomGenerator, int durationInSeconds){

        long startTime = new Date().getTime();

        while(true) {
            Random randGen = new Random();
            int randomnum = randGen.nextInt(maximumIntForRandomGenerator);

            if(randomnum == luckyNumber) {
                System.out.println(randomnum);
                System.out.println("You won with number " + luckyNumber);
                break;
            }

            long endTime = new Date().getTime();

            if(endTime - startTime > durationInSeconds * 1000) {
                System.out.println("Your game was not successful, try again");
                break;
            }

        }
    }

}
