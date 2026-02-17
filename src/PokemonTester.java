public class PokemonTester {
    public static void main (String [] args){

        Charmandar cha = new Charmandar();
        Squritle squ = new Squritle();
        Bulasaur bul = new Bulasaur();

        System.out.println("Starting HPs");
        System.out.println("Charmandar HP: "+cha.getHp());
        System.out.println("Squritle HP: "+squ.getHp());
        System.out.println("Bulbasaur HP: "+bul.getHp());


        bul.bulDamage(cha);
        System.out.println("Charmandar HP: "+cha.getHp());

        bul.bulDamage(squ);
        System.out.println("Squritle HP: "+squ.getHp());

        squ.squDamage(cha);
        System.out.println("Charmandar HP: "+cha.getHp());

        squ.squDamage(bul);
        System.out.println("Bulbasaur HP: "+bul.getHp());

        cha.charDamage(bul);
        System.out.println("Bulbasaur HP: "+bul.getHp());

        cha.charDamage(squ);
        System.out.println("Squritle HP: "+squ.getHp());

        System.out.println( cha.CompareTo(squ));
        System.out.println( cha.CompareTo(bul));
        System.out.println( squ.CompareTo(bul));
    }
}
