package serhat.workshop_2;

public class Task1 {

    public static void main(String[] args) {
        analyzeGivenIntValue(2);
        analyzeGivenIntValue(300);
        analyzeGivenIntValue(1000);
    }

    //workshop2 Task #1
    private static void analyzeGivenIntValue(int valueToBeAnalyzed) {
        if (valueToBeAnalyzed <= 100)
            System.out.println("Given argument value is less or equals 100");
        else if ((valueToBeAnalyzed > 100) && (valueToBeAnalyzed <= 200))
            System.out.println("Given argument value is between 100 and 200");
        else if ((valueToBeAnalyzed > 200) && (valueToBeAnalyzed <= 500))
            System.out.println("Given argument value is between 200 and 500");
        else if (valueToBeAnalyzed > 500)
            System.out.println("Given argument value is more 500");
    }
}
