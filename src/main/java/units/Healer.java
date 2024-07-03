package units;

public class Healer {
    int damage;
    int health;
    int stamina;
    int healingPower;
    int mana;
    String name;
    AttackType attackType = AttackType.HEALER;


    public Healer() {
    }


    public Healer(int damage, int health, int stamina, int healingPower, int mana,String name, AttackType attackType) {
        this.damage = damage;
        this.health = health;
        this.stamina = stamina;
        this.healingPower = healingPower;
        this.mana = mana;
        this.name = name;
        this.attackType = attackType;
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

    public int getHealingPower() {
        return healingPower;
    }

    public void setHealingPower(int healingPower) {
        this.healingPower = healingPower;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
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

