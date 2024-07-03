package units;

public class Actions {


    public void attack(Warrior warrior){
        setStamina(getStamina()-1);
        target.setHealth(getHealth()-1);
        System.out.println(getStamina());
        System.out.println(target.getStamina());

    }

    public void run(){


    }

    public void spell(){

    }

    public void heal(){

    }
}
