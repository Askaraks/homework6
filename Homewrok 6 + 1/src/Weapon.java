public class Weapon {
    private String typeWeapon;
    private String nameWeapon;


    public Weapon(String typeWeapon, String nameWeapon) {
        this.typeWeapon = typeWeapon;
        this.nameWeapon = nameWeapon;
    }

    public String getTypeWeapon() {
        return typeWeapon;
    }

    public void setTypeWeapon(String typeWeapon) {
        this.typeWeapon = typeWeapon;
    }

    public String getNameWeapon() {
        return nameWeapon;
    }

    public void setNameWeapon(String nameWeapon) {
        this.nameWeapon = nameWeapon;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "typeWeapon='" + typeWeapon + '\'' +
                ", nameWeapon='" + nameWeapon + '\'' +
                '}';
    }
}
