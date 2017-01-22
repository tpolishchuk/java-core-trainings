package kateryna.workshop_2;

/**
 * Created by kate on 22.01.17.
 */
public class Task_3 {
    public static void main(String[] args) {
        double result = calcFeetAndInchesToCentimetres(2.34,5.15);
        System.out.println(result);
        double newResult = calcFeetAndInchesToCentimetres(14);
        System.out.println(newResult);

    }

    private static double calcFeetAndInchesToCentimetres(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double centimetres = ((feet * 12) + inches) * 2.54;
            return centimetres;
        } else {
            return -1;
        }
    }

    private static double calcFeetAndInchesToCentimetres(double inches) {
        if (inches >= 0) {
            double leftoverInches = inches % 12;
            double feet = ( inches - leftoverInches ) / 12;
            double centimetres = calcFeetAndInchesToCentimetres (feet, leftoverInches);
            return centimetres;
        } else {
            return -1;
        }
    }


}
