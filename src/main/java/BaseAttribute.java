public class BaseAttribute {
    String name;
    Integer level;
    Integer health;
    Integer attack;

    public BaseAttribute(String name, Integer level, Integer health, Integer baseAttack) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.attack = baseAttack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level += level;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack += attack;
    }
}
