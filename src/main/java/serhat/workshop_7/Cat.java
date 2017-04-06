package serhat.workshop_7;

/**
 * Created by serhatgemici on 06.04.17.
 */
public class Cat {

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {

        return System.out.format("Cat{name='%s', age='%d'} \n", this.name, this.age).toString();
    }
}
