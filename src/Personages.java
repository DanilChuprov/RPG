public abstract class Personages implements Fighter {
    private String name;
    private int hp;
    private int strength;
    private int dexterity;
    private int xp;
    private int gold;

    public Personages(String name, int hp, int strenght, int dexterity, int xp, int gold) {
        this.name = name;
        this.hp = hp;
        this.strength = strenght;
        this.dexterity = dexterity;
        this.xp = xp;
        this.gold = gold;
    }

    @Override
    public int attack() {
        if (dexterity * 3  > getRandomValue())
            return strength;
        else if (dexterity * 3 == getRandomValue())
            return strength * 2;
        else if ((dexterity * 3) - getRandomValue() >= 15)
            return strength * 2;
        else return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return hp;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    private int getRandomValue() {
        return (int) (Math.random() * 10);
    }

    @Override
    public String toString() {
        return String.format("%s здоровье:%d", name, hp);
    }
}
