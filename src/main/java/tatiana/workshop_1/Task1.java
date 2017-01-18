package tatiana.workshop_1;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Returned int as string: " + getIntAsString(1));
        System.out.println("Returned int as string: " + getIntAsString(18));
        System.out.println("Returned int as string: " + getIntAsString(44));
    }

    private static String getIntAsString(int someInt) {
        return String.valueOf(someInt);
    }
}
