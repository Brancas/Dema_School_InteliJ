package units;

public class Mage {

    int damage;
    int health;
    int stamina;
    int mana;
    String name;
    AttackType attackType = AttackType.MAGIC;

    public Mage() {
    }


    public Mage(int damage, int health, int stamina, int mana,String name, AttackType attackType) {
        this.damage = damage;
        this.health = health;
        this.stamina = stamina;
        this.mana = mana;
        this.name = name;
        this.attackType = attackType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public AttackType getAttackType() {
        return attackType;
    }

    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }
}
