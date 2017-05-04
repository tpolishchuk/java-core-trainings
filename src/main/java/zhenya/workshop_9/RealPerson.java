package zhenya.workshop_9;

import java.util.Scanner;

public class RealPerson extends Player {

    private Scanner scanner;

    protected RealPerson(String name) {
        super(name);
    }

    protected int typeRandomInt(int range) {
        System.out.println(getName() + ", please, enter your number from 0 to " + range + ". \r");

        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }
}
