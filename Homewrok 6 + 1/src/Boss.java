public class Boss extends GameEntity {
    Weapon weapon;

    public Boss(int damage, int health, String names, Weapon weapon) {
        super(damage, health, names);
        this.weapon = weapon;
    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "weapon=" + weapon +
                ", damage=" + damage +
                ", health=" + health +
                ", names='" + names + '\'' +
                '}';
    }
}
