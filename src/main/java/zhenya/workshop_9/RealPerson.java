package zhenya.workshop_9;

import java.util.Scanner;

public class RealPerson extends Player {

    public Scanner scanner;

    public RealPerson(String name) {
        super(name);
    }

    public int typeRandomInt(int range) {
        System.out.println(getName() + ", please, enter your number from 0 to " + range + ". \r");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        return num;
    }
}
