package zhenya.workshop_9;

public class Bot extends Player {

    protected Bot(String name) {
        super(name);
    }

    protected int typeRandomInt(int range) {
        int valueBot = (int) (Math.random() * range + 1);
        System.out.println(getName() + " choose number " + valueBot);
        return valueBot;
    }

}
