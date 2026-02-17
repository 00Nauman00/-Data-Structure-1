public class Charmandar extends Pokemon {

    public Charmandar () {
        setHp(50);
        setType("Fire");
    }

    public void charDamage (Pokemon Health ){
        int currentHP = Health.getHp();
        Health.setHp(currentHP - 10);
    }
}
