package kateryna.workshop_2;

/**
 * Created by kate on 22.01.17.
 */
public class Task_1 {
    private static void analyzeGivenIntValue(int value){
        System.out.printf("Argument value: %d\n", value);
        if (value <= 100) {
            System.out.printf("Given argument value is less or equals 100\n\n" );
        }
        else if (value > 100 && value <= 200){
            System.out.printf("Given argument value is between 100 and 200\n\n");
        }
        else if (value > 200 && value <= 500){
            System.out.printf("Given argument value is between 200 and 500\n\n");
        }
        else {
            System.out.printf("Given argument value is more 500\n\n");
        }

    }

    public static void main(String[] args) {
        analyzeGivenIntValue(2);
        analyzeGivenIntValue(300);
        analyzeGivenIntValue(1000);
        analyzeGivenIntValue(200);
        analyzeGivenIntValue(500);

    }
}
