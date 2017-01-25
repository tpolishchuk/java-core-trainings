package serhat.workshop_2;

/**
 * Created by serhatgemici on 25/01/2017.
 */
public class Task3 {

    public static void main(String[] args) {
       System.out.println(overloading(1));
        System.out.println(overloading(1, 2));
        System.out.println(overloading(1, 2, 3));
        System.out.println(overloading(1, 2, 3, 4));
        System.out.println(overloading(1, 2, 3, 4, 5));

    }

    private static int overloading(int param1) {

        return param1;

    }

    private static int overloading(int param1, int param2) {

        return param1 * param2;

    }

    private static int overloading(int param1, int param2, int param3) {

        return param1 * param2 * param3;

    }

    private static int overloading(int param1, int param2, int param3, int param4) {

        return param1 * param2 * param3 + param4;

    }

    private static int overloading(int param1, int param2, int param3, int param4, int param5) {

        return param1 * param2 * param3 + param4 - param5;

    }
}
