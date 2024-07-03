package units;

public class Warrior {

    int damage;
    int health;
    int stamina;
    int armor;
    String name;
    AttackType attackType;

    //CREATING OBJECTS WARRIORS
    public Warrior() {
    }

    public Warrior(int damage, int health, int stamina, int armor, String name, AttackType attackType) {
        this.damage = damage;
        this.health = health;
        this.stamina = stamina;
        this.armor = armor;
        this.name = name;
        this.attackType = attackType;
    }


    //GETTER & SETTERS
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AttackType getAttackType() {
        return attackType;
    }

    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }
}
