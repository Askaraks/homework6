public class Boss {
    private int health, damage;
    private String DefenceType;

    public Boss(int health, int damage, String defenceType) {
        this.health = health;
        this.damage = damage;
        DefenceType = defenceType;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDefenceType() {
        return DefenceType;
    }

    public void setDefenceType(String defenceType) {
        DefenceType = defenceType;
    }

    @Override
    public String toString() {
        return "Boss: " +
                "\nhealth=" + health +
                "\ndamage=" + damage +
                " \nDefenceType='" + DefenceType
                ;
    }
}
