package kateryna.workshop_4;

/**
 * Created by kate on 14.03.17.
 */
public class Character {

//    1. private static final int HEALTH_MAXIMUM. It is the maximum value of health for yor character.
//    It will be needed in method for healing your character
    private static final int HEALTH_MAXIMUM = 1000;

//    2. string field 'nickname' with private access modifier
    private String nickname;

//    3. field 'characterClass' of type CharacterClass with private access modifier
    private CharacterClass characterClass;

//    4. int field 'level' with private access modifier
    private int level;

//    5. int field 'health' with private access modifier
    private int health;

//    6. int field 'experience' with private access modifier
    private int experience;

//    7. boolean field 'isAlive' with private access modifier
    private boolean isAlive;

//    8. getters and setters for all of fields

    public static int getHealthMaximum() {return HEALTH_MAXIMUM;}

    public String getNickname() {return nickname;}

    public void setNickname(String nickname) {this.nickname = nickname;}

    public CharacterClass getCharacterClass() {return characterClass;}

    public void setCharacterClass(CharacterClass characterClass) {this.characterClass = characterClass;}

    public int getLevel() {return level;}

    public void setLevel(int level) {this.level = level;}

    public int getHealth() {return health;}

    public void setHealth(int health) {this.health = health;}

    public int getExperience() {return experience;}

    public void setExperience(int experience) {this.experience = experience;}

    public boolean isAlive() {return isAlive;}

    public void setAlive(boolean alive) {isAlive = alive;}
}
