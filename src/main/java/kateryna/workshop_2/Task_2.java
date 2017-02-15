package kateryna.workshop_2;

/**
 * Created by kate on 22.01.17.
 */
public class Task_2 {
    private static void calculateXByQuadraticFormula(int a, int b, int c) {
        if (a == 0) {
            System.out.println("Not a quadratic equation!\n");
        } else {
            double D = Math.pow(b, 2) - 4 * a * c;
            if (D < 0) {
                System.out.println("The equation has no solutions\n");
            } else {
                double x1 = (-b + Math.sqrt(D) / (2 * a));
                double x2 = (-b - Math.sqrt(D) / (2 * a));
                System.out.printf(
                        "Calculating x by quadratic formula\n a = %d\n b = %d\n c = %d\n x1 = %.2f\n x2 = %.2f\n\n",
                        a, b, c, x1, x2
                );
            }
        }
    }

    public static void main(String[] args) {
        calculateXByQuadraticFormula(1, 8, -5);
        calculateXByQuadraticFormula(-8, 10, 14);
        calculateXByQuadraticFormula(2, -4, 7);
        calculateXByQuadraticFormula(1, 6, 9);
        calculateXByQuadraticFormula(0, -9, 100);


    }
}
