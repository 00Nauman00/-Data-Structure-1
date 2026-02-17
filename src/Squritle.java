public class Squritle extends Pokemon {

    public Squritle () {
        setHp(60);
        setType("Water");
    }

    public void squDamage (Pokemon Health) {
        int currentHp = Health.getHp();
        Health.setHp(currentHp - 20);
    }
}