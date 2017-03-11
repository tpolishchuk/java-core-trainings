package zhenya.workshop_2;

public class Tasks {

    public static void main(String[] args) {
        System.out.println("*Task 1*");
        analyzeGivenIntValue(2);
        analyzeGivenIntValue(300);
        analyzeGivenIntValue(1000);
        analyzeGivenIntValue(100000000);

        System.out.println("\n*Task 2*");
        calculateXByQuadraticFormula(1, 8, -5);
        calculateXByQuadraticFormula(-8, 10, 14);
        calculateXByQuadraticFormula(3, 4, 2);
        calculateXByQuadraticFormula(9, 12, 4);

        System.out.println("\n*Task 3*");
        System.out.println(carDetails("Toyota", "Yaris", 2013, "2"));
        System.out.println(carDetails(2015, "Toyota", "Auris", "Ed.124"));
        System.out.println(carDetails("Toyota", "RAV4", "v15"));
        System.out.println(carDetails("Toyota", "Camry", 2017));
    }

    /*------TASK 1------*/
    /*Write a method, which informs user about given int argument in the following way:
            - if argument <= 100, write to user "Given argument value is less or equals 100"
            - if argument is between 100 and 200, write to user "Given argument value is between 100 and 200"
            - if argument is between 200 and 500, write to user "Given argument value is between 200 and 500"
            - if argument > 500, write to user "Given argument value is more 500"*/
    private static void analyzeGivenIntValue(int value) {
        String result;
        if (value <= 100) {
            result = "Given argument value is less or equals 100";
        }
        else if ((value > 100) && (value <= 200)) {
            result = "Given argument value is between 100 and 200";
        }
        else if ((value > 200) && (value <= 500)) {
            result = "Given argument value is between 100 and 200";
        }
        else {
            result = "Given argument value is more 500";
        }
        System.out.println("Argument value: " + value + "\n" + result);
    }

    /*------TASK 2------*/
    /*Calculate x values by common quadratic formula. Set a, b, c as arguments in your calculation method*/
    private static void calculateXByQuadraticFormula(int a, int b, int c) {
        double d = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        System.out.println("Calculating x by quadratic formula a = " + a + ", b = " + b + ", c = " + c + ".");
        if (d > 0) {
            double x1 = (-b + d) / (2 * a);
            double x2 = (-b - d) / (2 * a);
            System.out.println("There are two solutions' values: x1 = " + String.format("%.2f", x1) + " and x2 = " +
                               String.format("%.2f", x2) + "\n");
        }
        else if (d == 0) {
            double x1 = (double) (-b) / (2 * a);
            System.out.println("There is one \"repeated\" solution value: x1 = x2 = " + String.format("%.2f", x1) + "\n");
        }
        else {
            System.out.println("There is no solution\n");
        }
    }

    /*------TASK 3------*/
    /*Create 5 methods which demonstrate principles of method overloading as you understand it  from Lektion 31.*/
    private static String carDetails(String make, String model, int year, String edition) {
        if (year == 0000) {
            return make + " " + model + " unknown year " + edition;
        }
        return make + " " + model + " " + year + " " + edition;
    }

    private static String carDetails(int year, String make, String model, String edition) {
        return carDetails(make, model, year, edition);
    }

    private static String carDetails(String make, String model, String edition) {
        return carDetails(make, model, 0000, edition);
    }

    private static String carDetails(String make, String model, int year) {
        return carDetails(make, model, year, "");
    }
}
