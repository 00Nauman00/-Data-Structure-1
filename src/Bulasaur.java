public class Bulasaur extends Pokemon {

    public Bulasaur () {
        setHp(70);
        setType("Grass");
    }

    public void bulDamage(Pokemon health) {
        int currentHp = health.getHp();
        health.setHp(currentHp -20);
    }
}