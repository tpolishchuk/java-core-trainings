package zhenya.workshop_4;

import java.util.Random;

public class Game {

    public static void main(String[] args) {
        Character alice = new Character("Alice", CharacterClass.MONK);
        Character bob = new Character("Bob", CharacterClass.BARBARIAN);
        Character chris = new Character("Chris", CharacterClass.BARBARIAN);
        Character dan = new Character("Dan", CharacterClass.WIZARD);

        fightToDeath(alice, bob, 50, 120);
        alice.healToMaximum();
        bob.healToMaximum();

        fightToDeath(alice, bob, 50, 120);
        alice.healToMaximum();
        bob.healToMaximum();

        fightToDeath(bob, chris, 50, 120);
        bob.healToMaximum();
        chris.healToMaximum();

        fightToDeath(alice, dan, 200, 500);
        alice.healToMaximum();
        dan.healToMaximum();
    }

    // 2. private static void method playFightRound(). This method should:
    // - take Character character1 as argument
    // - take Character character2 as argument
    // - take int maximumCriticalDamage as argument
    // - throw an exception if character1 and character2 have the same character class. Put in a message something like: "%CLASS_NAME% cannot attack %CLASS_NAME%!"
    // - get damage by character1. Damage value should be generated randomly from 0 to maximumCriticalDamage value
    // - get damage by character2. Damage value should be generated randomly from 0 to maximumCriticalDamage value
    // - print to console "%CHARACTER1_NAME% is dead" if character1 is not alive anymore
    // - print to console "%CHARACTER2_NAME% is dead" if character2 is not alive anymore


    private static void playFightRound(Character character1, Character character2, int maximumCriticalDamage) {

        Random random = new Random();
        int damage = random.nextInt(maximumCriticalDamage) + 1;

        character1.getDamage(damage);
        System.out.println("Character " + character1.getNickname() + " received damage " + damage + ". Health left: " + character1.getHealth());

        damage = random.nextInt(maximumCriticalDamage) + 1;
        character2.getDamage(damage);
        System.out.println("Character " + character2.getNickname() + " received damage " + damage + ". Health left: " + character2.getHealth());

        if (!character1.isAlive()) {
            System.out.println(character1.getNickname() + " is dead");
        }
        if (!character2.isAlive()) {
            System.out.println(character2.getNickname() + " is dead");
        }
    }

    //3. private static void method defineWinner(). This method should:
    //- take Character character1 as argument
    //- take Character character2 as argument
    //- take int winnerBonus as argument
    //- give bonus with increaseExperience() to character1, if it's alive and character2 is dead
    //- give bonus with increaseExperience() to character2, if it's alive and character1 is dead
    //- print to console "Both characters are dead. Nobody receives winner bonus" if both characters are dead
    private static void defineWinner(Character character1, Character character2, int winnerBonus) {
        if (character1.isAlive() && !character2.isAlive()) {
            character1.increaseExperience(winnerBonus);
        } else if (character2.isAlive() && !character1.isAlive()) {
            character2.increaseExperience(winnerBonus);
        } else {
            System.out.println("Both characters are dead. Nobody receives winner bonus");
        }
    }

    //4. private static void method fightToDeath(). This method should:
    // - take Character character1 as argument
    // - take Character character2 as argument
    // - take int maximumCriticalDamage as argument
    // - take int winnerBonus as argument
    // - print to console "Fight starts! %CHARACTER1_NAME% vs %CHARACTER2_NAME%"
    // - print to console "Cannot start the battle, because at least one of opponents is still dead" if at least one of characters
    //    is not alive. After it method should exit from execution and not be continued
    // - in an infinite loop while(true), play fight round and if both characters are alive.
    //    If at least one of characters is dead, define winner and exit loop
    private static void fightToDeath(Character character1, Character character2, int maximumCriticalDamage, int winnerBonus) {

        System.out.println("Fight starts! " + character1.getNickname() + " vs " + character2.getNickname());

        if (character1.getCharacterClass().equals(character2.getCharacterClass())) {
            System.out.println(character1.getCharacterClass() + " cannot attack " + character2.getCharacterClass() + "!\n");
            return;
        }

        if (!character1.isAlive() || !character2.isAlive()) {
            System.out.println("Cannot start the battle, because at least one of opponents is still dead");
        } else {
            while (character1.isAlive() && character2.isAlive()) {
                playFightRound(character1, character2, maximumCriticalDamage);
            }
            defineWinner(character1, character2, winnerBonus);
        }
        System.out.println("\n");
    }
}
