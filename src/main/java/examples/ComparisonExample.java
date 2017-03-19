package examples;

public class ComparisonExample {

    public static void main(String[] args) {
        intPrimitivesComparison();
        charPrimitivesComparison();
        integerObjectsComparison();
        stringObjectsComparison();
    }

    private static void intPrimitivesComparison() {
        int x = 5;
        int y = 5;
        System.out.println(String.format("\nint x = %d;\nint y = %d;", x, y));
        System.out.println(String.format("Primitives comparison by reference or memory location with operator ==\n" +
                                         "x == y --> %s", x == y));
    }

    private static void charPrimitivesComparison() {
        char x = 'a';
        char y = 'a';
        System.out.println(String.format("\nchar x = '%s';\nchar y = '%s';", x, y));
        System.out.println(String.format("Primitives comparison by reference or memory location with operator ==\n" +
                                         "x == y --> %s", x == y));
    }

    private static void integerObjectsComparison() {
        Integer x = new Integer(5); //one link in memory is created
        Integer y = new Integer(5); //another link in memory is created
        System.out.println(String.format("\nInteger x = new Integer(%d);\nInteger y = new Integer(%d);", x, y));
        compareByReferenceLocation(x, y);
        compareByValue(x, y);
    }

    private static void stringObjectsComparison() {
        String x = new String("Banana"); //one link in memory is created
        String y = new String("Banana"); //another link in memory is created
        System.out.println(String.format("\nString x = new String(\"%s\");\nString y = new String(\"%s\");", x, y));
        compareByReferenceLocation(x, y);
        compareByValue(x, y);
    }

    private static void compareByReferenceLocation(Object x, Object y) {
        System.out.println(String.format("Objects comparison by reference or memory location with operator ==\n" +
                                         "x == y --> %s", x == y));
    }

    private static void compareByValue(Object x, Object y) {
        System.out.println(String.format("Objects comparison by value with method equals()\n" +
                                         "x.equals(y) --> %s\ny.equals(x) --> %s",
                                         x.equals(y), y.equals(x)));

    }
}
