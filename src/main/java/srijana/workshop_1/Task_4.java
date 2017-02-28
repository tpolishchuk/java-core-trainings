//4. Write a method, which displays the effect of logical operations for given boolean arguments
//argument #1 = true, argument #2 = true
//argument #1 OR argument #2 = true
//argument #1 AND argument #2 = true
// argument #1 XOR argument #2 = false
// NOT argument #1 = false
//  NOT argument #2 = false


package srijana.workshop_1;
public class Task_4 {
        public static void displayResultsOfLogicalOperations(boolean a, boolean b) {
                System.out.println(String.format("argument #1 = %s, argument #2 = %s", a, b));
                System.out.println("argument #1 OR argument #2 = " + (a || b));
                System.out.println("argument #1 AND argument #2 = " + (a && b));
                System.out.println("argument #1 ^ argument #2 = " + (a ^ b));
                System.out.println("NOT argument #1 = " + !a);
                System.out.println("NOT argument #2 = " + !b);
        }

        public static void main(String[] args) {


                displayResultsOfLogicalOperations(true, true);
                displayResultsOfLogicalOperations(false, true);
                displayResultsOfLogicalOperations(true, false);
                displayResultsOfLogicalOperations(false, false);


        }
}