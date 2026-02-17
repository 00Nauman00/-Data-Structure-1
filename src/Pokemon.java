public class Pokemon implements Comparable{
    private int hp;
    private String type;

    public void setType(String Type){

        type = Type;
    }
    public String getType() {

        return type;
    }
    public void setHp(int health) {

        hp = health;
    }
    public int getHp () {

        return hp;
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }
    public Object CompareTo(Object obj)  {
        Pokemon pkom  = (Pokemon) obj;
        if (hp >pkom.hp){
            return this +" has more hp than "+ pkom;
        }else if (hp <pkom.hp){
            return this +" has less hp than "+ pkom;
        }else {
            return "Both have equal hp";
        }
    }
}
