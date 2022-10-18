public class GameEntity {
    int damage, health;
    String names;

    public GameEntity(int damage, int health, String names) {
        this.damage = damage;
        this.health = health;
        this.names = names;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }
}
