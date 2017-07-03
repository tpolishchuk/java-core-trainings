/*------TASK 1------*/
    /*Write a method, which informs user about given int argument in the following way:
            - if argument <= 100, write to user "Given argument value is less or equals 100"
            - if argument is between 100 and 200, write to user "Given argument value is between 100 and 200"
            - if argument is between 200 and 500, write to user "Given argument value is between 200 and 500"
            - if argument > 500, write to user "Given argument value is more 500"*/


package srijana.workshop_2;


public class Task_1 {

public static void main(String[]args){

    analyzeGivenIntValue(2);
    analyzeGivenIntValue(300);
    analyzeGivenIntValue(1000);
    analyzeGivenIntValue(100000000);

}

    private static void analyzeGivenIntValue(int value) {
if (value<=100){
    System.out.println("Given argument value is less or equals 100");


        }

else if ((value>100)&&(value<=200)){

    System.out.println("Given argument value is between 100 and 200");


        }
else if ((value>200)&&(value<=500)){

            System.out.println("Given argument value is between 200 and 500");


        }

        else{
    System.out.println("Given argument value is more 500");



}

    }
}


