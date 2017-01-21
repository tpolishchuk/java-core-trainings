package zhenya.workshop_1;

public class Tasks {



    public static String getIntAsString(int x) {
        x = 12;
        return String.valueOf(x);
    }

    public static String getIntAsString2(int x) {
        x = 12;
        return Integer.toString(x);
    }

    //2. Write a short method, which takes String as an argument and returns it as int.
    // If String cannot be converted to int, display this information with System.out.println() to user

    private int getStringAsInt2(String someString) {
        int x;
        try {
            x = Integer.parseInt(someString);
            return x;
        } catch (NumberFormatException e) {
            System.out.println("unable to parse int from a string");
            throw new IllegalStateException("Exception output" + e.getMessage());
        }
    }

    //3. Write a short method, which takes 0 or 1 as an argument. It should return false if an argument was 0.
    // It should return true if an argument was 1. It should display an error if an argument does not equal 0 or 1
    public static Boolean getTrue(int arg) {
        switch (arg) {
            case 0:
                return false;
            case 1:
                return true;
            default:
                throw new IllegalStateException("Argument is not 1 or 0");
        }
    }

    //4. Write a method, which displays the effect of logical operations for given boolean arguments
    //argument #1 = true, argument #2 = true
    //argument #1 OR argument #2 = true
    //argument #1 AND argument #2 = true
    // argument #1 XOR argument #2 = false
    // NOT argument #1 = false
    //  NOT argument #2 = false

    public static void displayResultsOfLogicalOperations(boolean a, boolean b) {
        System.out.println(String.format("argument #1 = %s, argument #2 = %s", a, b));
        System.out.println("argument #1 OR argument #2 = " + (a || b));
        System.out.println("argument #1 AND argument #2 = " + (a && b));
        System.out.println("argument #1 ^ argument #2 = " + (a ^ b));
        System.out.println("NOT argument #1 = " + !a);
        System.out.println("NOT argument #2 = " + !b);
    }

    public static void main(String[] args) {

        //task4
        displayResultsOfLogicalOperations(true, true);
        displayResultsOfLogicalOperations(false, true);
        displayResultsOfLogicalOperations(true, false);
        displayResultsOfLogicalOperations(false, false);

        //taskBonus
        double a = 20;
        double b = 80;
        reminderLimit(a, b);
    }

    // BONUS
    // 1. Create a double variable with the value 20
    // 2. Create a second variable of type double with the value 80
    // 3. Add both numbers up and multiply by 25
    // 4. Use the reminder operator to figure out the reminder from the sum of #3 divided by 40
    // 5. Write an "if" statement that displays a message "Total was over the limit"
    //  if the remaining total (#4) is equal to 20 or less

    public static void reminderLimit(double a, double b){
        System.out.println("*Bonus task*");
        double sum = (a + b) * 25;
        double reminder = sum % 40;
        if (reminder <= 20){
            System.out.println("Total was over the limit");
        }
    }
}
