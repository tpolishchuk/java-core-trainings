package zhenya.workshop_4;

public class Character {

    //1. private static final int HEALTH_MAXIMUM. It is the maximum value of health for yor character.
    //It will be needed in method for healing your character
    private static final int HEALTH_MAXIMUM = 100;

    //2. string field 'nickname' with private access modifier
    private String nickname;
    //3. field 'characterClass' of type CharacterClass with private access modifier
    private CharacterClass characterClass;
    //4. int field 'level' with private access modifier
    private int level;
    //5. int field 'health' with private access modifier
    private int health;
    //6. int field 'experience' with private access modifier
    private int experience;
    //7. boolean field 'isAlive' with private access modifier
    private boolean isAlive;

    //8. getters and setters for all of fields

    // 9. Constructor, which takes only 2 arguments: String nickname, CharacterClass characterClass. Other fields should be
    // initialized in the following way in constructor:
    // this.level = 0;
    // this.health = HEALTH_MAXIMUM;
    // this.experience = 0;
    // this.isAlive = true;*
    public Character(String nickname, CharacterClass characterClass) {
        this.nickname = nickname;
        this.characterClass = characterClass;
        this.level = 0;
        this.health = HEALTH_MAXIMUM;
        this.experience = 0;
        this.isAlive = true;
    }

    public static int getHealthMaximum() {
        return HEALTH_MAXIMUM;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
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

    //    10. public void method healToMaximum(). This method should:
    //    - set 'isAlive' field to true
    //    - increase health to maximum level
    public void healToMaximum() {
        this.isAlive = true;
        this.health = HEALTH_MAXIMUM;
    }

    //    11. public void method getDamage(). This method should:
    //    - take int argument 'damage'
    //    - decrease health with a damage value
    //    - set 'isAlive' field to false if character has no positive health points left
    public void getDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            isAlive = false;
            health = 0;
        }
    }

    //    12. public void increaseLevel(). This method should:
    //    - update 'level' field of character object
    //    - print to console "Congratulations, %CHARACTER_NICKNAME%, you've reached %CHARACTER_LEVEL% level!"
    public void increaseLevel(int newLevel) {
        level = newLevel;
        System.out.println("Congratulations, " + nickname + ", you've reached " + level + " level!");
    }

    //    13. public void method increaseExperience(). This method should:
    //    - take int argument 'experiencePoints'
    //    - increase character's experience with the value of experiencePoints
    //    - print to condole "%CHARACTER_NICKNAME% got %EXPERIENCE_BONUS_POINTS% experience points. Now experience is %CHARACTER_EXPERIENCE% points"
    //    - increase character level in accordance with level table from beginning of this task
    public void increaseExperience(int experiencePoints) {
        experience += experiencePoints;
        System.out.println(this.nickname + " got " + experiencePoints + " experience points. Now experience is " + experience + " points");

        increaseLevel(experience / 100);
    }
}
