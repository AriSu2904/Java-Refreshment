public class Monster extends BaseAttribute {
    Integer experience = 0;

    public Monster(String name) {
        super(name, 1, 100, 15);
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }
}
