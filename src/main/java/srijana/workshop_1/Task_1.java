

// Write a short method, which takes int as an argument and returns it as String
package srijana.workshop_1;

/**
 *
 * @author srijana
 */
public class Task_1 {
   
    public static void main(String[] args)
    {
        System.out.println(convertIntToString(5));
    }
    
    private static String convertIntToString(int x) 
    {
        return Integer.toString(x);
    } 
}
