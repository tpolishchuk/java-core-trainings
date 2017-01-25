package serhat.workshop_2;

import java.text.DecimalFormat;

/**
 * Created by serhatgemici on 25/01/2017.
 */
public class Task2 {

    public static void main(String[] args) {
        calculateXByQuadraticFormula(1, 3, 3);
        calculateXByQuadraticFormula(1, 8, -5);
        calculateXByQuadraticFormula(-8, 10, 14);
        calculateXByQuadraticFormula(-500, 102, 149);
    }

    private static double calculateXByQuadraticFormula(int a, int b, int c) {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Calculating x by quadratic formula");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);
        double bSquared = Math.pow(b, 2);
        if (bSquared - 4 * a * c < 0)
            System.out.println("No real number solution");
        else {
            double numerator1 = (-1 * b) + Math.sqrt(bSquared - 4 * a * c);
            double numerator2 = (-1 * b) - Math.sqrt(bSquared - 4 * a * c);
            double denominator = 2 * a;
            System.out.println("x1= " + df.format(numerator1 / denominator));
            System.out.println("x2= " + df.format(numerator2 / denominator));
        }

        return 0;
    }
}
