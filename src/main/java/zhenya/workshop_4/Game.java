package zhenya.workshop_4;

import java.util.Random;

public class Game {
    public static void main(){
        playFightRound("BARBARIAN", "BARBARIAN", 40);
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
    private static void playFightRound(Character character1, Character character2, int maximumCriticalDamage){
        if (character1.equals(character2)){
            System.out.println(character1.getCharacterClass() + " cannot attack "+character2.getCharacterClass() + "!");
        } else {
            Random random = new Random();
            int damage = random.nextInt(maximumCriticalDamage) + 1;
            character1.getDamage(damage);
            character2.getDamage(damage);
            if (character1.isAlive()== false){
                System.out.println(character1.getNickname() + " is dead");
            }
            if (character2.isAlive()== false){
                System.out.println(character2.getNickname() + " is dead");
            }
        }
    }
}
