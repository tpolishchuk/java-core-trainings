package zhenya.workshop_7;

public class Executor {

    public static void main(String[] args) {
        System.out.println("Task1\n");

        RandomIntegersGenerator randomIntegersGenerator = new RandomIntegersGenerator();
        randomIntegersGenerator.generateRandomStuff(5);

        System.out.println("\n");
        RandomStringsGenerator randomStringsGenerator = new RandomStringsGenerator();
        randomStringsGenerator.generateRandomStuff(5);

        System.out.println("\n");
        RandomCatsGenerator randomCatsGenerator = new RandomCatsGenerator();
        randomCatsGenerator.generateRandomStuff(2);

        System.out.println("\n");
        RandomHamsterGenerator randomHamsterGenerator = new RandomHamsterGenerator();
        randomHamsterGenerator.generateRandomStuff(1);

        System.out.println("\nTask2\n");

        Table table1 = new Table(10001, "BEKANT", 519);
        Table table2 = new Table(10002, "BEKANT", 519);
        Table table3 = new Table(10003, "BJURSTA", 199);
        Table table4 = new Table(10004, "BJURSTA", 465);

        System.out.println(String.format("%s equals %s => %s", table1.toString(), table2.toString(), table1.equals(table2)));
        System.out.println(String.format("%s equals %s => %s", table2.toString(), table3.toString(), table2.equals(table3)));
        System.out.println(String.format("%s equals %s => %s", table3.toString(), table4.toString(), table3.equals(table4)));
    }
}
