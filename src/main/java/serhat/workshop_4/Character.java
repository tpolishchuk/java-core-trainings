package serhat.workshop_4;

/**
 * Created by serhatgemici on 14/02/2017.
 */
public class Character {
    private String nickname;
    private int level;
    private int health;
    private int experience;
    boolean isAlive;
    private CharacterClass characterClass;
    private static final int HEALTH_MAXIMUM = 300;


    public static int getHealthMaximum() {
        return HEALTH_MAXIMUM;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public Character(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public Character(String nickname, CharacterClass characterClass) {

        this.nickname = nickname;
        this.characterClass = characterClass;
        this.level = 0;
        this.health = HEALTH_MAXIMUM;
        this.experience = 0;
        this.isAlive = true;
    }

    public void healToMaximum() {
        isAlive = true;
        health = HEALTH_MAXIMUM;
    }

    public void getDamage(int damage) {
        health -= damage;
        System.out.println("Character " + this.getNickname() + " received damage " + damage +". Health left: " + health);

        if (health < 0) {
            isAlive = false;
        }
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void increaseLevel(int level) {

        this.level = level;
        System.out.println("Congratulations, " + this.nickname + ", you've reached " + this.level + " level!");

    }

    public void increaseExperience(int experiencePoints) {
        experience += experiencePoints;
        System.out.println(this.nickname + " got " + experiencePoints + " experience points. Now experience is " + experience + " points \n");
        if (experience == 0) {
            this.experience = 0;
        } else if (experience >= 100 || experience < 200) {
            this.experience = 1;
        } else if (experience >= 200 || experience < 300) {

            this.experience = 2;
        } else if (experience >= 300 || experience < 400) {

            this.experience = 3;
        } else if (experience >= 300 || experience < 400) {

            this.experience = 4;
        } else if (experience >= 400 || experience < 500) {

            this.experience = 5;
        }

    }

}
