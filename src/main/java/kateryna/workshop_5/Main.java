package kateryna.workshop_5;

/**
 * Created by car0120 on 05/04/17.
 */
//public class Main {
//    public static void main(String[] args) {
//        Animal animal = new Animal("Animal", 1, 1, 5, 5);
//
//        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
////        dog.eat();
//        dog.walk();
////        dog.run();
//    }
//}



public class Main {
    public static void main(String[] args) {

        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);

    }
}