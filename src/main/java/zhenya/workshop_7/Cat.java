package zhenya.workshop_7;

public class Cat {
    String name;
    int age = 0;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format(getClass().getSimpleName() + "{name='%s', age='%d'}", getName(), getAge());
    }
}
