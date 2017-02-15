package serhat.workshop_4;

import org.apache.commons.lang.math.RandomUtils;

/**
 * Created by serhatgemici on 15/02/2017.
 */
public class Game {

    public static void main(String[] args){

        Character alice = new Character("Alice", CharacterClass.MONK);
        Character bob = new Character("Bob", CharacterClass.BARBARIAN);

        fightToDeath(alice, bob, 50, 120);
        alice.healToMaximum();
        bob.healToMaximum();

        fightToDeath(alice, bob, 50, 120);
        alice.healToMaximum();
        bob.healToMaximum();

    }

    private static void playFightRound(Character character1, Character character2, int maximumCriticalDamage){

        if(character1.getCharacterClass().name().equals(character2.getCharacterClass().name()) ){
            
            throw new IllegalArgumentException( character1.getCharacterClass().name() + " cannot attack " + character2.getCharacterClass().name() + "!");

        }
        else{
            int damage1 = RandomUtils.nextInt(maximumCriticalDamage);
            character1.getDamage(damage1);
            int damage2 = RandomUtils.nextInt(maximumCriticalDamage);
            character2.getDamage(damage2);
            if(character1.isAlive()==false)
            {
                System.out.println( character1.getNickname() +" is dead");
            }
            if(character2.isAlive()==false)
            {
                System.out.println( character2.getNickname() +" is dead");
            }
        }
    }

    private static void defineWinner(Character character1, Character character2, int winnerBonus){

            if ((character1.isAlive() == true) && (character2.isAlive() == false)){

                character1.increaseExperience(winnerBonus);

            }
            else if ((character1.isAlive() == false) && (character2.isAlive() == true)){

                character2.increaseExperience(winnerBonus);

            }
            else System.out.println("Both characters are dead. Nobody receives winner bonus \n");
    }

    private static void fightToDeath(Character character1, Character character2, int maximumCriticalDamage, int winnerBonus){

        System.out.println("Fight starts! " + character1.getNickname() + " vs " + character2.getNickname());

        if((character1.isAlive() == false)  ||  (character2.isAlive() == false)){

            System.out.println("Cannot start the battle, because at least one of opponents is still dead \n");
            return;
        }

        while(true){

            if((character1.isAlive() == true)  &&  (character2.isAlive() == true)) {

                playFightRound(character1, character2, maximumCriticalDamage);

            }
            else if ((character1.isAlive() == false)  ||  (character2.isAlive() == false)){

                defineWinner(character1, character2, winnerBonus);
                break;

            }
        }
    }
}
