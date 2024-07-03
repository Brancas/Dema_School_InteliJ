import units.*;

import java.sql.SQLOutput;

public class Main {


    public static void main(String[] args) {
        Warrior War1 = new Warrior(10,10,10,10,"Pablo", AttackType.MELEE);
        Warrior War2 = new Warrior(10,10,10,10,"Roberto",AttackType.MELEE);


        Mage Mag1 = new Mage(10,10,10,10,"Nestor",AttackType.MAGIC);
        Mage Mag2 = new Mage(10,10,10,10,"Gabriel",AttackType.MAGIC);

        Healer Hea1 = new Healer(10,10,10,10,10,"Chizo", AttackType.HEALER);
        Healer Hea2 = new Healer(10,10,10,10,10,"Lucas", AttackType.HEALER);


        Actions.



        War1.attack(War2);









        System.out.println("Specs de los warriors:");
        System.out.println("War1: " + War1.getName()+"\n"
                +"Damage: " + War1.getDamage() +"\n"
                +"Health: " + War1.getHealth()+ "\n"
                +"Stamina: "+ War1.getStamina()+"\n"
                +"Armor: "  + War1.getArmor()+ "\n"
                +"Tipo: "   + War1.getAttackType());

    }
}
